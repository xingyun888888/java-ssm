package com.gaochao.shiro.realm;

import com.gaochao.bean.User;
import com.gaochao.dao.UserDao;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static com.mpush.tools.config.CC.mp.redis.password;

/**
 * Created by smileMAC on 18/4/28.
 */
public class CustomRealm extends AuthorizingRealm {



    @Autowired
    private UserDao userDao;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String userName = (String) principalCollection.getPrimaryPrincipal();
//        从数据库或者缓存中获取角色数据
        Set<String> roles = getRolesByUserName(userName);
        for(Object o : roles){
            System.out.println(o);
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);

        return simpleAuthorizationInfo;
    }


//    private List<String> getPermissionsByUserName(String name){
//        Set<String> sets = new HashSet<>();
//        sets.add("user:delete");
//        sets.add("user:add");
//        return sets;
//    }
    private Set<String> getRolesByUserName(String name){
        List<User> userList = userDao.getUserByUserName(name);
        List<String> list = new ArrayList<>();

        for(User user:userList){
            list.add(user.getRole());
        }
        Set<String> sets = new HashSet<>(list);
        return sets;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        /**从主题传过来的认证信息中获得用户名**/
        String name = (String) authenticationToken.getPrincipal();

        System.out.println(name);

        /**通过用户名导数据库中获取凭证**/
        String password = getPasswordByUserName(name);

        if(password==null){
            return null;
        }

        System.out.println(password);

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(name,password,"customRealm");

        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes("Mark"));



        return authenticationInfo;
    }

    private String getPasswordByUserName(String name){
        List<User> userList = userDao.getUserByUserName(name);
        if(CollectionUtils.isEmpty(userList)){
            return null;
        }
        return userList.get(0).getPassword();
    }
    public static  void main(String[] args){
        Md5Hash md5Hash =  new Md5Hash("123456","Mark");
        System.out.println(md5Hash);
    }
}
