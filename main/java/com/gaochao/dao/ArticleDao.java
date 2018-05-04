package com.gaochao.dao;

import com.gaochao.bean.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by smileMAC on 18/4/29.
 */
@Repository
public interface ArticleDao{
    int add(Article article);
    Article getArticleById(int id);
    List<Article> getList(String author);
    void updateArticle(Article article);
    void deleteById(int id);
}
