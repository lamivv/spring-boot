package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	// long 이 아니라 Long으로 작성. ex) int => Integer 같이 primitive형식 사용못함
	public List<Customer> findByName(String name);

	public List<Customer> findByPhone(String phone);
	
	public List<Customer> findByNameOrPhone(String name, String phone);

	public List<Customer> findByNameOrderByPhoneDesc(String name);
	// like검색도 가능
	public List<Customer> findByNameLike(String keyword);
}
