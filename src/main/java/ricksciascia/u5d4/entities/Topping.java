package ricksciascia.u5d4.entities;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Topping extends Menu{

    public Topping(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }
}