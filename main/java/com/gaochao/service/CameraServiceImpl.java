package com.gaochao.service;

import com.gaochao.bean.Camera;
import com.gaochao.dao.CameraDao;
import com.gaochao.redis.RedisCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by smileMAC on 18/4/25.
 */
@Service
@Transactional
public class CameraServiceImpl{

    @Resource
    private CameraDao cameraDao;


    @Autowired
    private RedisCacheManager redisCacheManager;

    public List<Camera> getList(){
        System.out.println("cameraDao.getList");
        List<Camera> cameraList = (List<Camera>) redisCacheManager.get("getCameraList");
        if(cameraList == null){
            System.out.println("查询一次数据库");
            cameraList = cameraDao.getList();
            redisCacheManager.set("getCameraList",cameraList,60);
        }
        return cameraList;
    }

    public Camera getCameraById(int id){
        return cameraDao.getCameraById(id);
    }

    public void updateCameraById(int id,String name){
        int i = cameraDao.updateCameraById(id,name);
        throw new RuntimeException("数据库处理失败");
    }
}
