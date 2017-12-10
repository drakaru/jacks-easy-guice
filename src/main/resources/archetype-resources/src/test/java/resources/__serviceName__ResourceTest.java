#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.resources;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ${package}.service.${serviceName}Service;
import ${package}.util.ResourceUtil;


import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ${serviceName}ResourceTest {

    @InjectMocks
    private ${serviceName}Resource resource = new ${serviceName}Resource();

    @Mock
    private ${serviceName}Service service;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void endpoint_test() {
        // assemble

        // act

        // assert

    }

}
