package ricksciascia.u5d4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ricksciascia.u5d4.entities.Menu;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {



//   DERIVED QUERIES
    List<Menu> findByNome(String nome);
    List<Menu> findByPrezzo(double prezzo);

//    JPQL QUERIES
    @Query("SELECT m FROM Menu m WHERE m.nome = :nome")
    List<Menu> filterByName(String nome);

}
