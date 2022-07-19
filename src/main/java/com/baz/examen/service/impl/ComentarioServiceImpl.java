package com.baz.examen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baz.examen.model.ComentarioDTO;
import com.baz.examen.service.iface.ComentarioService;
import com.baz.examen.service.iface.remote.EntityPublicacionesServiceRemote;

@Service
public class ComentarioServiceImpl implements ComentarioService {
	
	@Autowired
	private EntityPublicacionesServiceRemote entityPublicacionesServiceRemote;

	@Override
	public ComentarioDTO guardarComentario(ComentarioDTO comentarioDTO) {
		return entityPublicacionesServiceRemote.guardarComentario(comentarioDTO);
	}		

}
