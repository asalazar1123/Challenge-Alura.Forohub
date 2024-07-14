package foro.hub.forohub.domain.topico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;


    public DatosDetalleTopico agregar(DatosAgregarTopico datos){

        var consulta = new Topico(null, datos.titulo(), datos.mensaje(), datos.fechaCreacion(), datos.status(),
                datos.autor(), datos.curso());

        topicoRepository.save(consulta);

        return new DatosDetalleTopico(consulta);
    }
}
