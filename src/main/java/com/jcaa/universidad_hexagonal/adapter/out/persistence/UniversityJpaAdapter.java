package com.jcaa.universidad_hexagonal.adapter.out.persistence;


import com.jcaa.universidad_hexagonal.core.domain.Universidad;
import com.jcaa.universidad_hexagonal.core.port.out.UniversityRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UniversityJpaAdapter implements UniversityRepositoryPort {

    private final SpringDataUniversityRepository repository;

    public UniversityJpaAdapter(SpringDataUniversityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Universidad save(Universidad universidad) {
        UniversityEntity entity = toEntity(universidad);
        UniversityEntity saved = repository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<Universidad> findById(Long id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<Universidad> findAll() {
        return repository.findAll()
                .stream()
                .map(this::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    // Mappers -------------------
    private UniversityEntity toEntity(Universidad u) {
        return new UniversityEntity(
                u.getId(),
                u.getNombre(),
                u.getCategoria(),
                u.getWeb(),
                u.getRector(),
                u.getEmail(),
                u.getAcceso(),
                u.getTelefono(),
                u.getCiudad(),
                u.getNumeroCarreras(),
                u.getNumSedes()
        );
    }

    private Universidad toDomain(UniversityEntity e) {
        return new Universidad(
                e.getId(),
                e.getNombre(),
                e.getCategoria(),
                e.getWeb(),
                e.getRector(),
                e.getEmail(),
                e.getAcceso(),
                e.getTelefono(),
                e.getCiudad(),
                e.getNumeroCarreras(),
                e.getNumSedes()
        );
    }
}
