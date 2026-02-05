package ricksciascia.u5d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class Pizza extends Menu {
    @ManyToMany
    @JoinTable(name = "pizzas_toppings",
            joinColumns = @JoinColumn(name = "pizza_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "topping_id",nullable = false))
    private List<Topping> listaIngredienti;

    public Pizza(String nome, int calorie, double prezzo, List<Topping> listaIngredienti) {
        super(nome,calorie,prezzo);
        this.listaIngredienti = listaIngredienti;
    }

    public String toString() {
        String var10000 = super.getNome();
        return "Pizza: " + var10000 + " " + super.getCalorie() + " " + super.getPrezzo() + " lista Ingredienti: " + String.valueOf(this.listaIngredienti) + " ";
    }
}