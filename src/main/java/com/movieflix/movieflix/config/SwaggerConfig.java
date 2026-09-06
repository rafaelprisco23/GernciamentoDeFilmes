package com.movieflix.movieflix.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI getOpenAPI(){

        Contact contact = new Contact();
        contact.setName("Rafael Pornes Prisco");
        contact.setEmail("rafaelprisco23@gmail.com");

        Info info = new Info();
                info.title("MovieFlix API");
                info.description("Aplicação para gerenciamento para catálogos de filmes e séries");
                info.version("1.0.0");
                info.contact(contact);

        return new OpenAPI().info(info);
    }
}
