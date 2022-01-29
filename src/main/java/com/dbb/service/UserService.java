package com.dbb.service;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.dbb.model.User;

import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class UserService {
	public User getDetails() {

		ObjectMapper mapper = new ObjectMapper();

		// read JSON file and map/convert to java POJO

		User user = null;
		try {
			File file = new ClassPathResource("accountListResponse.json").getFile();

			user = mapper.readValue(file, User.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user);

		return user;
	}
}
