package dx.web.model;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1405799648005675128L;

	private String id;
	
	private String userName;
	
	private String password;
	
	private String age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
