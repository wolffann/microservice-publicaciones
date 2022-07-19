package com.baz.examen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baz.examen.model.PublicacionDTO;
import com.baz.examen.service.iface.PublicacionService;
import com.baz.examen.service.iface.remote.EntityPublicacionesServiceRemote;

@Service
public class PublicacionServiceImpl implements PublicacionService {
	
	@Autowired
	private EntityPublicacionesServiceRemote entityPublicacionesServiceRemote;
	
	@Override
	public PublicacionDTO guardarPublicacion(PublicacionDTO publicacionDTO) {
		return entityPublicacionesServiceRemote.guardarPublicacion(publicacionDTO);		
	}

	@Override
	public List<PublicacionDTO> consultarPublicacionesConComentarios(Integer idUsuario) {		
		return entityPublicacionesServiceRemote.consultarPublicacionesConComentarios(idUsuario);
	}

}
