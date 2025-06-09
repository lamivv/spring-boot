package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository //==mapperIntergace와 같은 역할 //@Controller @Service
public interface CustomerRepository extends JpaRepository<Customer, Long>{ // 클래스명 ,기본키 타입

	
}
