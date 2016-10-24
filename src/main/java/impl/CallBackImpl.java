package impl;

import api.Callback;

import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Created by Damian Bartos
 * 24.10.2016.
 */
public class CallBackImpl implements Callback, Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("czy ponowić zapis t/n");
        return scanner.next().toLowerCase().equals("t");
    }
}
