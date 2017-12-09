#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util.properties;

public enum PropertiesKeys {
    EAXMPLE_PROPERTY("example.property");

    String key;

    PropertiesKeys(String key) {
        this.key = key;
    }
}
