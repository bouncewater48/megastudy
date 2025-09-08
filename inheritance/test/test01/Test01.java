package inheritance.test.test01;

public class Test01 {

    //    1. iPod Touch 와 iPhone
//    아래 iPod Touch Class를 구성하였다.
//    public class IPodTouch {
//
//        private String maker;
//        private String model;
//
//        public IPodTouch() {
//            this.maker = "apple";
//            this.model = "iPodTouch";
//        }
//
//        public void setModel(String model) {
//            this.model = model;
//        }
//
//        public void internetBrowsing(String url) {
//            System.out.println(url + " 로딩중...");
//            System.out.println("로딩 완료");
//        }
//
//        public void playMusic(String musicName) {
//            System.out.println(musicName + " 재생 시작");
//        }
//
//        public String infoString() {
//            return this.maker + " - " + this.model;
//        }
//    }
//    iPod Touch Class를 상속받은 iPhone Class를 설계하세요.
//    iPhone에는 아래와 같은 추가 기능이 포함되어 있습니다.
//            전화하기, 메시지 보내기
//
//    iPhone 객체를 생성하여 아래와 같이 출력하세요.
//    apple - iPhone
//    전화 번호 : 010-1234-5678
//    https://www.google.com 로딩중...
//    로딩 완료
//010-000-0000 로 통화 중
//010-1111-2222 로 ㅋㅋㅋㅋ 전송
    public static void main(String[] args) {


        IPhone iphone = new IPhone("iPhone", "010-1234-5678");

        // 정보 출력
        System.out.println(iphone.infoString());
        System.out.println("전화 번호 : " + iphone.getPhoneNumber());

        // 인터넷 브라우징
        iphone.internetBrowsing("https://www.google.com");

        // 전화
        iphone.calling("010-000-0000");

        // 메시지
        iphone.message("010-1111-2222", "ㅋㅋㅋㅋ");

    }
}
