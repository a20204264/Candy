package EFCandyMachuca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFCandyMachuca.model.ReservaDetalle;



@Repository
public interface ReservaHospedajeRepository extends JpaRepository<ReservaDetalle, Integer> {

}
