package com.ucd.as.fileserver;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ListServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static DateFormat dateFormatter = new SimpleDateFormat("d MMM yyyy HH:mm:ss");
	private static Logger logger = Logger.getLogger(IndexServlet.class);

    /**
     * Default constructor. 
     */
    public IndexServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("enter doGet...");
		
		/* get current time */
		String currentTime = dateFormatter.format(new Date());
		request.setAttribute("currentTime", currentTime);
		
		/* get list of servers and attach to request*/
		List<String> serverList = ResourceManager.INSTANCE.getServerList();
		request.setAttribute("serverList", serverList);
		
		/* forward request to the view for rendering */
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("enter doPost...");

	}

}
