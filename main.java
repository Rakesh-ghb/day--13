package com.main2;
import com.publisher.*;
import com.book.*;
public class main {
	public static void main(String[] args) {
		Publisher pb = Publisher.getManufacturerObject("Rakesh", "Hyd", "12354555");
		Book bk = Book.getProductObject("good friend", "Rakesh", pb, 3000.0);
		if(pb==null || bk == null)
		{
			System.out.println("Book creation failed due to Invalid Data.");
		}
		System.out.println(bk);
		System.out.println(pb);
	}
}

