wssecurity
==========

This codebase demonstrates main concept of WS-Security based services. JCE is assumed to be installed already. Used frameworks and technologies: Spring, CXF, Maven, Jersey.

#### Basic run instructions

1. install jars required for functioning

		mvn clean install
2. start jetty

		mvn jetty:run
3. open services

		http://localhost:8181/

#### Basic web service development

##### Implement web service 

* add xsd with base types declarations
* add .wsdl based on xsd import 
* adjust build process to generate entities from .xsd and .wsdl
* define web service implementing class 
* configure cxf jaxws endpoint reference 
* add spring web configuration
* create web application web.xml descriptor
* add jetty maven plugin to startup 

##### Implement web service client



#### Secure web service with interceptors

#### Secure web service using WS-Policy
