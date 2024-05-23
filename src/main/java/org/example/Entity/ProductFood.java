package org.example.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@SuperBuilder

public class ProductFood extends Product {
    private Date expireDate;

    public ProductFood() {
        super();
    }
}
