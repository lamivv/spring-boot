package com.example.demo.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private int salary;
	private int commissionPct;
	private int managerId;
	private int departmentId;
}
