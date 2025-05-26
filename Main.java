package com.main1;
import com.manufacture.Manufacturer;
import com.product.Product;
public class Main {
	public static void main(String[] args) {
		Manufacturer mf = Manufacturer.getManufacturerObject("Rakesh", "Hyd", "12345678");
		Product pd = Product.getProductObject("Laptop", "Electronic", mf, 1000000.0);
		if(mf == null || pd == null)
		{
			System.out.println("Invalid Message");
		}
		System.out.println(pd);
		System.out.println(mf);
		

	}

}

