package az.developia;

public class LogUtil {
    public static void printWithThread(String log) {
        System.out.println(Thread.currentThread().getName() + " || " + log);
    }
}
