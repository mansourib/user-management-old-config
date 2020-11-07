package ma.igoudconsulting.usermanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import ma.igoudconsulting.usermanagement.model.User;

@Repository("memoire")
public class UserDaoImpl implements UserDAO {

	private ArrayList<User> users = new ArrayList<>();

	@Override
	public void save(User user) {
		users.add(user);
	}

	/**
	 * modification de l'entite User
	 */
	@Override
	public void update(User user) {

		for (User userDB : users) {
			if (userDB.getId().equals(user.getId())) {
				int index = users.indexOf(userDB);
				users.set(index, new User(user.getId(), user.getName(), user.getAge(), user.getAdress()));
			}
		}

	}

	@Override
	public Optional<User> findById(Long id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst();
	}

	@Override
	public void deleteById(Long id) {
		users.remove(findById(id).get());
	}

	@Override
	public List<User> findAll() {
		return users;
	}

}
