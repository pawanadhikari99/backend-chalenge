package com.web.controller.vo;

import java.util.Date;

import lombok.Data;

@Data
public class DependentVO {
	private int id;
	private int enrolleesId;
	private String name;
	private Date dob;
	public Integer getEnrolleesId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
