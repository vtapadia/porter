package com.experiment.porter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Value("${application.enviroment}")
    String testProp;

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        JettyEmbeddedServletContainerFactory jetty = new JettyEmbeddedServletContainerFactory();
        jetty.setContextPath("/porter");
        jetty.setPort(8272);
        System.out.println(testProp);
        try {
            //jetty.setDocumentRoot(new File(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jetty;
    }

}
