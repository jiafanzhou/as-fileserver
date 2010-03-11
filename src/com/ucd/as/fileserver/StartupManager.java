package com.ucd.as.fileserver;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * Responsible for startup activities: 
 * <li> announce itself to other potentially active servers
 * <li>	wait for replies from other active servers
 * <li> ...tbd...
 * 
 * 
 * @author ttreitlinger
 *
 */
public class StartupManager implements  ServletContextListener {

	private static Logger logger = Logger.getLogger(StartupManager.class);

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		logger.info("Exit contextDestroyed");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		logger.info("Enter contextInitialized...");
		
		/* add some test data */
		ResourceManager rm = ResourceManager.INSTANCE;				
		Date now = new Date();
		
		rm.addServer("dummy server 1");
		rm.addServer("dummy server 2");
		rm.addServer("dummy server 3");
		
		rm.addFile(new File("filename 1.txt", 12345L, now, now));
		rm.addFile(new File("filename 2.jpg", 23456L, now, now));
		rm.addFile(new File("filename 3.doc", 34567L, now, now));
		
		logger.info("Exit contextInitialized");
		
	}

	
}
