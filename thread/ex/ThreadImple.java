package thread.ex;

public class ThreadImple implements Runnable{

    private String message;

    public ThreadImple(String message) {
        this.message = message;
    }

    @Override
    public void run() {

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
