package cn.neu.laboratory.servicedao;

import cn.neu.laboratory.entity.User;

public interface UserServiceDAO {

	public void insert(User user);
	
	public User findById(int id);
}
