package EFCandyMachuca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFCandyMachuca.model.HospedajeDetalle;



@Repository
public interface HospedajeTuristaRepository extends JpaRepository<HospedajeDetalle, Integer> {

}
