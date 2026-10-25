package io.github.makisvarv.auth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegistrationRequest(
        @JsonProperty("first_name") @NotNull String firstName,
        @JsonProperty("last_name") @NotNull String lastName,
        @NotEmpty @Email  String email,
        @NotNull @Size(min=8) String password,
        String phone
) {}
