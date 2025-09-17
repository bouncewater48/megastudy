package thread.ex;

public class Ex01 {
    public static void main(String[] args) {

        ThreadExtends thread1 = new ThreadExtends("###");
        ThreadExtends thread2 = new ThreadExtends("@@@");

        thread1.start();
        thread2.start();

        ThreadImple threadImple = new ThreadImple("$$$");

        Thread thread3 = new Thread(threadImple);
        thread3.start();

        // 특정 스레드가 끝날때까지 대기
        thread3.join();

        System.out.println("main thread End");


    }
}
