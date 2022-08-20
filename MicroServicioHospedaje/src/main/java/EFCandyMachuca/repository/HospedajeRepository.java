package EFCandyMachuca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFCandyMachuca.model.Hospedaje;



@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer> {

}
