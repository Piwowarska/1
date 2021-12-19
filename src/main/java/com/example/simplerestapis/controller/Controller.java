package com.example.simplerestapis.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplerestapis.models.AddItem;
import com.example.simplerestapis.models.AddItemRequest;
import com.example.simplerestapis.models.GetItem;

@RestController
public class Controller {

	@RequestMapping("/sample")
	public GetItem Sample(@RequestParam(value = "id",
	defaultValue = "0") long id) {
		GetItem response = new GetItem();
		response.setId(1);
		return response;

	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public AddItemRequest Test(@RequestBody AddItem inputPayload) {
		AddItemRequest response = new AddItemRequest();
		response.setId(inputPayload.getId());
		response.setMessage("Hello " + inputPayload.getName());
		response.setExtra("Some text");
		return response;
	}
}