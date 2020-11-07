package ma.igoudconsulting.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.usermanagement.dao.UserDAO;
import ma.igoudconsulting.usermanagement.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("mysql")
	UserDAO userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public Optional<User> findById(Long id) {
		return userDao.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		userDao.deleteById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
