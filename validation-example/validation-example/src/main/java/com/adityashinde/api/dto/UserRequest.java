package com.adityashinde.api.dto;

import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "username should not be null")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number entered")
    private String mobile;

    private String gender;

    @Min(18)
    @Max(60)
    private Integer age;

    @NotBlank
    private String nationality;
}
