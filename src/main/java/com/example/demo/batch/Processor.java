package com.example.demo.batch;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class Processor implements ItemProcessor<User, User>{

	@Override
	public User process(User user) throws Exception {
		//item.getDepartment();
		user.setTime(new Date());
		///do Some business codes here
		return user;
	}

}
