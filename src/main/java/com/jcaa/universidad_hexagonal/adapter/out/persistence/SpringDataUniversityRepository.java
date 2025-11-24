package com.jcaa.universidad_hexagonal.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUniversityRepository
        extends JpaRepository<UniversityEntity, Long> {
}
