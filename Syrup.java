public class Syrup extends Medicine{
    private double bottleContent;

    public Syrup() {
    }

    public Syrup(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear, TypeMedicine typeMedicine,double bottleContent) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear,TypeMedicine.SYRUP);
        setBottleContent(bottleContent);
    }

    public void setBottleContent(double bottleContent) {
        this.bottleContent = bottleContent;
    }

    public double getBottleContent() {
        return bottleContent;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" bottleContent: "+bottleContent);
    }

    @Override
    public double totalInventory() {
//        System.out.println(this.getQuantity()*this.bottleContent);
        return this.getQuantity()*this.bottleContent;
    }
}
