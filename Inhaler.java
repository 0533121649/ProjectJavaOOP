public class Inhaler extends Medicine{
    private int amountOfClick;

    public Inhaler(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }

    public Inhaler(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear, TypeMedicine typeMedicine, int amountOfClick) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear,TypeMedicine.INHALER);
        setAmountOfClick(amountOfClick);
    }

    public void setAmountOfClick(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }

    public int getAmountOfClick() {
        return amountOfClick;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" amountOfClick: "+amountOfClick);
    }

    @Override
    public double totalInventory() {
//        System.out.println(this.getQuantity()*this.amountOfClick);
        return this.getQuantity()*this.amountOfClick;
    }
}
