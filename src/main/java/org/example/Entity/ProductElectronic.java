package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
@Entity
@Data
@AllArgsConstructor
@SuperBuilder

public class ProductElectronic extends Product{
    private double batteryDuration;

    public ProductElectronic() {

    }
}
