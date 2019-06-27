package com.hcs.result.bean;

import org.springframework.data.annotation.Id;

public class Customer{

	@Id
	private String id;

	private String username;
	private String age;
	
	
	public Customer() {
	}

	    public Customer( String username, String age) {
	        this.id = id;
	        this.username = username;
	        this.age = age;
	    }

		

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", username=" + username + ", age="
					+ age + "]";
		}


}
