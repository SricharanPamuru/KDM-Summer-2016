package com.in28minutes.articlesview;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewArticleServlet
 */
@WebServlet("/ViewArticleServlet.do")
public class ViewArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArticleService article = new ArticleService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String value = request.getParameter("name");
		switch (value) {
		case ("cricket"):
			request.getRequestDispatcher("/WEB-INF/views/cricketarticle.jsp").forward(request, response);
			break;
		case ("rugby"):
			request.getRequestDispatcher("/WEB-INF/views/rugbyarticle.jsp").forward(request, response);
			break;
		case ("tennis"):
			request.getRequestDispatcher("/WEB-INF/views/tennisarticle.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}