package impl;

import api.Api;
import api.Callback;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Damian Bartos
 * 24.10.2016.
 */
public class ApiImpl implements Api {
    private String fileName;
    private String goodString;
    private String badString;
    private Callback callback;

    public void setData(String fileName, String goodString, String badString) {
        this.fileName = fileName;
        this.goodString = goodString;
        this.badString = badString;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void writeToFile() {
        boolean result;
        File file = new File(fileName);
        if (file.exists()) {
            result = false;
        } else {
            try (PrintWriter writer = new PrintWriter(fileName)) {
                writer.println("Hello World!");
                result = true;
            } catch (FileNotFoundException e1) {
                result = false;
            }
        }
        System.out.println("Writer: " + (result ? goodString : badString));
    }
}
