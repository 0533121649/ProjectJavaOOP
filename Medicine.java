public abstract class Medicine {
    private String medicineName;
    private String companyName;
    private String companyEmail;
    private double price;
    private int quantity;
    private String expirationYear;

    TypeMedicine typeMedicine;
    enum TypeMedicine{
        PILLS,
        SYRUP,
        INHALER
    }

    public Medicine() {
    }

    public Medicine(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear, TypeMedicine typeMedicine) throws InvalidEmailAddressException {
        setMedicineName(medicineName);
        setCompanyName(companyName);
        setCompanyEmail(companyEmail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationYear);
        setTypeMedicine(typeMedicine);
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName.toUpperCase();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyEmail(String companyEmail) throws InvalidEmailAddressException {
        if(!companyEmail.contains("@")) {
            throw new InvalidEmailAddressException(companyEmail,"The sign @ must be appears at least once");
        }
//        char c=companyEmail.charAt(0);
//        if (c=='@'){
        if (companyEmail.startsWith("@")){
            throw new InvalidEmailAddressException(companyEmail,"The sign @ can't be the first char");
        }
        if (companyEmail.endsWith("@")){
            throw new InvalidEmailAddressException(companyEmail,"The sign @ can't be the last char");
        }
        if (!companyEmail.substring(companyEmail.indexOf("@")).contains(".")){
            throw new InvalidEmailAddressException(companyEmail,"must be at least 1 .(dot) character appears in the domain after the @ sign");
        }
        this.companyEmail = companyEmail;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setTypeMedicine(TypeMedicine typeMedicine) {
        this.typeMedicine = typeMedicine;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public TypeMedicine getTypeMedicine() {
        return typeMedicine;
    }

    public void print(){
        System.out.print("medicineName: "+medicineName+" companyName: "+companyName+" companyEmail: "+companyEmail+" price: "+" quantity: "+quantity+" expirationYear: "+expirationYear+" typeMedicine: "+typeMedicine);
    }
    public abstract double totalInventory();

    public boolean inStock(){
        if (this.quantity>0){
            return true;
        }
        else return false;
    }
}
