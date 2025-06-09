package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cust") // 이거 없으면 테이블명 = 클래스명
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 20, nullable = false)
	private String name;
	
	@Column(length = 20, nullable = false, unique = true)
	private String phone;
	
	public Customer(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "rdt")
	private Date reg_date;
	
	@Transient
	private String desc;
}