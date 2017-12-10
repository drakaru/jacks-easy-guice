# jacks-easy-guice
Maven Archetype for JAX-RS service with Jackson, Resteasy and Guice set up with embedded tomcat

Creates a mostly blank project as a starting point to develop JAX-RS service.

Basic project structure is set up with web.xml, properties file and a main class for running embedded tomcat.

## Getting Started

Run a mvn install on this project, now you can create a new project from this archetype.

```
groupdId: uk.co.desecrated.archetype
package:jacks-easy-guice
version:1.1
```

### Required Params:
serviceName - This will be used to form class names so should be capitalised

![Parameters](https://i.gyazo.com/b8b7a9b28359a20995eb28cef15b5d0f.png)

### Running it

To make sure this is all working you can find the main class for running embedded tomcat at:

```
${groupId}.${serviceName}App
```

![Project Structure](https://i.gyazo.com/509a16745d7126a857baa0044508de7e.png)

Now you go to :

```
localhost:80/${artifactId}
```

and you should see: 

![Test URL](https://i.gyazo.com/12a9c7646215cf246321fbbf55090a95.png)


