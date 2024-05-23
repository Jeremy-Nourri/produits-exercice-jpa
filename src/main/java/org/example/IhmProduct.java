package org.example;

import java.util.Scanner;

public abstract class IhmProduct {
    protected Scanner scanner;
    public void start (){

        scanner = new Scanner(System.in);

        while (true){
            System.out.println("1/ Créer un produit");
            System.out.println("2/ Afficher tous les produits");
            System.out.println("3/ Afficher un produit par id");
            System.out.println("4/ Supprimer un produit");
            System.out.println("5/ Editer un produit");
            int entry = scanner.nextInt();
            scanner.nextLine();
            switch (entry){
                case 1:
                    createProduct();
                    break;
                case 2:
                    getAllProduct();
                    break;
                case 3:
                    getProductById();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    editProduct();
                    break;
                default:
                    return;
            }
        }
    }

    public abstract void createProduct();
    public abstract void getAllProduct();
    public abstract void getProductById();
    public abstract void deleteProduct();
    public abstract void editProduct();

}
