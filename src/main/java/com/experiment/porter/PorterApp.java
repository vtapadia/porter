package com.experiment.porter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {
        "com.experiment.porter"})
public class PorterApp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PorterApp.class, args);
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        JettyEmbeddedServletContainerFactory jetty = new JettyEmbeddedServletContainerFactory();
        jetty.setContextPath("/porter");
        jetty.setPort(88272);
        try {
            //jetty.setDocumentRoot(new File(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jetty;
    }
}
