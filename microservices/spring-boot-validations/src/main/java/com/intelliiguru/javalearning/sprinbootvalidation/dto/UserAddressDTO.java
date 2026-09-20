package com.intelliiguru.javalearning.sprinbootvalidation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class UserAddressDTO {
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String street;
    @NotBlank
    private String zipCode;
    @NotBlank
    private String landMark;
}
