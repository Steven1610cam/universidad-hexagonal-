package com.jcaa.universidad_hexagonal.adapter.in.web;

import com.jcaa.universidad_hexagonal.core.domain.Universidad;
import com.jcaa.universidad_hexagonal.core.port.in.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universidades")
public class UniversityController {

    private final CreateUniversityUseCase createUseCase;
    private final GetUniversityUseCase getUseCase;
    private final UpdateUniversityUseCase updateUseCase;
    private final DeleteUniversityUseCase deleteUseCase;

    public UniversityController(
            CreateUniversityUseCase createUseCase,
            GetUniversityUseCase getUseCase,
            UpdateUniversityUseCase updateUseCase,
            DeleteUniversityUseCase deleteUseCase
    ) {
        this.createUseCase = createUseCase;
        this.getUseCase = getUseCase;
        this.updateUseCase = updateUseCase;
        this.deleteUseCase = deleteUseCase;
    }

    @GetMapping
    public List<Universidad> findAll() {
        return getUseCase.findAll();
    }

    @PostMapping
    public Universidad create(@RequestBody Universidad universidad) {
        return createUseCase.create(universidad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Universidad> update(
            @PathVariable Long id,
            @RequestBody Universidad universidad
    ) {
        return ResponseEntity.ok(updateUseCase.update(id, universidad));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        deleteUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
