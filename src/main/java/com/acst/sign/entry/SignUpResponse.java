package com.acst.sign.entry;

import com.acst.commons.entry.Status;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "signUpResponse")
public class SignUpResponse {

	private Status status;
	private SignUpEntry signUpEntry;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public SignUpEntry getSignUpEntry() {
		return signUpEntry;
	}

	public void setSignUpEntry(SignUpEntry signUpEntry) {
		this.signUpEntry = signUpEntry;
	}
}
