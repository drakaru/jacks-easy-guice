#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import java.util.concurrent.Callable;

public class Exceptions {

    /**
     * Uncheck an operation that my otherwise throw a checked exception
     *
     * @param callable
     * @param <T>
     * @return
     */
    public static <T> T uncheck(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
}
