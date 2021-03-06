package com.devcortes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devcortes.components.entity.PhoneFeatures;
import com.devcortes.service.PhoneFeaturesService;

@RestController
@RequestMapping(value = "/feature")
public class PhoneFeaturesController {
	@Autowired
	PhoneFeaturesService phoneFeaturesService;
	
	@RequestMapping(value="/get", method = RequestMethod.GET)	
	public List<PhoneFeatures> getAll(){			
       return phoneFeaturesService.getAll();
	}
}
