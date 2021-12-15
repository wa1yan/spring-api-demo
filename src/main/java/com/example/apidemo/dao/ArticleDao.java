package com.example.apidemo.dao;

import com.example.apidemo.ds.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends CrudRepository<Article,Integer> {

}
