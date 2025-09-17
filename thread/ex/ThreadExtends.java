package thread.ex;

public class ThreadExtends extends Thread{

    private String message;

    public ThreadExtends(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        // 스레드로 수행시킬 코드 작성

        for(int i = 0; i < 10; i++) {
            System.out.println(message);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
