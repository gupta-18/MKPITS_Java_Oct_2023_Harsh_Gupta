package com.mkpits.arraylist;

import java.util.Objects;

import javax.management.loading.PrivateClassLoader;

public class ModelClassStudent {

	
	private  int marks;
	private String subjects;
	
	public ModelClassStudent(int marks, String subjects) {
		this.marks= marks;
		this.subjects = subjects;
	}

//	public int getMarks() {
//		return marks;
//	}
//
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//
//	public String getSubjects() {
//		return subjects;
//	}
//
//	public void setSubjects(String subjects) {
//		this.subjects = subjects;
//	}

	@Override
	public String toString() {
		return "ModelClassStudent [marks=" + marks + ", subject=" + subjects + "]";
	}
//ye hashcode or equal method  
	@Override
	public int hashCode() {
		return Objects.hash(marks, subjects);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelClassStudent other = (ModelClassStudent) obj;
		return marks == other.marks && Objects.equals(subjects, other.subjects);
	}
	
	
	
		
		
		
		
		
		
		
		
	

}
