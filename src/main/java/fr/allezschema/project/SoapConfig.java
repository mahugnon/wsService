package fr.allezschema.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class SoapConfig {
String baseAddress="http://localhost:8089/wsService";
@Bean
public SimpleJaxWsServiceExporter getWs() {
	SimpleJaxWsServiceExporter exporter=new SimpleJaxWsServiceExporter();
	exporter.setBaseAddress(baseAddress);
	return exporter;
}
}
