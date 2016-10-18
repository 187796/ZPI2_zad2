package api;

/**
 * Created by 187796 on 10/18/2016.
 */
public interface Api {
    void setData(String fileName, String goodString, String badString);
    void setCallback(Callback callback);
    void writeToFile();
}
