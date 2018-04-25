package com.gaochao.dao;

import com.gaochao.bean.Camera;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by smileMAC on 18/4/25.
 */
@Repository
public interface CameraDao {
    List<Camera> getList();
    Camera getCameraById(int id);
}
