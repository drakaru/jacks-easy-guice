#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.guice;

import com.google.inject.AbstractModule;
import ${package}.resources.${serviceName}Resource;

public class ${serviceName}ResourcesModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(${serviceName}Resource.class);
    }

}
