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

        System.out.println("=== Test 1: seller findByID ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n === Test 2: seller findByDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list =  sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n === Test 3: seller findAll ===");
        list =  sellerDao.findAll();

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n === Test 4: seller Insert ===");
        Seller newSeller =  new Seller(null,"Greg","greg@gemail.com",new Date(),4000.0,department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id =  "+ newSeller.getId());


        System.out.println("\n === Test 5: seller Update ===");
        seller = sellerDao.findById(2);
        seller.setName("marta Waine");
        sellerDao.uddate(seller);
        System.out.println("Update Completed");

    }
}
