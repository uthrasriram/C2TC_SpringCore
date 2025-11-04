package com.tnsif.springcore_DependencyInjection;

	public class Student {
		int sid;
		String sname;
		String city;
		
		
		public void setSid(int sid) {
			this.sid = sid;
		}

		
		public void setSname(String sname) {
			this.sname = sname;
		}

		
		public void setCity(String city) {
			this.city = city;
		}

		public void showInfo()
		{
			System.out.println("Id:"+sid+" Name:"+sname+" City:"+city);
		}
	}


