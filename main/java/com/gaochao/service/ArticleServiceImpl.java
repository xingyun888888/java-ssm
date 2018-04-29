package com.gaochao.service;

import com.gaochao.bean.Article;
import com.gaochao.dao.ArticleDao;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by smileMAC on 18/4/29.
 */

@Service
public class ArticleServiceImpl {

    @Autowired
    private ArticleDao articleDao;


    public String getUserName(){
        return (String) SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 查询所有文章列表
     * @return
     */
    public List<Article> getList(){
        return articleDao.getList(getUserName());
    }


    /**
     * 根据id获取文章内容
     * @param id
     * @return
     */
    public Article getArticleById(int id){
        return articleDao.getArticleById(id);
    }


    /**
     * 添加文章
     * @param title
     * @param summary
     * @param content
     * @return
     */
    public int add(String title,String summary,String content){

       System.out.println(SecurityUtils.getSubject().getPrincipal());

       String author = getUserName();

       SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

       String create_time = sdf.format(new Date());

       String update_time = create_time;

       Map map = new HashMap<>();

       map.put("title",title);
       map.put("summary",summary);
       map.put("content",content);
       map.put("author",author);
       map.put("create_time",create_time);
       map.put("update_time",create_time);

       return articleDao.add(map);
    }


    public void updateArticle(Article article){
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        article.setUpdate_time(sdf.format(new Date()));
        articleDao.updateArticle(article);
    }


    public void deleteById(int id){
        articleDao.deleteById(id);
    }
}
