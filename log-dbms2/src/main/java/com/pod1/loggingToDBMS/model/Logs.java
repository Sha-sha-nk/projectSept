package com.pod1.loggingToDBMS.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGS")
public class Logs {
//	USER_ID VARCHAR(20)    NOT NULL,
//    DATED   DATE           NOT NULL,
//    LOGGER  VARCHAR(50)    NOT NULL,
//    LEVEL   VARCHAR(10)    NOT NULL,
//    MESSAGE VARCHAR(1000)  NOT NULL
	@Id
    private int user_id;
    private Date dated;
    private String logger;
    private String level;
    private String message;
    
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getDated() {
		return dated;
	}
	public void setDated(Date dated) {
		this.dated = dated;
	}
	public String getLogger() {
		return logger;
	}
	public void setLogger(String logger) {
		this.logger = logger;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Logs [user_id=" + user_id + ", dated=" + dated + ", logger=" + logger + ", level=" + level
				+ ", message=" + message + "]";
	}
    
	
    
}
