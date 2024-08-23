package com.book.bookApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BookAppApplication.class, args);
	}
}
