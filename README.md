REST API starter kit

Configuration :
1. Update maven's groupId and artifactIf
2. Update package names in web.xml
3. Update package name in src/main/java
4. Update package name in configuration class AppConfig.class

Launch the server :
> mvn tomcat7:run
> curl -v -X GET http://localhost:8080/AppName/hello
