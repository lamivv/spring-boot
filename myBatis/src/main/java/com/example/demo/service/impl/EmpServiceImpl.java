package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmpServiceImpl implements EmpService{
	
	private final EmpMapper empMapper;

	@Override
	public EmpVO getEmp(EmpVO empVO) {
		
		return empMapper.getEmp(empVO);
	}

	@Override
	public List<EmpVO> getEmpList() {
		
		return empMapper.getEmpList();
	}

	@Override
	public void empInsert(EmpVO empVO) {
		empMapper.empInsert(empVO);
	}

}
