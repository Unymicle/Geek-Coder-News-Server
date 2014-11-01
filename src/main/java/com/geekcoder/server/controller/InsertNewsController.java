package com.geekcoder.server.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.geekcoder.server.dao.DAOFactory;
import com.geekcoder.server.model.News;

public class InsertNewsController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int cid = Integer.parseInt(request.getParameter("cid"));
		String title = request.getParameter("title");
		String keywords = request.getParameter("keywords");
		String description = request.getParameter("description");
		int status = Integer.parseInt(request.getParameter("status"));
		String summary = request.getParameter("summary");
		int published = Integer.parseInt(request.getParameter("published"));
		int updateTime = Integer.parseInt(request.getParameter("updateTime"));
		String content = request.getParameter("content");
		int aid = Integer.parseInt(request.getParameter("aid"));
		News news = new News();
		news.setCid(cid);
		news.setTitle(title);
		news.setKeywords(keywords);
		news.setDescription(description);
		news.setStatus(status);
		news.setSummary(summary);
		news.setPublished(published);
		news.setUpdateTime(updateTime);
		news.setContent(content);
		news.setAid(aid);
		DAOFactory.getNewsDAOInstance().insert(news);
		return null;
	}
}
