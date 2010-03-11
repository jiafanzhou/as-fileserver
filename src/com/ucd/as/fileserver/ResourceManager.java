package com.ucd.as.fileserver;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * This class manages 
 * <li> the list of servers in the system
 * <li> the list of files 
 * 
 * @author ttreitlinger
 *
 */
public enum ResourceManager {
	INSTANCE;

	private static Logger logger = Logger.getLogger(ResourceManager.class);

	private List<File> fileList = new LinkedList<File>();
	private List<String> serverList = new LinkedList<String>();
	
	public void addServer(String server){		
		serverList.add(server);
		logger.info("Server added: " + server);
	}
	
	public void addFile(File file){
		fileList.add(file);
		logger.info("File added: " + file);
	}
	
	public List<File> getFileList() {
		return fileList;
	}
	
	public List<String> getServerList() {
		return serverList;
	}
	

}
