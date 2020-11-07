package ma.igoudconsulting.usermanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ma.igoudconsulting.usermanagement.model.User;

@Repository("mysql")
public class MysqlUserDaoImpl implements UserDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void save(User user) {
		String sql = "INSERT INTO USER(id,name,age,adress) VALUE(?,?,?,?) ";
		jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge(), user.getAdress());
		// TODO Auto-generated method stub
	}

	@Override
	public void update(User user) {
		String sql = "UPDATE USER SET name=? ,age=? ,adress=? WHERE id=?";
		jdbcTemplate.update(sql, user.getName(), user.getAge(), user.getAdress(), user.getId());
	}

	@Override
	public Optional<User> findById(Long id) {
		String sql = "SELECT id,name,age,adress FROM USER WHERE id=?";
		User user = jdbcTemplate.queryForObject(sql, new Object[] { id }, (resultSet, i) -> {
			Long userId = resultSet.getLong("id");
			String name = resultSet.getString("name");
			String adress = resultSet.getString("adress");
			int age = resultSet.getInt("age");
			return new User(userId, name, age, adress);
		});

		return Optional.ofNullable(user);
	}

	@Override
	public void deleteById(Long id) {
		String sql = "DELETE FROM USER WHERE id=?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public List<User> findAll() {
		String sql = "SELECT id,name,age,adress FROM USER";
		return jdbcTemplate.query(sql, (resultSet, i) -> {
			Long id = resultSet.getLong("id");
			String name = resultSet.getString("name");
			String adress = resultSet.getString("adress");
			int age = resultSet.getInt("age");
			return new User(id, name, age, adress);
		});
	}

}
