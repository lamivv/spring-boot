package com.example.demo.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDTO {
	private final String name;
	private final int amount;
}
