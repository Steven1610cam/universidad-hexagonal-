package com.jcaa.universidad_hexagonal;

import com.jcaa.universidad_hexagonal.core.port.out.UniversityRepositoryPort;
import com.jcaa.universidad_hexagonal.core.service.UniversityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UniversityService universityService(UniversityRepositoryPort repositoryPort) {
        return new UniversityService(repositoryPort);
    }
}
