package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj =  new Department(1,"andre");

        Seller seller =  new Seller(1,"andre","andre@email", new Date(),3000.0,obj);

        System.out.println(seller);
    }
}
