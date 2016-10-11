package com.hcs.result.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer{

	@Id
	private Long id;

	public Customer() {
	}
	    private String username;
	    private Integer age;

	    public Customer(Long id, String username, Integer age) {
	        this.id = id;
	        this.username = username;
	        this.age = age;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", username=" + username + ", age="
					+ age + "]";
		}


}
