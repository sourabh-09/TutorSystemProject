package com.cjc.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tutor {

	@Id
	private int tid;
	private String tname;
	private String subject;
	private String username;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Booking> showbookings;
	
	public List<Booking> getShowbookings() {
		return showbookings;
	}
	public void setShowbookings(List<Booking> showbookings) {
		this.showbookings = showbookings;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Tutor [tid=" + tid + ", tname=" + tname + ", subject=" + subject + ", username=" + username
				+ ", password=" + password + ", showbookings=" + showbookings + "]";
	}
	public Tutor(int tid, String tname, String subject, String username, String password, List<Booking> showbookings) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
		this.username = username;
		this.password = password;
		this.showbookings = showbookings;
	}
	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
