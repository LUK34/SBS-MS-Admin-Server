package kw.kng.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SbsMsAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbsMsAdminServerApplication.class, args);
	}

}

/*
 URL: http://localhost:1111/
 ++++++++++++++++++++++++++++++++++++++++++++++++
Steps to develop Spring Boot Admin Server Project
+++++++++++++++++++++++++++++++++++++++++++++++++

1) Create Boot application with below dependencies

		a) web-starter
		b) devtools
		c) admin-server (codecentric)

2) Configure @EnableAdminServer annotation at boot start class

3) Configure the port number and run the application (port : 1111)

4) After application started, access Admin Server UI using app-url

		URL : http://localhost:1111/
		
++++++++++++++++++++++++++++++++
Steps to work with Zipkin Server
++++++++++++++++++++++++++++++++

1) Download Zipkin server jar from website

	URL : https://zipkin.io/pages/quickstart.html

2) Run the zipkin server jar from command prompot

	Cmd : java -jar <jar-file-name>

Note: Zipkin server will run on 9411 port number

3) Access Zipkin server dashboard in browser 

	URL : http://localhost:9411/
		
 */