package ricksciascia.u5d4.entities;

import jakarta.persistence.Entity;

@Entity
public class Drink extends Menu {
    public Drink(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }
}

