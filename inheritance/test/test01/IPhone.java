package inheritance.test.test01;

public class IPhone extends IPodTouch {

    private String phoneNumber;

    public IPhone(String model, String phoneNumber) {
//        super();
        this.setModel(model);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String infoString() {
        return super.infoString() + "\n전화번호 : " + this.phoneNumber;
    }

    // 전화 기능
    public void calling(String callNumber) {
        System.out.println(callNumber + " 로 통화 중");
    }

    // 메시지 기능
    public void message(String messageNumber, String message) {
        System.out.println(messageNumber + " 로 " + message + " 전송");
    }

    // 자신의 전화번호 getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
