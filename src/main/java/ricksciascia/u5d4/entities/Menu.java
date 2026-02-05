package ricksciascia.u5d4.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "elementi_menu")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int calorie;
    @Column(nullable = false)
    private double prezzo;

    public Menu(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}