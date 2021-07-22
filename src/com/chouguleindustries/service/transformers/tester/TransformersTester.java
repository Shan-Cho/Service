package com.chouguleindustries.service.transformers.tester;

import com.chouguleindustries.service.transformers.dto.TransformerDTO;
import com.chouguleindustries.transformers.service.TransformersService;
import com.chouguleindustries.transformers.service.TransformersServiceImpl;

public class TransformersTester {

	public static void main(String[] args) {

		TransformerDTO dto = new TransformerDTO("Shantanu", "Sangli", "Naughty", "Sometimes", "Always", "Ocassionally");

		TransformersService service = new TransformersServiceImpl();
		boolean save = service.validateAndSave(dto);
		System.out.println(save);
	}
}
