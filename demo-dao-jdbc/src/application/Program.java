package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*Department obj = new Department(1,"books");
		
		Seller seller = new Seller(21,"Mike Jordan","mj@gmail.com",new Date(),3000.0,obj);
		
		System.out.println(obj);
		System.out.println(seller);
		System.out.println(seller);*/
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		Seller seller =sellerDao.findById(3);
		System.out.println(seller);

	}

}
