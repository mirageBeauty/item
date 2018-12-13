package com.base;

import com.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BaseApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        System.out.println("Runing..............");
        SpringApplication.run(BaseApplication.class,args);
    }

   @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BaseApplication.class);
    }

    @Bean
    public IdWorker createIdWork(){
        return new IdWorker(1,1);
    };
}
