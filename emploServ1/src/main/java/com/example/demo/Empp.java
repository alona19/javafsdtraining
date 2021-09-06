package com.example.demo;

import java.util.List;

public class Empp {
	List<Emp> emp;

	public Empp(List<Emp> emp) {
		super();
		this.emp = emp;
	}

	public List<Emp> getemp() {
		return emp;
	}

	public Empp() {
		super();
	}

	public void setemp(List<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "emprs [emp=" + emp + "]";
	}
	

}
