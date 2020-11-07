package ma.igoudconsulting.usermanagement.dao;

import java.util.List;
import java.util.Optional;

import ma.igoudconsulting.usermanagement.model.User;

public interface UserDAO {

	void save(User user);

	void update(User user);

	Optional<User> findById(Long id);

	void deleteById(Long id);

//	void delete(User user);
	List<User> findAll();

}
