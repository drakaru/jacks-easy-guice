#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.guice;

import com.google.inject.AbstractModule;
import ${package}.resources.${serviceName}Resource;
import ${package}.service.${serviceName}Service;
import ${package}.service.${serviceName}ServiceImpl;

public class ${serviceName}ServicesModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(${serviceName}Service.class).to(${serviceName}ServiceImpl.class);
    }

}
