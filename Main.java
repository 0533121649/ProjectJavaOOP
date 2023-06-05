import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InvalidEmailAddressException {
        Inventory myInventory = new Inventory();

        Pills p1 = null;
        Inhaler i1 = null;
        System.out.println();
        System.out.println("***add medicine***");
try {
    p1 = new Pills("Ibufen", "Teva", "Teva@company.co.il", 45, 200, "2024",Medicine.TypeMedicine.PILLS, 30);
    myInventory.addMedicine(new Pills("Ibufen", "Teva", "Teva@company.co.il", 45, 200, "2024",Medicine.TypeMedicine.PILLS, 30));
    myInventory.addMedicine(new Pills("Vitamin_d", "Supherb", "supherb@supherb.co.il", 60, 1000, "2025",Medicine.TypeMedicine.PILLS, 100));
    myInventory.addMedicine(new Pills("Acamol", "Teva", "Teva@company.co.il", 45, 200, "2024",Medicine.TypeMedicine.PILLS, 20));

    myInventory.addMedicine(new Syrup("Acamool", "Teva", "Teva@company.co.il", 50, 150, "2024",Medicine.TypeMedicine.SYRUP, 500));
    myInventory.addMedicine(new Syrup("Nurofen", "Teva", "Teva@company.co.il", 50, 80, "2024",Medicine.TypeMedicine.SYRUP, 300));
    myInventory.addMedicine(new Syrup("Calcium", "Supherb", "supherb@supherb.co.il", 50, 250, "2024",Medicine.TypeMedicine.SYRUP, 200));

    i1 = new Inhaler("Inhaler", "Teva", "Teva@company.co.il", 80, 170, "2023",Medicine.TypeMedicine.INHALER, 5);
    myInventory.addMedicine(new Inhaler("Abamis", "Teva", "Teva@company.co.il", 45, 55, "2023",Medicine.TypeMedicine.INHALER, 4));
    myInventory.addMedicine(new Inhaler("Inhalerr", "Teva", "@Teva@company.co.il", 80, 170, "2023",Medicine.TypeMedicine.INHALER, 2));
    }
    catch (MedicineAlreadyExistException e){
        System.out.println("medicine not add");
    }

        catch (InvalidEmailAddressException e){
            e.printStackTrace();
        }
        catch (Exception e1){
            System.out.println("medicine add");
        }
        try{
            myInventory.addMedicine(p1);
            System.out.println("medicine add");
        }
        catch (MedicineAlreadyExistException e){
            System.out.println("medicine not add");
            e.printStackTrace();
        }
        try{
            myInventory.addMedicine(i1);
            System.out.println("medicine add");
        }
        catch (MedicineAlreadyExistException e){
            System.out.println("medicine not add");
        }

        //חיפוש תרופה לפי שם
        System.out.println();
        System.out.println("***search medicine by name***");
        ArrayList<Medicine> searchMedicineByName = myInventory.searchMedicineByName("Acamol");
        for (Medicine m: searchMedicineByName) {
            m.print();
        }

        //חיפוש תרופה לפי type
        System.out.println();
        System.out.println("***search medicine by type***");
        ArrayList<Medicine> medicineByType = myInventory.searchMedicineByType(Medicine.TypeMedicine.PILLS);
        for (Medicine medicine :medicineByType) {
            medicine.print();
        }

        System.out.println("\n** Print all medicines in stock **");
        ArrayList<Medicine> allInStock = myInventory.getMedicinesInStock();
            for(Medicine medicine : allInStock)
        {
            medicine.print();
        }

    }
}