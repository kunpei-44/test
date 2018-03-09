package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class GoHomeAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute(){
		return SUCCESS;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

	@Override
	public void setSession (Map<String, Object> session){
		this.session = session;
	}

}
