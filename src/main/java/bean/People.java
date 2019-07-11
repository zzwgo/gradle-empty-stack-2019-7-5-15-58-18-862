package bean;

public class People {

    private Mobile mobile;
    private String name;

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void makeCall(String message) {
          this.mobile.call(message);
    }

    public Mobile getMobile() {
        return mobile;
    }
}
