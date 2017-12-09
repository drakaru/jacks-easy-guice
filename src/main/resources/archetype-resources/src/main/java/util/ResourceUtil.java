#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import java.io.InputStream;

public class ResourceUtil {

    public static InputStream getResource(String path) {
        ClassLoader classLoader = ResourceUtil.class.getClassLoader();
        return classLoader.getResourceAsStream(path);
    }

}
