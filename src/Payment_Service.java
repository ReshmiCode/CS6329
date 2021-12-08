public class Payment_Service {
    private int id;

    public Payment_Service() {
        id = 1;
    }

    public boolean isValid(String creditCardInfo){
        return creditCardInfo.split(" ").length == 3;
    }
}
