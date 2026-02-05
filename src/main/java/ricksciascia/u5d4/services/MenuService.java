package ricksciascia.u5d4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricksciascia.u5d4.entities.Menu;
import ricksciascia.u5d4.exceptions.NotFoundException;
import ricksciascia.u5d4.exceptions.ValidationException;
import ricksciascia.u5d4.repositories.MenuRepository;

import java.util.List;

@Service
public class MenuService {
    private final MenuRepository menuRepo;

    @Autowired
    public MenuService(MenuRepository menuRepo) {
        this.menuRepo = menuRepo;
    }

    public void saveElementoMenu(Menu newElementoMenu) {
        if(newElementoMenu.getNome().length()<3) throw new ValidationException("Il nome dell elemento del menu non può essere inferiore a 3 caratteri");
        if(newElementoMenu.getPrezzo()<=0) throw new ValidationException("Un prodotto non può essere con prezzo inferiore o uguale a 0");
        this.menuRepo.save(newElementoMenu);
        System.out.println("Elemento del menú salvato/aggiornato correttamente!");
    }
    public List<Menu> findAll() {
        return menuRepo.findAll();
    }

    public Menu findById(long elementId) {
        return menuRepo.findById(elementId).orElseThrow(()->new NotFoundException("Elemento con id" + elementId + " non trovato!"));
    }

    public void findAndUpdateById(long id, Menu elementoMenuDaAggiornare) {
        Menu elementoTrovato = this.findById(id);
        elementoTrovato.setNome(elementoMenuDaAggiornare.getNome());
        elementoTrovato.setCalorie(elementoMenuDaAggiornare.getCalorie());
        elementoTrovato.setPrezzo(elementoMenuDaAggiornare.getPrezzo());
        this.saveElementoMenu(elementoTrovato);
    }

    public void findAndDeleteById(long id) {
        Menu elementoTrovato = this.findById(id);
        menuRepo.deleteById(elementoTrovato.getId());
    }

    public List<Menu> trovaNelMenuConNome(String nome) {
        return menuRepo.findByNome(nome);
    }
    public List<Menu> trovaNelMenuConPrezzo(double prezzo) {
        return menuRepo.findByPrezzo(prezzo);
    }
}
