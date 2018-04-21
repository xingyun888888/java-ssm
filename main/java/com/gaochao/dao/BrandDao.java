package com.gaochao.dao;

import com.gaochao.bean.Brand;

import java.util.List;

/**
 * Created by smileMAC on 4/21/18.
 */
public interface BrandDao {
    public List<Brand> getBrandList(Brand brand);
}
