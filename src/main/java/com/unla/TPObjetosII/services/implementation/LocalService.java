package com.unla.TPObjetosII.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.TPObjetosII.converters.LocalConverter;
import com.unla.TPObjetosII.entities.Local;
import com.unla.TPObjetosII.models.LocalModel;
import com.unla.TPObjetosII.repositories.ILocalRepository;
import com.unla.TPObjetosII.services.ILocalService;

@Service("localService")
public class LocalService implements ILocalService{
	
	@Autowired
	@Qualifier("localRepository")
	private ILocalRepository localRepository;
	
	@Autowired
	@Qualifier("localConverter")
	private LocalConverter localConverter;

	@Override
	public LocalModel insertOrUpdate(LocalModel localModel) throws Exception {
		if(localRepository.findByTelefono(localModel.getTelefono())!=null) throw new Exception("El telefono ya existe");
		return localConverter.entityToModel(localRepository.save(localConverter.modelToEntity(localModel)));
	}

	@Override
	public List<Local> getAll() {
		return localRepository.findAll();
	}
	
	@Override
	public LocalModel getById(int idLocal) {
		return localConverter.entityToModel(localRepository.findByIdLocal(idLocal));
	}

	@Override
	public boolean remove(int idLocal) {
		try {
			localRepository.deleteById(idLocal);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
