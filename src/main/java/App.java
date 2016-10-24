import api.Callback;

/**
 * Created by 187796 on 10/18/2016.
 */
public class App {
    public static void main(String[] args) {

        Callback callback;
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                //callback.call();
            }
        }));
    }
}
