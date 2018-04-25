package com.gaochao.service;

import com.gaochao.bean.Brand;
import com.gaochao.dao.BrandDao;
import freemarker.template.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.servlet.ServletContext;
import java.util.List;


/**
 * Created by smileMAC on 4/21/18.
 */

@Service
public class BrandServceImpl implements BrandService,ServletContextAware{

    static  {


    }


    public BrandServceImpl() {
        System.out.println("dsfsdf.");
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }


    private Configuration configuration;
//
//
    @Autowired
    private BrandDao brandDao;


    public FreeMarkerConfigurer getFreeMarkerConfigurer() {
        return freeMarkerConfigurer;
    }

    public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
        this.freeMarkerConfigurer = freeMarkerConfigurer;
    }

    //    @Autowired
//    @Qualifier("freeMarkerConfigurer")
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Transactional(readOnly = true)
    public String getBrandListWithPage(Brand brand){
//        Configuration configuration = freeMarkerConfigurer.getConfiguration();
      return "hahhahah";
    }

    //静态化方法
    public void productIndex(){
       this.configuration = freeMarkerConfigurer.getConfiguration();
    }

    private ServletContext servletContext;

//    获取路径

    public String getPath(String name){
        return servletContext.getRealPath(name);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
       this.servletContext = servletContext;
    }
}
