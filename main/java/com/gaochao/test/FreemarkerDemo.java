package com.gaochao.test;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by smileMAC on 18/4/24.
 */
public class FreemarkerDemo implements ServletContextAware {
    //搭建Freemarker
    public static void main(String[] args){
        //配置对象
//        Configuration configuration = new Configuration();
//        configuration.setDirectoryForTemplateLoading(new File("/WEB-INF/front_page"));
//        Template template  = configuration.getTemplate("index.html");
////        数据是Map类型的
//        Map root = new HashMap();
//        Writer out = new FileWriter(new File(Thread.currentThread().getContextClassLoader().getResource("").getPath()+"/WEB-INF/front_page/hello.html"));
//        template.process(root,out);

        FreemarkerDemo freemarkerDemo = new FreemarkerDemo();
        System.out.println(freemarkerDemo.servletContext.getRealPath("static"));
    }

    private ServletContext servletContext;

    @Override
    public void setServletContext(ServletContext servletContext) {
       this.servletContext = servletContext;
    }
}
