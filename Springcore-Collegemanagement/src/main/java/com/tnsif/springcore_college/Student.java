package com.tnsif.springcore_college;

	
	public class Student {
		
		private String name;
		private int id;
		private String email;
		private String city;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", email=" + email + ", city=" + city + "]" +"\n";
		}

		

	}

