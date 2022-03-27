package com.jhs.exam.jpaBoard.article.dao;

import com.jhs.exam.jpaBoard.article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
