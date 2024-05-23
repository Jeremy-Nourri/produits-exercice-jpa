package org.example;

import org.example.DAO.ProductElectronicDAO;
import org.example.DAO.ProductFoodDAO;
import org.example.DAO.ProductHousingDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class IHM {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("produits_exercice");
    EntityManager em = emf.createEntityManager();

    Scanner scanner;



    public void start (){

        scanner = new Scanner(System.in);

        while (true){
            System.out.println("1/ Produits électroniques");
            System.out.println("2/ Nourritures");
            System.out.println("3/ Accessoires logements");

            int entry = scanner.nextInt();
            scanner.nextLine();
            switch (entry){
                case 1:
                    IhmProductElectronic ihmProductElectronic = new IhmProductElectronic();
                    ihmProductElectronic.start();
                    break;
//                case 2:
//                    getAllComputer();
//                    break;
//                case 3:
//                    getComputerById();
//                    break;
                default:
                    return;
            }
        }

    }
}
