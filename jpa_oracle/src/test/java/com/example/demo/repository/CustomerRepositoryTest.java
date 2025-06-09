package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Customer;

@SpringBootTest
public class CustomerRepositoryTest {
	@Autowired
	CustomerRepository repo;
	
	@Transactional
	@Rollback
	@Test
	public void 검색() {
		repo.save(Customer.builder().userid("rla").name("김땅콩").phone("123").build());
		repo.save(Customer.builder().userid("Ekd").name("김치즈").phone("456").build());
		repo.save(Customer.builder().userid("zhd").name("냐옹이다옹").phone("789").build());
		//List<Customer> list = repo.findByNameLike("%김%");
		//List<Customer> list = repo.findByName("김땅콩");
		List<Customer> list = repo.findByNameOrPhone("김치즈", "789");
		List<Customer> list2 = repo.findByNameOrderByPhoneDesc("김땅콩");
		assertEquals(list.size(), 2);
	}
}
