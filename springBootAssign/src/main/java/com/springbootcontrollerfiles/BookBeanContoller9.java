package com.springbootcontrollerfiles;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbeanfiles.BookBean9;
@Controller
public class BookBeanContoller9 {

	/*
	 * @ResponseBody:::
	 * 
	 * If NO XML Dependency in pom.xml , then response is JSON by default!
	 * If XML Dependency exists in pom.xml, then response is XML by default!
	*/
	
	@GetMapping("/bookXYZ")
	@ResponseBody//default conversion is JSON=>OTHER CONVERSION TYPES XML,TEXT ETC.,
	public List<BookBean9> getBooks()
	{
		ArrayList<BookBean9> aobj=new ArrayList();
		aobj.add(new BookBean9(101,"Java Tutorials","Krishna"));
		aobj.add(new BookBean9(102,"Spring Tutorials","Mahesh"));
		aobj.add(new BookBean9(103,"Angular Tutorials","Shiva"));
		return aobj;
	}
}

/*
 * This XML file does not appear to have any style information associated with it. The document tree is shown below.
<List>
<item>
<bookId>101</bookId>
<name>Java Tutorials</name>
<writer>Krishna</writer>
</item>
<item>
<bookId>102</bookId>
<name>Spring Tutorials</name>
<writer>Mahesh</writer>
</item>
<item>
<bookId>103</bookId>
<name>Angular Tutorials</name>
<writer>Shiva</writer>
</item>
</List>
 */
