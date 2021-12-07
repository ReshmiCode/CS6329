public class Payment_Service {
    private int integers;

    public boolean isValid(String creditCardInfo){
        return creditCardInfo.split(" ").length == 3;
    }
}
