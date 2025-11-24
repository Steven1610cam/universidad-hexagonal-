package com.jcaa.universidad_hexagonal.core.port.in;

import com.jcaa.universidad_hexagonal.core.domain.Universidad;

public interface CreateUniversityUseCase {
    Universidad create(Universidad universidad);
}
