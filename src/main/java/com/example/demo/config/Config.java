//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.neo4j.jdbc.http.HttpDriver;
////import org.neo4j.ogm.drivers.http.driver.HttpDriver;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//
//public class Config {
//
//	@ConfigurationProperties(prefix = "spring.datasource")
//  @Bean
//  public DataSource dataSource() {
////      String NEO4J_URL = System.getenv("NEO4J_URL");
////      if (NEO4J_URL==null) NEO4J_URL=System.getProperty("NEO4J_URL","jdbc:neo4j:http://localhost:7474");
//
////  	DataSourceBuilder factory = DataSourceBuilder
////              .create(this.properties.getClassLoader())
////              .driverClassName(this.properties.getDriverClassName())
////              .url(this.properties.getUrl())
////              .username(this.properties.getUsername())
////              .password(this.properties.getPassword());
////      return factory.build();
//
//  	DataSourceBuilder factory = DataSourceBuilder
//              .create()
//              .driverClassName(HttpDriver.class.getName())
//              .url("jdbc:neo4j:http://192.168.56.44:7474")
//              .username("neo4j")
//              .password("tomato");
//      return factory.build();
//
//  }
//
////	@ConfigurationProperties(prefix = "spring.datasource")
////    @Bean
////    public DataSource dataSource() {
//////        String NEO4J_URL = System.getenv("NEO4J_URL");
//////        if (NEO4J_URL==null) NEO4J_URL=System.getProperty("NEO4J_URL","jdbc:neo4j:http://localhost:7474");
////
//////    	DataSourceBuilder factory = DataSourceBuilder
//////                .create(this.properties.getClassLoader())
//////                .driverClassName(this.properties.getDriverClassName())
//////                .url(this.properties.getUrl())
//////                .username(this.properties.getUsername())
//////                .password(this.properties.getPassword());
//////        return factory.build();
////
////    	DataSourceBuilder factory = DataSourceBuilder
////                .create()
////                .driverClassName(HttpDriver.class.getName())
////                .url("jdbc:neo4j:http://192.168.56.44:7474")
////                .username("neo4j")
////                .password("tomato");
////        return factory.build();
////
////    }
//
//}
