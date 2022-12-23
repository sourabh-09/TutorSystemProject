package com.cjc.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	private int bid;
	private int pid;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", pid=" + pid + "]";
	}
	public Booking(int bid, int pid) {
		super();
		this.bid = bid;
		this.pid = pid;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
