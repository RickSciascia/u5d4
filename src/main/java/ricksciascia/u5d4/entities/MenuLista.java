package ricksciascia.u5d4.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class MenuLista {
    private List<Pizza> pizze;
    private List<Drink> drinks;
    private List<Topping> ingredienti;

    public MenuLista(List<Pizza> pizze, List<Drink> drinks, List <Topping> ingredienti){
        this.pizze = pizze;
        this.drinks = drinks;
        this.ingredienti = ingredienti;
    }

    @Override
    public String toString() {
        return " Menu: " +
                "pizze:" + pizze +
                ", drinks: " + drinks +
                ", ingredienti: " + ingredienti +
                ' ';
    }
}