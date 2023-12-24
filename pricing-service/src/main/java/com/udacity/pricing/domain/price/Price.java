package com.udacity.pricing.domain.price;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
public class Price {

    private String currency;
    private BigDecimal price;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;

}
