package com.example.demo.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User>{
	@Autowired
	UserRepository user;
	
	@Override
	public void write(List<? extends User> items) throws Exception {
		user.saveAll(items);
		System.out.println("Item Saved");
	}

}
