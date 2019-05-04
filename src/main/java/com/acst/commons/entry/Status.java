package com.acst.commons.entry;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "status")
public class Status {

	private int statusCode;
	private String statusMessage;
	private String state;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
