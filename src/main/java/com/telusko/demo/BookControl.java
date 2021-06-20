package com.telusko.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookControl {
	
	
	    @GetMapping("/viewBooks")
	    public String viewBooks(Model model) {
	    	List<Book> bookList = new ArrayList<Book>();
	    	Book book = new Book();
	    	book.setIsbn("21312sdf");
	    	book.setName("fsj");
	    	book.setAuthor("sffdsfd");
	    	bookList.add(book);
	        model.addAttribute("books", bookList);
	        return "view-books1";
	    }

	    @GetMapping("/viewBooksaddress")
	    public String viewBooksadd(Model model) {
	    	List<Book> bookList = new ArrayList<Book>();
	    	Book book = new Book();
	    	book.setIsbn("21312sdf");
	    	book.setName("fsj");
	    	book.setAuthor("sffdsfd");
	    	bookList.add(book);
	        model.addAttribute("books", bookList);
	        return "view-books2";
	    }

}
