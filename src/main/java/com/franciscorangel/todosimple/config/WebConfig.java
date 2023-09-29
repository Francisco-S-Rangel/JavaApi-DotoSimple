package com.franciscorangel.todosimple.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//O config permite que o back e front se comuniquem 
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    // a '/**' serve para permitir tudo que vem depois do localhost se não a Api iria bloquear automaticamente.
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**");
    }
    
}
