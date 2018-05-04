package com.gaochao.controller.admin;

import com.gaochao.bean.Article;
import com.gaochao.service.ArticleServiceImpl;
import com.gaochao.util.FastDFSFile;
import com.gaochao.util.FastDFSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by smileMAC on 18/4/29.
 */
@Controller
@RequestMapping(value="/admin/")
public class ArticleController implements ServletContextAware {

    @Autowired
    private ArticleServiceImpl articleService;


    private ServletContext servletContext;
    /**
     * 获取用户对应的文章列表
     * @return
     */
    @RequestMapping(value="get_article_list.action",method = RequestMethod.GET)
    @ResponseBody
    public Map getList(){
        List<Article> list = articleService.getList();
        Map map  = new HashMap();
        map.put("data",list);
        return  map;
    }


    /**
     *
     * @param file
     * @param httpServletRequest
     * @return
     * @throws IOException
     */
    @RequestMapping(value="upload_img.action",method = RequestMethod.POST)
    @ResponseBody
    public String uploadImg(MultipartFile file, HttpServletRequest httpServletRequest) throws IOException {

        try {
            FastDFSFile fastDFSFile = new FastDFSFile(file.getBytes(), file.getOriginalFilename(), file.getSize());
            String path = FastDFSUtil.uploadFile(fastDFSFile);
            return "www.adding360.com/"+ path;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //        String imagePath = "";
//        if(!file.isEmpty()){
//          String path = getPath("static")+"/images/";
//          File newFile = new File(path,file.getOriginalFilename());
//          file.transferTo(newFile);
//          imagePath = "http://localhost:8081/static/images/"+file.getOriginalFilename();
//        }
        return null;
    }


    /**
     * 根据id查出文章详情
     * @param id
     * @return
     */
    @RequestMapping(value = "getArticleById.action",method = RequestMethod.GET)
    @ResponseBody
    public Article getArticleById(@RequestParam(name = "id") int id){
         return articleService.getArticleById(id);
    }


    /**
     * 添加文章
     */
    @RequestMapping(value="add_article.action",method = RequestMethod.POST)
    @ResponseBody
    public void add(@RequestBody Article article){
        articleService.add(article);
    }


    @RequestMapping(value = "/updateArticle.action",method = RequestMethod.POST)
    @ResponseBody
    public void update(Article article){
       articleService.updateArticle(article);
    }

    @RequestMapping(value="/deleteArticleById.action",method = RequestMethod.POST)
    @ResponseBody
    public void deleteById(@RequestParam(name="id") int id){
        articleService.deleteById(id);
    }

    private String getPath(String path){
        return servletContext.getRealPath(path);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
