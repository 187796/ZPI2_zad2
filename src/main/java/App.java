import api.Callback;

import java.util.Scanner;

/**
 * Created by 187796 on 10/18/2016.
 */
public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                //callback.call();
            }
        }));
    }

    private static String readValue(String message) {
        System.out.println(message);
        return input.nextLine();
    }
}
