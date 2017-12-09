#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.catalina.LifecycleException;
import ${package}.util.TomcatWebContainer;

public class ${serviceName}App {

    public static void main(String[] args) {

        try {
            TomcatWebContainer tomcat = new TomcatWebContainer(80, "");
            tomcat.start();
            tomcat.await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
