package ricksciascia.u5d4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ricksciascia.u5d4.entities.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
