package com.jcaa.universidad_hexagonal.core.port.in;

import com.jcaa.universidad_hexagonal.core.domain.Universidad;

public interface UpdateUniversityUseCase {
    Universidad update(Long id, Universidad universidad);
}
