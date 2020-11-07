package ma.igoudconsulting.usermanagement.model;

public class User {

	private Long id;
	private String name;
	private int age;
	private String adress;

	public User() {
	}

	public User(Long id, String name, int age, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.adress = adress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
