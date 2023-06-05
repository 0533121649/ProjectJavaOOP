import java.util.ArrayList;

public class Inventory {
     ArrayList<Medicine> arrMedicine = new ArrayList<Medicine>();

     //method that add the new medicine to the ArrayList
    public void addMedicine(Medicine addNewMedicine)throws MedicineAlreadyExistException{
        for (Medicine m: arrMedicine) {
            if (m.getMedicineName().equalsIgnoreCase(addNewMedicine.getMedicineName())){
                throw new MedicineAlreadyExistException("medicine already exist in stock");
            }
        }
        arrMedicine.add(addNewMedicine);

    }

    //return array list of all medicines in stock
    public ArrayList<Medicine> getMedicinesInStock()
    {
        ArrayList<Medicine> listMedicinesInStock = new ArrayList();
        for(Medicine medicine:arrMedicine)
        {
            if(medicine.getQuantity() > 0)
                listMedicinesInStock.add(medicine);
        }
        return listMedicinesInStock;
    }


    // method that returns a medicine according to its name and prints its total Inventory
    public ArrayList<Medicine> searchMedicineByName(String medicineByName){
        ArrayList<Medicine> subArr = new ArrayList<Medicine>();
        for (Medicine m: arrMedicine) {
            if (m.getMedicineName().equalsIgnoreCase(medicineByName)) {
                subArr.add(m);
            }
        }
        return subArr;
    }

    

    //method that returns an array list of medicines by its type
    public ArrayList<Medicine> searchMedicineByType(Medicine.TypeMedicine medicineByType){
        ArrayList<Medicine> subArr = new ArrayList<Medicine>();
        for (Medicine m: arrMedicine) {
            if (m.getTypeMedicine().equals(medicineByType)) {
                subArr.add(m);
            }
        }
        return subArr;
    }

}
