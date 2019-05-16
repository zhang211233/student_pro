package com.student.model;

public class StudentModel {
	private int id; //唯一ID
	private int sex;
	private String username;
	private String useremail;
	private String  love;
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", sex=" + sex + ", username=" + username + ", useremail=" + useremail
				+ ", love=" + love + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentModel other = (StudentModel) obj;
		if (id != other.id)
			return false;
		if (love == null) {
			if (other.love != null)
				return false;
		} else if (!love.equals(other.love))
			return false;
		if (sex != other.sex)
			return false;
		if (useremail == null) {
			if (other.useremail != null)
				return false;
		} else if (!useremail.equals(other.useremail))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
}
