package foro.hub.forohub.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosAgregarTopico(
        Long id,
        @NotNull String titulo,
        @NotNull String mensaje,
        @NotNull LocalDateTime fechaCreacion,
        @NotNull Boolean status,
        @NotNull String autor,
        @NotNull String curso
) {
}
