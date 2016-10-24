import api.Callback;
import impl.ApiImpl;
import impl.CallBackImpl;

import java.util.Scanner;

/**
 * Created by 187796 on 10/18/2016.
 */
public class App {

    private static Scanner input = new Scanner(System.in);
    private static String wrongString;
    private static String goodString;
    private static String fileName;

    public static void main(final String[] args) {
        final ApiImpl apiImpl = new ApiImpl();
        final Callback callback = new CallBackImpl();

        doMain(apiImpl, callback);

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                if(apiImpl.doOnExit()){
                    doMain(apiImpl, callback);
                }
            }
        }));
    }

    private static void doMain(ApiImpl dynLib, Callback callback) {
        readData();

        dynLib.setData(fileName,goodString,wrongString);
        dynLib.writeToFile();
        dynLib.setCallback(callback);
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
