package com.jcaa.universidad_hexagonal.core.service;

import com.jcaa.universidad_hexagonal.core.domain.Universidad;
import com.jcaa.universidad_hexagonal.core.port.in.*;
import com.jcaa.universidad_hexagonal.core.port.out.UniversityRepositoryPort;

import java.util.List;

public class UniversityService implements
        CreateUniversityUseCase,
        GetUniversityUseCase,
        UpdateUniversityUseCase,
        DeleteUniversityUseCase {

    private final UniversityRepositoryPort repository;

    public UniversityService(UniversityRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public Universidad create(Universidad universidad) {
        return repository.save(universidad);
    }

    @Override
    public Universidad findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Universidad no encontrada"));
    }

    @Override
    public List<Universidad> findAll() {
        return repository.findAll();
    }

    @Override
    public Universidad update(Long id, Universidad universidad) {
        Universidad existing = findById(id);

        // Mantiene el ID original
        universidad.setId(existing.getId());

        return repository.save(universidad);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
