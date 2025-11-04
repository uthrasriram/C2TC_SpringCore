package com.tnsif.springcore_DependencyInjection;

	public class Student1 {
		private int sid;
		private String sname;
		private String city;
		
		public Student1(int sid, String sname) {
			super();
			this.sid = sid;
			this.sname = sname;
		}

		public Student1(int sid, String sname, String city) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.city = city;
		}
		public void showInfo()
		{
			System.out.println("Id:"+sid+" Name:"+sname+" City:"+city);
		}
		

	}

