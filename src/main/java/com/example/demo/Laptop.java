package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int lid;
	private String brname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrname() {
		return brname;
	}
	public void setBrname(String brname) {
		this.brname = brname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brname=" + brname + "]";
	}
	public void compile() {
		System.out.println("Compiling...");
	}
}
