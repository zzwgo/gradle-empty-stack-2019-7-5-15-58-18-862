import bean.AndroidMobile;
import bean.IPhoneRobot;
import bean.Iphone;
import bean.People;

public class Main {

    public static void main(String[] args) {
        AndroidMobile huaWeiMate=new AndroidMobile("huaWei","red","android");
        Iphone iphoneSE2=new Iphone("iphoneSE","red","iPhone");
        huaWeiMate.show();
        iphoneSE2.show();

        People Zhangaa=new People();
        Zhangaa.setMobile(iphoneSE2);
        Zhangaa.makeCall("user android to call");
        Zhangaa.makeCall("user android to call ---------------------------------------");
        Zhangaa.makeCall("use iphone to call ---------------------------------------");
        Zhangaa.makeCall("use iphone to call");

        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        iPhoneRobot.setMobile(iphoneSE2);
        iPhoneRobot.makeCall("robot use iphone");
        iPhoneRobot.setMobile(huaWeiMate);
        iPhoneRobot.makeCall("robot use android");
    }
}
