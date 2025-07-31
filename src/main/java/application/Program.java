package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
       SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTING FINDBYID SELLER ===");
       Seller seller = sellerDao.findById(3);
       System.out.println(seller);

        System.out.println("\n\n=== TESTING FINDBYDEPARTMENT SELLER ===");
        List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n\n=== TESTING findAll SELLER ===");
        List<Seller> listFindAll = sellerDao.findAll();
        for(Seller obj : listFindAll){
            System.out.println(obj);
        }

//        System.out.println("\n\n=== TESTING SELLER insert ===");
//        Seller newSeller = new Seller(null, "Giulia", "Giulia@hotmail.com", new Date(2003, 01,22), 4000.0,new Department(3,null) );
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted new seller into DB! ID: " + newSeller.getId());
//
//        System.out.println("\n\n=== TESTING SELLER update ===");
//        seller = sellerDao.findById(9);
//        seller.setName("Giulia Barbizan");
//        sellerDao.update(seller);
//        System.out.println("Updated new seller into DB! ");

        System.out.println("\n\n=== TESTING SELLER delete ===");
        sellerDao.deleteById(10);
        System.out.println("Delete completed!");
    }
}
