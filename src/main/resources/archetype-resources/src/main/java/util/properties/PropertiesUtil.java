#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util.properties;

import ${package}.guice.providers.PropertiesProvider;

import java.util.Properties;

public class PropertiesUtil {

    public static Properties get() {
        return PropertiesProvider.getProperties();
    }

    public static String getProperty(String property) {
        return get().getProperty(property);
    }

    public static String getProperty(PropertiesKeys propertiesKey) {
        return get().getProperty(propertiesKey.key);
    }
}
