package cn.neu.laboratory.servicedaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.neu.laboratory.entity.User;
import cn.neu.laboratory.mapper.UserMapper;
import cn.neu.laboratory.servicedao.UserServiceDAO;

@Service("userService")
public class UserService implements UserServiceDAO {

	@Autowired
	private UserMapper userMapper;
	
	public void insert(User user) {
		
		userMapper.insert(user);
	}

	public User findById(int id) {
		
		return userMapper.findById(id);
	}
}
