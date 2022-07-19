package com.baz.examen.service.impl.remote;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.baz.examen.model.ComentarioDTO;
import com.baz.examen.model.PublicacionDTO;
import com.baz.examen.service.iface.remote.EntityPublicacionesServiceRemote;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EntityPublicacionesServiceFallback implements EntityPublicacionesServiceRemote {
	
	@Override	
	public PublicacionDTO guardarPublicacion(PublicacionDTO publicacionDTO) {
	log.error("Error controlado, servicio entity publicaciones con endpoint /publicaciones no disponible, evitando timeout");
		return new PublicacionDTO();
	}

	@Override
	public List<PublicacionDTO> consultarPublicacionesConComentarios(Integer idUsuario) {
		log.error("Error controlado, servicio entity publicaciones con endpoint /publicaciones/{idUsuario} no disponible, evitando timeout");
		return new ArrayList<PublicacionDTO>();
	}

	@Override
	public ComentarioDTO guardarComentario(ComentarioDTO comentarioDTO) {
		log.error("Error controlado, servicio entity publicaciones con endpoint /comentarios no disponible, evitando timeout");
		return new ComentarioDTO();
	}

}
