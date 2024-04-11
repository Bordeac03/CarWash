package com.car.wash.CRBLA.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private Long userID;
    private Long carWashID;
    private Long serviceID;
    private Integer ts;
    private Boolean closeBy;
    private Boolean active;
}
