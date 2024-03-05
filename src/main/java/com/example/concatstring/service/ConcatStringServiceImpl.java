package com.example.concatstring.service;

import org.springframework.stereotype.Service;

@Service
public class ConcatStringServiceImpl implements ConcatStringService {

	@Override
	public String concat(String value1, String value2) {
		String result = value1.concat(" ").concat(value2);
		return result;
	}

}
