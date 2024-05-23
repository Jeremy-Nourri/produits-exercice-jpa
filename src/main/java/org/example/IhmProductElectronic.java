package org.example;

import org.example.DAO.ProductElectronicDAO;
import org.example.Entity.ProductElectronic;

import java.util.List;


public class IhmProductElectronic extends IhmProduct {

    ProductElectronicDAO productElectronicDAO;

    @Override
    public void createProduct() {
        System.out.println("Entrer un nom :");
        String name = scanner.nextLine();
        System.out.println("Entrer le prix d'un produit :");
        double price = scanner.nextDouble();
        System.out.println("Entrer la durée de vie de la batterie:");
        double durationBattery = scanner.nextDouble();

        ProductElectronic product = ProductElectronic.builder()
                .name(name)
                .price(price)
                .batteryDuration(durationBattery)
                .build();

        productElectronicDAO.save(product);
    }

    @Override
    public void getAllProduct() {
        System.out.println("Afficher tous les produits");
        List<ProductElectronic> productElectronicList = productElectronicDAO.findAll();

        for (ProductElectronic productElectronic : productElectronicList){
            System.out.println(productElectronic);
        }
    }

    @Override
    public void getProductById() {
        System.out.println("Entrer l'id du produit : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        ProductElectronic productElectronic = productElectronicDAO.findById(id);
        if(productElectronic != null){
            System.out.println(productElectronic);
        }else {
            System.out.println("Aucun produit trouvé");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Entrer l'id du produit :");
        int id = scanner.nextInt();
        scanner.nextLine();

        ProductElectronic productElectronic = productElectronicDAO.findById(id);
        if(productElectronic != null){
            productElectronicDAO.delete(productElectronic);
        }else{
            System.out.println("Aucun produit trouvé");
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Entrer l'id du produit :");
        int id = scanner.nextInt();
        scanner.nextLine();

        ProductElectronic productElectronic = productElectronicDAO.findById(id);

        if(productElectronic != null){
            System.out.println("nom du produit : ( " + productElectronic.getName() +" )" );
            String name = scanner.nextLine();
            productElectronic.setName(name);
            System.out.println("");
            double price = scanner.nextDouble();
            productElectronic.setPrice(price);
            double batteryDuration = scanner.nextDouble();
            productElectronic.setBatteryDuration(batteryDuration);

            productElectronicDAO.save(productElectronic);
        }else{
            System.out.println("Aucun produit trouvé");
        }
    }
}

