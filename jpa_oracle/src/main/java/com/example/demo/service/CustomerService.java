package com.example.demo.service;

import java.util.List;

public interface CustomerService {
	//전체조회
	List<CustomerVO> findAll();
	//단건조회
	CustomerVO findById(Long id);
	
	//등록
	int insert(CustomerVO vo);
	
	//수정
	int update(CustomerVO vo);
	
	//삭제
	int delete(Long id);
}	
