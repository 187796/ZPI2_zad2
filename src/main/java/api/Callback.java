package api;

import java.util.concurrent.Callable;

/**
 * Created by 187796 on 10/18/2016.
 */
public interface Callback extends Callable {
    Object call();
}
