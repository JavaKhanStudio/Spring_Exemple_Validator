package com.jks.validator.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ValidationExampleDTO {

    @NotNull(message = "id must not be null")
    private Long id;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotBlank(message = "Username must not be blank")
    @Size(min = 5, max = 10, message = "Username must be between 5 and 10 characters")
    private String username;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Age must not be blank")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be at most 100")
    private Integer age;

    @NotBlank(message = "Phone number must not be blank")
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid")
    private String phoneNumber;

    @AssertTrue(message = "Must agree to terms")
    private boolean agreedToTerms;

    @NotEmpty(message = "List of roles must not be empty")
    private List<@NotBlank String> roles;

    @Past(message = "Birthdate must be in the past")
    private java.time.LocalDate birthdate;
}

