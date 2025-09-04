package design.test.test02;

// 전화 기능 구현
public class Galaxy {

    // 제조사, 모델명, 일련번호, 전화번호 변수 생성
    // 전화 수신번호, 문자 수신번호, 문자내용 추가 생성
    private String company;
    private String model;
    private String serialNum;
    private String phoneNum;

    // 멤버변수로 필요없는건 굳이 저장할 필요 X

//    private String callNum;
//    private String messageNum;
//    private String message;

    // 핸드폰 정보
    public Galaxy(String company, String model, String serialNum, String phoneNum) {
        this.company = company;
        this.model = model;
        this.serialNum = serialNum;
        this.phoneNum = phoneNum;
    }

    // 제조사 및 모델명 확인
    public void phoneInfo() {
        System.out.println(company + "에서 제조된 " + model + " 입니다.");
        // 전화번호 확인
        System.out.println("전화 번호 : " + phoneNum);
        // 일련번호 확인
        System.out.println("일련 번호 : " + serialNum);
    }


    // 전화 기능 구현
    public void call(String callNum) {
        System.out.println(callNum + " 로 전화를 겁니다 뚜르르르르....");
    }

    // 문자 기능 구현
    public void message(String messageNum, String message) {
        System.out.println(messageNum + " 로 \"" + message + "\" 메시지를 전송합니다.");
    }


}
