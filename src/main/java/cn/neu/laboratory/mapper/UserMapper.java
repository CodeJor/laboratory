package cn.neu.laboratory.mapper;

import org.springframework.stereotype.Repository;

import cn.neu.laboratory.entity.User;

@Repository
public interface UserMapper {

	public void insert(User user);
	
	public User findById(int id);

}
