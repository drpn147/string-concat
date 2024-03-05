package com.example.concatstring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.concatstring.service.ConcatStringService;

@RestController
public class ConcatStringServiceController {

	@Autowired
	ConcatStringService concatstringservice;

	@PostMapping("concat")
	public String concatString(@RequestParam(value = "data1") String value1,
			@RequestParam(value = "data2") String value2) {
		String result = concatstringservice.concat(value1, value2);
		return result;
	}
}
