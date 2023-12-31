package com.udacity.vehicles.client.prices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Price {

    private String currency;
    private BigDecimal price;
    private Long vehicleId;

}
