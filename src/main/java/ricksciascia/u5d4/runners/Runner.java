package ricksciascia.u5d4.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ricksciascia.u5d4.entities.Drink;
import ricksciascia.u5d4.entities.Menu;
import ricksciascia.u5d4.entities.Pizza;
import ricksciascia.u5d4.entities.Topping;
import ricksciascia.u5d4.repositories.MenuRepository;
import ricksciascia.u5d4.services.MenuService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Component
public class Runner implements CommandLineRunner {
    private final MenuService menuService;

    @Autowired //non servirebbe ma vbb
    public Runner(MenuService menuService) {
        this.menuService = menuService;
    }

//    @Autowired
//    public Runner(MenuRepository menuRepo) {
//        this.menuRepo = menuRepo;
//    }

    @Override
    public void run(String... args) throws Exception {
        Topping pomodoro = new Topping("Pomodoro",150,0.5);
        Topping mozzarella = new Topping("Mozzarella",350,0.5);
        Topping funghi = new Topping("Funghi",150,1.5);
        Topping salsiccia = new Topping("Salsiccia",300,1.5);
        Drink cocacola = new Drink("Coca-Cola 500ml",250,3.5);
        Drink acqua = new Drink("Acqua 500ml",250,1.5);
        Drink birraIchnusa = new Drink("Birra Ichnusa Non Filtrata 500ml",210,4.0);



        try{
//            menuService.saveElementoMenu(cocacola);
//            menuService.saveElementoMenu(acqua);
//            menuService.saveElementoMenu(birraIchnusa);
            Menu pomodoroFromDb = menuService.findById(1);
            Menu mozzarellaFromDb = menuService.findById(2);
            Menu funghiFromDb = menuService.findById(3);
            Menu salsicciaFromDb = menuService.findById(4);

//            REMINDER per il FUTURO ME che potrà avere sicuramente questo problema:

//            PROBLEMA gli elementi del MENU qui sopra sono Topping ma io li ho memorizzati come elementi generici,
//            il costruttore delle pizze però vuole dei Topping quindi dovrei fare casting posso farlo in 2 modi: quello semplice ed intuitivo scommentat sotto con un ArrayList
//            o quello un po'più PROFESSIONAL ovvero con l'uso degli Stream.
//            in pratica apro uno stream e faccio un map di ogni elemento castandolo a (Topping) gran figata..


//            List<Topping> listaIngredientiMargCastedWithStream = Stream.of(pomodoroFromDb, mozzarellaFromDb, funghiFromDb, salsicciaFromDb)
//                    .map(m -> (Topping) m) // Casting esplicito di ogni elemento del Menu
//                    .toList();


//            semplice ed intuitivo:
//            ArrayList<Topping> listaIngredientiMarg = new ArrayList<>(Arrays.asList(
//                    (Topping)pomodoroFromDb,(Topping)mozzarellaFromDb,(Topping)funghiFromDb,(Topping)salsicciaFromDb));
//
//            Pizza pizzaMargherita = new Pizza("Pizza Tutto",800,5,listaIngredientiMarg);
//            menuService.saveElementoMenu(pizzaMargherita);
//            menuService.findAndUpdateById(8,pizzaMargherita);
//            menuService.trovaNelMenuConNome("Pizza Tutto").forEach(System.out::println);
//            menuService.trovaNelMenuConPrezzo(1.5).forEach(System.out::println);

//            System.out.println(pomodoroFromDb);
//            System.out.println("Ciao");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
