package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class CustomerServiceTest {
	
	@Autowired
	CustomerService customerService;
	
	//@Test
	public void 등록() {
		CustomerVO vo = new CustomerVO();
		vo.setUserid("Ekdzhd");
		vo.setName("김땅콩");		
		int result = customerService.insert(vo);
		List<CustomerVO> list= customerService.findAll();
		assertEquals("김땅콩", list.get(0).getName());
	}
	
	//@Test
	public void 수정() {
		// 단건조회
		CustomerVO vo = customerService.findById(1L);
		vo.setName("김치즈");
		customerService.update(vo);
	}
	
//	@Test
//	@Transactional
//	@Rollback // default는 commit임
	public void 삭제() {
		Long id = 1L;
		customerService.delete(id);
	}

}
