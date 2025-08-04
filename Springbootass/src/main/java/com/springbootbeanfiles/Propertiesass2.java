package com.springbootbeanfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Propertiesass2 {
	@Value("${app.example.integer-value}") 
	private Integer valueInteger;
	@Value("${app.example.decimal-value}") 
	private Double valueDouble;
	@Value("${app.example.boolean-value}") 
	private Boolean valueBoolean;
	public void getValueInteger() {
	 System.out.println("Integer"+valueInteger);
	}
	public void setValueInteger(Integer valueInteger) {
		this.valueInteger = valueInteger;
		
	}
	public void getValueDouble() {
		System.out.println("Double"+valueDouble);
	}
	public void setValueDouble(Double valueDouble) {
		this.valueDouble = valueDouble;
	}
	public void getValueBoolean() {
		System.out.println("Boolean"+valueBoolean);
	}
	public void setValueBoolean(Boolean valueBoolean) {
		this.valueBoolean = valueBoolean;
	}
	

}
