package impl;

import api.Callback;

import java.util.Scanner;

/**
 * Created by Damian Bartos
 * 24.10.2016.
 */
public class CallBackImpl implements Callback{
    @Override
    public Boolean call()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("czy ponowic zapis t/n");
        return scanner.next().toLowerCase().equals("t");
    }
}
