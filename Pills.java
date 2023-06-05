public class Pills extends Medicine{
    private int numOfPillsInBox;

    public Pills() {
    }

    public Pills(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear,TypeMedicine typeMedicine, int numOfPillsInBox) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear,TypeMedicine.PILLS);
        setNumOfPillsInBox(numOfPillsInBox);
    }


    public void setNumOfPillsInBox(int numOfPillsInBox) {

        this.numOfPillsInBox = numOfPillsInBox;
    }

    public int getNumOfPillsInBox() {

        return numOfPillsInBox;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" numOfPillsInBox: "+numOfPillsInBox);
    }

    @Override
    public double totalInventory() {
//        System.out.println(getQuantity()*numOfPillsInBox);
//        numOfPillsInBox*getQuantity();
         return getQuantity()*numOfPillsInBox;
    }
}
