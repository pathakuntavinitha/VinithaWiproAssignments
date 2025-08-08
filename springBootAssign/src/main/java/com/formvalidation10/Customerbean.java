package com.formvalidation10;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customerbean {
	 	@Size(min = 2, max = 30, message = "{name.size}")
	    private String name;
	    @NotBlank(message = "{email.required}")
	    private String email;
	    @Min(value = 18, message = "{age.min}")
	    private int age;
	    @NotBlank(message = "{gender.required}")
	    private String gender;
	    @NotBlank(message = "{birthday.required}")
	    private String birthday;
	    @Pattern(regexp = "^(\\d{10}|\\d{3}-\\d{3}-\\d{4}( x\\d{1,4})?)$", message = "{phone.invalid}")
	    private String phone;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
	    
	    
}
