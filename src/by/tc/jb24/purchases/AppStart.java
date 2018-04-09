package by.tc.jb24.purchases;

import java.util.List;

public class AppStart {
	
	public static void main(String[] args) {
		Good mobilePhone = new Good ("iPhone", "Apple", 1000.25);
		Good tablet = new Good ("iPad", "Apple", 1275.50);
		
		Payment listOfGoods = new Payment ();

		listOfGoods.addToList(mobilePhone);
		listOfGoods.addToList(tablet);
		
		Good findGood = listOfGoods.findByProductName("iPod");
		
		if(findGood != null){
			print(findGood);
		} else{
		printPayment(listOfGoods);
		}
	}
	
	public static void printPayment(Payment listOfGoods) {
		List<Good> printPaymentInfo = listOfGoods.getInfoAboutGood();
		
		for (int i=0; i<printPaymentInfo.size(); i++){
			Good good = printPaymentInfo.get(i);
			System.out.println(good.toString());
		}
	}
	
	public static void print(Good good) {
		System.out.println("Product Name : " + good.getProductName() + "; " + "Manufacturer: " + good.getManufacturer() + " ; " + "Price: " + good.getPrice() + " ;");
	}
}
