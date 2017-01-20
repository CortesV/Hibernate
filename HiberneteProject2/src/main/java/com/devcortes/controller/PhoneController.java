package com.devcortes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devcortes.components.entity.Phone;
import com.devcortes.service.PhoneService;

@RestController
@RequestMapping(value = "/phone")
public class PhoneController {
	@Autowired
	PhoneService phoneService;
	
	@RequestMapping(value="/get", method = RequestMethod.GET)	
	public List<Phone> getAll(){			
       return phoneService.getAll();
	}
}