package com.gdpfer.crud3.controllers;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdpfer.crud3.model.Device;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path="/devices") // This means URL's start with /devices (after Application path)
public class DevicesController {

	@PostMapping("/device")
	@ResponseBody
    public String returnMacAddress(@RequestBody Device device) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Instant instant = timestamp.toInstant();
		return device.getMacAddress().toString() +" "+ instant;
    }
}
