public class InvalidEmailAddressException extends Exception{

    public InvalidEmailAddressException(String companyEmail,String message) {
        System.out.println(companyEmail+" is not OK  "+message);
    }
}
