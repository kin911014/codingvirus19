package com.douzone.codingvirus19.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.codingvirus19.vo.UserVo;
@Repository
public class UserRepository {
	
	@Autowired
	private SqlSession sqlSession;

	public List<UserVo> findAll() {
		List <UserVo> userLists = sqlSession.selectList("user.findAll");
		// * List로 return값을 받아 올 때에는 selectList를 사용할 것 사용안할 시(selectOne 사용 시) cast오류 발생!
		return userLists;
	}
	

}
