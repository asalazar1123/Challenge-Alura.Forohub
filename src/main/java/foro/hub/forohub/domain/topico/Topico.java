package foro.hub.forohub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Boolean status;
    private String autor;
    private String curso;

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if(datosActualizarTopico.fechaCreacion() != null) {
            this.fechaCreacion = datosActualizarTopico.fechaCreacion();
        }
        if(datosActualizarTopico.status() != null) {
            this.status = datosActualizarTopico.status();
        }
        if(datosActualizarTopico.autor() != null) {
            this.autor = datosActualizarTopico.autor();
        }
        if(datosActualizarTopico.curso() != null) {
            this.curso = datosActualizarTopico.curso();
        }
    }

    public void desactivarTopico() {
        this.status = false;
    }
}
