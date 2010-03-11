package com.ucd.as.fileserver;

import java.util.Date;

/**
 * This class has information about a file which is stored in the fileserver
 * 
 * @author ttreitlinger
 *
 */
public class File {

	private String name;
	private long bytes;
	private Date created;
	private Date lastUpdated;
	
	@SuppressWarnings("unused")
	private File(){}
	
	public File(String name, long bytes, Date created,
			Date lastUpdated) {
		super();
		this.name = name;
		this.bytes = bytes;
		this.created = created;
		this.lastUpdated = lastUpdated;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBytes() {
		return bytes;
	}
	public void setBytes(long bytes) {
		this.bytes = bytes;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	@Override
	public String toString() {
		return "File [bytes=" + bytes + ", created=" + created
				+ ", lastUpdated=" + lastUpdated + ", name=" + name + "]";
	}
	
}
