package com.in28minutes.articlesview;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet("/list-articles.do")
public class ListArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArticleService articleService = new ArticleService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("articles", ArticleService.retrieveArticles());
		request.getRequestDispatcher("/WEB-INF/views/list-articles.jsp").forward(request, response);
	}

}
