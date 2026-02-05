package ricksciascia.u5d4.entities;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Drink extends Menu {
    public Drink(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }
}

