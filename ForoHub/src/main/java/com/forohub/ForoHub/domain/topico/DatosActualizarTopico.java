package com.forohub.ForoHub.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        @NotNull
        Long id,

        String titulo,

        String mensaje,

        String curso,

        LocalDateTime fechaCreacion
) {
}
