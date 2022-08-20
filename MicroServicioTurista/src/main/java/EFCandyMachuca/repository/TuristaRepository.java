package EFCandyMachuca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TuristaRepository extends JpaRepository<EFCandyMachuca.model.Turista, Integer> {

}
