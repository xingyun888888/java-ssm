package com.gaochao.service;

import com.gaochao.bean.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by smileMAC on 4/21/18.
 */
public class BrandServceImpl {

    @Transactional(readOnly = true)
    public List<Brand> getBrandListWithPage(Brand brand){

      return null;
    }
}
