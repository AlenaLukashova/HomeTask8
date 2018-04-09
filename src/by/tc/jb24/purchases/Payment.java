package by.tc.jb24.purchases;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	private List<Good> listOfGoods = new ArrayList<Good>();

	public Payment() {
	}

	public List<Good> getInfoAboutGood() {
		return listOfGoods;
	}

	public void addToList(Good good) {
		listOfGoods.add(good);
	}
	
	public void delete(Good good) {
		listOfGoods.remove(good);
	}
	
	public Good findByProductName(String content){
		for (Good good: listOfGoods){
			if (good.getProductName().equals(content)){
				return good;
			}
		}
		return null;
	}
}
