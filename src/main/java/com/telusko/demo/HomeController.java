package com.telusko.demo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(	Model model)
	{
		List<Book> bookList = new ArrayList<Book>();
    	Book book = new Book();
    	book.setIsbn("21312sdf");
    	book.setName("fsj");
    	book.setAuthor("sffdsfd");
    	bookList.add(book);
    
        model.addAttribute("books", bookList);
        
		System.out.println("hi ");
		return "view-books";
		
	}

}
