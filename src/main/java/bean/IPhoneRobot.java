package bean;

public class IPhoneRobot extends People {
    @Override
    public void makeCall(String message) {
        if(!getMobile().getBrand().equals("iPhone")){
            System.out.println(" it can only use iPhone");
        }else {
            super.makeCall(message);
        }
    }
}
