package com.tnsif.springcore_college;

	
import java.util.List;


	public class College {

		private String name;
		private List<Department> departmentList;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Department> getDepartmentList() {
			return departmentList;
		}
		public void setDepartmentList(List<Department> departmentList) {
			this.departmentList = departmentList;
		}
		@Override
		public String toString() {
			return "College [name=" + name + ", departmentList=" + departmentList + "]";
		}
		
		
		
	}


