package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
	
	private final CustomerRepository customerRepository;

	@Override
	public List<CustomerVO> findAll() {
		List<Customer> list = customerRepository.findAll();
		List<CustomerVO> listVO = new ArrayList<CustomerVO>();
		for(Customer cust : list ) {
			listVO.add(new CustomerVO(cust));
		}
		return listVO;
		//return list.stream().map(cust -> new CustomerVO(cust)).collect(Collectors.toList());
	}

	@Override
	public CustomerVO findById(Long id) {
		Optional<Customer> cust = customerRepository.findById(id);
		return new CustomerVO(cust.get());
	}

	@Override
	public int insert(CustomerVO vo) {
		Customer customer = customerRepository.save(vo.toEntity());
		return customer != null ? customer.getId().intValue() : 0;
	}

	@Override
	public int update(CustomerVO vo) {
		Customer customer = customerRepository.save(vo.toEntity());
		return customer != null ? customer.getId().intValue() : 0;
	}

	@Override
	public int delete(Long id) {
		Optional<Customer> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			customerRepository.deleteById(id);
			return 1;
		} else {
			return 0;		
		}
	}

}
