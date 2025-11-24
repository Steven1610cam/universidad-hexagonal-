package com.jcaa.universidad_hexagonal.core.port.out;

import com.jcaa.universidad_hexagonal.core.domain.Universidad;
import java.util.List;
import java.util.Optional;

public interface UniversityRepositoryPort {

    Universidad save(Universidad universidad);

    Optional<Universidad> findById(Long id);

    List<Universidad> findAll();

    void deleteById(Long id);
}