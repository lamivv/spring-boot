package com.example.demo.service;

import java.util.List;

public interface EmpService {
	public EmpVO getEmp(EmpVO empVO);

	public List<EmpVO> getEmpList();

	public void empInsert(EmpVO empVO);

}
