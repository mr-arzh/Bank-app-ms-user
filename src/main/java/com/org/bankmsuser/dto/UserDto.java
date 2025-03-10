package com.org.bankmsuser.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    @NotBlank
    private String name;
    @Past
    private LocalDateTime dateOfBirth;
    @Pattern(regexp = "^\\+?[0-9]{10,15}$")
    private String phoneNumber;
}
