package EFCandyMachuca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EFCandyMachuca.dto.Turista;
import EFCandyMachuca.model.Hospedaje;
import EFCandyMachuca.model.HospedajeDetalle;
import EFCandyMachuca.model.HospedajeTuristaFK;
import EFCandyMachuca.repository.HospedajeTuristaRepository;


@Service
public class HospedajeServiceImpl implements HospedajeService {

	@Autowired
	private EFCandyMachuca.repository.HospedajeRepository repository;
	
	
	@Autowired
	private HospedajeTuristaRepository repositoryDetalle;
	
	
	@Autowired
	private EFCandyMachuca.client.OpenFeignClient feign;
	
	
	@Override
	public List<Hospedaje> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Hospedaje ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Hospedaje hospedaje) {
		// TODO Auto-generated method stub
		repository.save(hospedaje);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Hospedaje hospedaje) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(hospedaje);

	}

	@Override
	public void asignarTuristaHospedaje() {
		// TODO Auto-generated method stub
		List<Turista> listado= feign.listarTuristasSeleccionados();
		HospedajeTuristaFK fk= null;
		HospedajeDetalle detalle = null;
		
		for(Turista turista: listado) {
			
			fk=new HospedajeTuristaFK();			
			fk.setIdTurista(turista.getIdTurista());
			fk.setIdHospedaje(1);
			
			detalle = new HospedajeDetalle();
			detalle.setFk(fk);
			
			repositoryDetalle.save(detalle);
			
		}
		
	}

}
