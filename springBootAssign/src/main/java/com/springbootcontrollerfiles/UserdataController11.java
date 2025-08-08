package com.springbootcontrollerfiles;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbeanfiles.Userdata11;
@RestController
public class UserdataController11 {

	/*
	 * @ResponseBody:::
	 * 
	 * If NO XML Dependency in pom.xml , then response is JSON by default!
	 * If XML Dependency exists in pom.xml, then response is XML by default!
	*/
	
	@GetMapping("/springrest/customers")
	public List<Userdata11> getUserdetails()
	{
		ArrayList<Userdata11> aobj=new ArrayList();
	   	aobj.add(new Userdata11(101,"John","Doe","djohn@gmail.com","121-232-3435",1467240235069L));
	    aobj.add(new Userdata11(201,"Russ","Smith","sruss@gmail.com","343-545-2345",1467240235069L));
	    aobj.add(new Userdata11(301,"Kate","Williams","kwilliams@gmail.com","876-237-2987",1467240235069L));
		return aobj;
	}
}
