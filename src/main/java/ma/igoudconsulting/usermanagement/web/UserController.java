package ma.igoudconsulting.usermanagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.igoudconsulting.usermanagement.model.User;
import ma.igoudconsulting.usermanagement.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping
	public List<User> index() {
		return service.findAll();
	}

	@PostMapping
	public void save(@RequestBody User user) {
		service.save(user);
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		return service.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}

	@PutMapping("/{id}")
	public void update(@RequestBody User userNew, @PathVariable Long id) {
		User userDB = service.findById(id).get();
		userDB.setAdress(userNew.getAdress());
		userDB.setAge(userNew.getAge());
		userDB.setName(userNew.getName());
		service.update(userDB);

	}

}
