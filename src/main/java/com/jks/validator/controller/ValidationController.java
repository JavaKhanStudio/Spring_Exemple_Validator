package com.jks.validator.controller;

import com.jks.validator.dto.SimpleDTO;
import com.jks.validator.dto.ValidationExampleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/validate")
public class ValidationController {

    @PostMapping("/simple")
    public ResponseEntity<String> validateDTO2(@RequestBody SimpleDTO dto) {
        System.out.println(dto);
        return ResponseEntity.ok("Validation passed");
    }

    @PostMapping("/full")
    public ResponseEntity<String> validateDTO(@RequestBody @Valid ValidationExampleDTO dto) {
        System.out.println(dto);
        return ResponseEntity.ok("Validation passed");
    }

}
