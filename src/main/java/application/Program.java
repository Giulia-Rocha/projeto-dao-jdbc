package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

import model.entities.Department;
import model.entities.Seller;

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
    }
}
