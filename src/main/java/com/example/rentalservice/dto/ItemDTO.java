
package com.example.rentalservice.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ItemDTO {
    private Long id;
    private String name;
    private String description;
    private Double pricePerDay;
    private Long categoryId;
}
