#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

public class TomcatWebContainer {

    private static final String webAppDirLocation = (new File("src/main/webapp")).getAbsolutePath();
    private static final String webXmlLocation = "src/main/webapp/WEB-INF/web.xml";

    private Tomcat tomcat;

    public TomcatWebContainer() {
        this.tomcat = new Tomcat();
    }

    public TomcatWebContainer(Tomcat tomcat) {
        this.tomcat = tomcat;
    }

    public TomcatWebContainer(int port, String contextPath) {
        initialiseServer(port, contextPath);
    }

    public void start() throws LifecycleException {
        this.tomcat.start();

        // for some reason connector initialisation was removed from tomcat.start() in 9.0?
        // maybe this can be removed in the future
        tomcat.getConnector();
    }

    public void stop() throws LifecycleException {
        this.tomcat.stop();
    }

    private void initialiseServer(int port, String contextPath) {
        tomcat = new Tomcat();
        tomcat.setPort(port);

        try {
            Context e = tomcat.addWebapp(contextPath, webAppDirLocation);
            e.setConfigFile(getUrlFromPath(webXmlLocation));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void await() {
        tomcat.getServer().await();
    }

    private URL getUrlFromPath(String path) throws MalformedURLException {
        return Paths.get(path).toUri().toURL();
    }

}