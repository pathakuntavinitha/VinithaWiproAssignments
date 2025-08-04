package com.javaconceptoftheday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLMQ1{
	@Autowired
	@Qualifier("classABCQ1")
	InterfacePQRQ1 pqr;
}
