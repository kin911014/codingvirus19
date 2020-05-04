package com.douzone.codingvirus19.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douzone.codingvirus19.repository.UserRepository;
import com.douzone.codingvirus19.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserVo> findAll() {
		return userRepository.findAll();
	}
	
//	public UserVo findAll() {
//		
//	}


}
