package com.in28minutes.articlesview;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.todo.Todo;

public class ArticleService {
	private static List<Article> articles = new ArrayList<Article>();
	static {
		for(int i = 1; i <= 100; i++)
		articles.add(new Article("RugbyArticle", "Sport"));	
	}

	public static List<Article> retrieveArticles() {
		return articles;
	}

	public static void addArticle(Article article) {
		articles.add(article);
	}

	public void deleteArticle(Article article) {
		articles.remove(article);
	}

}

