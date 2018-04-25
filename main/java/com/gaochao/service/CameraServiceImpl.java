package com.gaochao.service;

import com.gaochao.bean.Camera;
import com.gaochao.dao.CameraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by smileMAC on 18/4/25.
 */
@Service
public class CameraServiceImpl {

    @Resource
    private CameraDao cameraDao;

    public List<Camera> getList(){
        System.out.println("cameraDao.getList");
        return cameraDao.getList();
    }

    public Camera getCameraById(int id){
        return cameraDao.getCameraById(id);
    }
}
