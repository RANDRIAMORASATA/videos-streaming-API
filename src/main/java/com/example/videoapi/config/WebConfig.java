package com.example.videoapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Autoriser CORS pour tous les points de terminaison
        registry.addMapping("/**") // Applique CORS à toutes les routes
                .allowedOrigins("http://localhost:3000") // Autoriser les requêtes venant de localhost:3000
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Autoriser ces méthodes HTTP
                .allowedHeaders("*") // Autoriser tous les en-têtes HTTP
                .allowCredentials(true); // Autoriser les cookies et les informations d'authentification
    }
}
