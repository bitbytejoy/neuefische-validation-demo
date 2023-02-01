package de.neuefische.neuefischevalidationdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String id;

    @NotBlank
    private String brand;

    @NotNull
    @Size(min = 2, max = 20)
    private String model;

    @Min(1900)
    private int year;

    private String color;

    @NotEmpty
    private List<@NotNull @Size(min = 1) String> features;
}
