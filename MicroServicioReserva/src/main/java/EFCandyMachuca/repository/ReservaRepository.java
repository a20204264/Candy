package EFCandyMachuca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFCandyMachuca.model.Reserva;



@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
