package com.tnsif.SpringcoreAnnotations;

	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.stereotype.Component;

	// Marking this class as a Spring Bean
	@Component
	public class MusicTeacher implements Teacher {

	    // Injecting values using @Value annotation
	    @Value("Rahul")
	    private String name;

	    @Value("10")
	    private int yearsOfExperience;

	    @Value("M. Phil. Vocal and Instrumental")
	    private String qualification;

	    @Value("Punjab University")
	    private String university;

	    // Default constructor
	    public MusicTeacher() {
	    }

	    // Getter and Setter methods for dependency injection via setter method
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getYearsOfExperience() {
	        return yearsOfExperience;
	    }

	    public void setYearsOfExperience(int yearsOfExperience) {
	        this.yearsOfExperience = yearsOfExperience;
	    }

	    public String getQualification() {
	        return qualification;
	    }

	    public void setQualification(String qualification) {
	        this.qualification = qualification;
	    }

	    public String getUniversity() {
	        return university;
	    }

	    public void setUniversity(String university) {
	        this.university = university;
	    }

	    // Implementing the method from the Teacher interface
	    public String getTeacherInfo() {
	        return "Music Teacher (Name: " + name + ", Experience in years: " + yearsOfExperience 
	                + ", Qualification: " + qualification + ", University: " + university + ")";
	    }
	}


