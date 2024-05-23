package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
@Entity
@Data
@AllArgsConstructor
@SuperBuilder

public class  ProductHousing extends Product{

    private int height;
    private int width;

    public ProductHousing() {
        super();
    }
}

