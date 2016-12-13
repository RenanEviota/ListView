package com.example.listview3;

public class Student {
	
	private int image;
	private String studentname;
	private String course;
	
	public Student(int image, String studentname, String course) {
		super();
		this.image = image;
		this.studentname = studentname;
		this.course = course;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
