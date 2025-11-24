package com.jcaa.universidad_hexagonal.core.port.in;

import com.jcaa.universidad_hexagonal.core.domain.Universidad;
import java.util.List;

public interface GetUniversityUseCase {
    Universidad findById(Long id);
    List<Universidad> findAll();
}
