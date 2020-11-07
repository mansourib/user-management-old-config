package ma.igoudconsulting.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.igoudconsulting.usermanagement.dao.UserDAO;

@SpringBootApplication
public class UserManagementApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("mysql")
	UserDAO userDao;

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userDao.save(new User(UUID.randomUUID().getMostSignificantBits(), "Alex", 30, "NYC"));
//		userDao.save(new User(UUID.randomUUID().getMostSignificantBits(), "BARAK", 35, "ALABAMA"));
//		userDao.save(new User(UUID.randomUUID().getMostSignificantBits(), "TOM", 90, "LAS VIGAS"));
//		userDao.save(new User(3L, "JHON", 20, "CALIFONY"));
//		userDao.save(new User(2L, "ADAM", 40, "ALASKA"));
//
////		for (User user : userDao.findAll()) {
////			System.out.println(user.getName());
////		}
//
////		userDao.delete(3L);
////		System.out.println(userDao.findAll().size());
//		User userDB = userDao.findById(2L).get();
//		System.out.println(userDB.getAdress() + " " + userDB.getAge());
//		userDB.setAge(60);
//		userDB.setAdress("NYC");
//		userDao.update(userDB);
//		User userDBNEW = userDao.findById(2L).get();
//		System.out.println(userDBNEW.getAdress() + " " + userDBNEW.getAge());

	}

}
