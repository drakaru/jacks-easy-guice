#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.guice.providers;

import com.google.inject.Provider;

import java.util.Properties;

import static ${package}.util.ResourceUtil.getResource;

public class PropertiesProvider implements Provider<Properties> {

    private static Properties properties = new Properties();

    static {
        try {
            properties.load(getResource("${artifactId}.properties"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Properties get() {
        return properties;
    }

    public static Properties getProperties() {
        return properties;
    }
 }
