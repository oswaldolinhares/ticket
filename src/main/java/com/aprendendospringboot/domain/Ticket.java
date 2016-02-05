package com.aprendendospringboot.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//@Entity - Anotação do JPA que marca classe como uma Entidade
@Entity
public class Ticket {
	@Id
	@GeneratedValue
	private int code;
	private Date creation;
	private int priority;
	private int description;
	
	@ManyToOne
	private Account account;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getDescription() {
		return description;
	}

	public void setDescription(int description) {
		this.description = description;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Ticket [code=" + code + ", creation=" + creation
				+ ", priority=" + priority + ", description=" + description
				+ ", account=" + account + "]";
	}
	

	

}
