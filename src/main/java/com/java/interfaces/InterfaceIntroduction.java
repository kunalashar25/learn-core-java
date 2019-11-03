package com.java.interfaces;

public interface InterfaceIntroduction {
	/** Introduction **/

	// Definition 1: Any service requirement specification (SRS) is considered as an Interface.

	// Example 1: JDBC API acts as requirement specification to develop database driver. Database vendor is responsible
	// to implement JDBC API

	// JDBC API (developed by SUN - Requirement Specification)
	// |-- Oracle Driver (Vendor - Implements JDBC API)
	// |-- MySQl Driver (Vendor - Implements JDBC API)
	// |-- DB2 Driver (Vendor - Implements JDBC API)

	// Example 2: Servlet API acts as requirement specification to develop Web Server. WebServer vendor is responsible
	// to implement servlet api.

	// Servlet API (developed by SUN - Requirement Specification)
	// |-- Apache Tomcat Server (Vendor - Implements Servlet API)
	// |-- Oracle Weblogic Server (Vendor - Implements Servlet API)
	// |-- IBM WebSphere Server (Vendor - Implements Servlet API)

	// Definition 2: From client perspective, an interface defines the set of services what client is expecting. From
	// service provider perspective, an interface defines the set of services that provider is offering. Hence, any
	// contract between client and service provider is considered as an interface.

	// Example: Through Bank ATM GUI Screen, bank are highlighting the set of services that they're offering. At same
	// time the same GUI Screen represents the set of services what customer is expecting. Hence, this GUI screen acts
	// as contract between customer and bank.

	// Definition 3: In interface all methods are abstract by default. Hence, interface is considered as 100% pure
	// abstract class.

	/** Summary Definition **/

	// Any SRS or any contract between client and service provider or 100% pure abstract class is nothing but interface.

}
