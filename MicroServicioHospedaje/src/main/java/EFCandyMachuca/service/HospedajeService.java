package EFCandyMachuca.service;

import java.util.List;

import EFCandyMachuca.model.Hospedaje;





public interface HospedajeService {
	List<Hospedaje> listar();
	Hospedaje ObtenerId(Integer id);	
	void guardar(Hospedaje hospedaje);
	void eliminar(Integer id);
	void actualizar(Hospedaje hospedaje);
	void asignarTuristaHospedaje();

}
