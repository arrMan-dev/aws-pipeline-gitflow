package com.arrisdev.awsgitflow;

import com.arrisdev.awsgitflow.model.User;
import com.arrisdev.awsgitflow.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AwsGitFlowApplicationTests {

	@Autowired
	UserServiceImpl impl;

	@Test
	void contextLoads() {
	}

	@Test
	void should_create_user(){
		User newUser = createUser();
		assertNotNull(newUser);

	}

	@Test
	void should_populate_user(){
		try{
			User newUser = impl.createUser(createUser());
			assertNotNull(newUser);
		}catch(Exception e){
			assertNotNull(e);
		}
	}

	@Test
	void should_getAll_user(){
		try{
			List<User> response = impl.getAllUsers();
			assertNotNull(response);

		}catch(Exception e){
			assertNotNull(e);
		}
	}
	@Test
	void should_get_user_by_input_startWith(){
		try{
			List<User> response = impl.findByFirstLetterOfName("Herve");
			assertNotNull(response);

		}catch(Exception e){
			assertNotNull(e);
		}
	}

	@Test
	void should_get_user_by_emailId(){
		try{
			List<User> response = impl.findByEmail("brighel@test.com");
			assertNotNull(response);

		}catch(Exception e){
			assertNotNull(e);
		}
	}

	private User createUser() {
		User newUser = new User();
		newUser.setId(1L);
		newUser.setEmailId("test@test.com");
		newUser.setPassword("believe");
		newUser.setLastName("Baby");
		newUser.setFirstName("Boy");
		return newUser;
	}

}
