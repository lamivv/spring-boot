package com.example.demo.mapper;

import java.util.List;

import com.example.demo.service.EmpVO;

public interface EmpMapper {

	public EmpVO getEmp(EmpVO empVO);

	public List<EmpVO> getEmpList();

	public void empInsert(EmpVO empVO);

}
