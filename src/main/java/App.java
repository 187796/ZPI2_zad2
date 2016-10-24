import api.Callback;

import java.util.Scanner;

/**
 * Created by 187796 on 10/18/2016.
 */
public class App {

    private static Scanner input = new Scanner(System.in);
    private static String wrongString;
    private static String goodString;
    private static String fileName;

    public static void main(String[] args) {
        final DynLib dynLib = new DynLib();
        Callback callback = null;

        dynLib.setData(fileName,goodString,wrongString);
        dynLib.writeToFile();
        dynLib.setCallback(callback);

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                dynLib.doOnExit();
            }
        }));
    }

    private static String readValue(String message) {
        System.out.println(message);
        return input.nextLine();
    }

    public static void readData() {
        fileName = readValue("podaj nazwe pliku");
        goodString = readValue("podaj poprawny string");
        wrongString = readValue("podaj niepoprawny string");
    }
}
