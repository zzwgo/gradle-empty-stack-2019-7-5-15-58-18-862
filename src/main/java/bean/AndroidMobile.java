package bean;

public class AndroidMobile extends  Mobile {
    public AndroidMobile(String name, String color, String brand) {
        super(name, color, brand);
    }
    @Override
    public void call(String message){
        if(message.length()>20){
            System.out.println("<Andriod> Message cannot be sent");
        }else {
            System.out.println("<Andriod>Message:"+message);
        }
    }
}
