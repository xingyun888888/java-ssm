package com.gaochao.dao;

import com.gaochao.bean.Brand;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by smileMAC on 4/21/18.
 */
@Component
public interface BrandDao {
    List<Brand> getBrandList(Brand brand);
}
