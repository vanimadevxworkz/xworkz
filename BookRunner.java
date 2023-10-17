package com.xworkz.test.driver;

import com.xworkz.test.things.Book;

public class BookRunner {
	public static void main(String args[]) {
		String name=Book.getName("book name is mahabharath","story book");
			System.out.println(name);
			Book.getName();
			Book.price(500);
			float discount=Book.discount();
				System.out.println(discount);
				String vvv=Book.name("book name is stroyBook");
					System.out.println(name);
			}
}


