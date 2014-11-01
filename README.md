Geek-Coder-News-Server
======================

## Getting Started(development)

### Introduction
This project is back-end for Geek-coder-News  
Geek-Coder-News is client side for android platform(https://github.com/Geek-Coder/Geek-Coder-News)  
Provide data interface and service.

Use Apache Maven to  simplify the build processes  
Use Spring Framework to provides a comprehensive programming and configuration model for modern Java-based enterprise applications  
Use git it for version control  
Use mysql as data storage  
Use eclipse as develop tools  
Use Junit 4 to test

### Requirements  

JDK 6+ for Spring Framework 4.x  
JDK 5+ for Spring Framework 3.x  
Apache Tomcat 6.0  
Maven build plugins  
Git  
Mysql 5.6 and Mysql workbench

### Environment setup

#### Install and config Jdk

Download jdk from Oracle(http://www.oracle.com/technetwork/java/javase/downloads/index.html)  
Config JAVA_HOME(jdk root directory), CLASSPATH and Path  

	"JAVA_HOME": "C:\Program Files\Java\jdk1.8.0_25",
	"CLASSPATH": ".;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar",
	"Path": "%JAVA_HOME%\jre\bin";  

```shell
java -version
```

#### Install Apache tomcat

Download tomcat from Apache website(http://tomcat.apache.org/) and unzip the file to a disk  

#### Install Apache Maven

Download maven from Apache website(http://maven.apache.org/download.cgi)


```shell
mvn -version
```
Maven commands listed as follow

```shell
mvn clean
mvn compiler
mvn install
mvn clean install
mvn eclipse:eclipse
```

#### Git configuration

Run following command in Git Bash and the root folder of eShop project:

```shell
git config --local user.name "<name>"
git config --local user.email "<email>"
git config --local core.excludesfile $HOME/.gitignore
git config --local core.autocrlf input
git config --local color.ui true
git config --local gui.encoding utf-8
git config --local push.default tracking
git config --local branch.autosetupmerge always
git config --local branch.autosetuprebase always
git config --local alias.co checkout
git config --local alias.st status
git config --local alias.br branch
```

Note: `name` and `email` should be modified manually.


### Begin Your Project

#### Create maven web Project

```shell
mvn archetype:create -DgroupId=com.geekcoder.server -DartifactId=Geek-Coder-News-Server -DarchetypeArtifactId=maven-archetype-webapp
```
then use maven command to convert maven project to a eclipse project

```sheel
mvn eclipse:eclipse
```

#### Config pom.xml

Add Spring Framework, Spring MVC, Junit, Mysql-Connector

```sheel
  <dependencies>
   	 <!--add spring framework -->  
     <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-web</artifactId>
         <version>3.0.5.RELEASE</version>
     </dependency>
     <!-- add spring mvc -->  
     <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-webmvc</artifactId>
         <version>3.0.5.RELEASE</version>
     </dependency>
     <!-- add servlet -->
	 <dependency> 
	   <groupId>javax.servlet</groupId> 
	   <artifactId>servlet-api</artifactId> 
	   <version>2.5</version> 
	   <scope>provided</scope> 
	</dependency>
	<!-- add mysql-connector -->
	<dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.33</version>
	</dependency>
    <!-- add junit --> 
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```

#### Config web.xml for Spring Framework

```sheel
    <context-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>
          /WEB-INF/ContextLoaderListener.xml
      </param-value>
	</context-param>
	   <listener>
	     <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
    <filter>
        <filter-name>CharacterEncodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>utf-8</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>CharacterEncodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
    <servlet>
        <servlet-name>geekcoder</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>geekcoder</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
```
#### Config dispacher-servlet.xml

```sheel
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!-- HandlerMapping -->
    <bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"/>
    <!-- HandlerAdapter -->
    <bean class="org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter"/>
    <!-- ViewResolver -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
        <property name="prefix" value="/WEB-INF/jsp/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
    <!--controller mapping-->
    <bean name="/insertNewsController" class="com.geekcoder.server.controller.InsertNewsController"/>
    <bean name="/updateNewsController" class="com.geekcoder.server.controller.UpdateNewsController"/>
    <bean name="/deleteNewsController" class="com.geekcoder.server.controller.DeleteNewsController"/>
    <bean name="/getNewsByIdController" class="com.geekcoder.server.controller.GetNewsByIdController"/>
    <bean name="/insertCategoryController" class="com.geekcoder.server.controller.InsertCategoryController"/>
    <bean name="/updateCategoryController" class="com.geekcoder.server.controller.UpdateCategoryController"/>
    <bean name="/deleteCategoryController" class="com.geekcoder.server.controller.DeleteCategoryController"/>
    <bean name="/getCategoryByIdController" class="com.geekcoder.server.controller.GetCategoryByIdController"/>  
</beans>
```
### Deploy WAR To Tomcat

deploy war file to tomcat and enjoy your works!

