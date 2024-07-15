package com.forohub.ForoHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DatosRegistroTopico(

        @NotBlank
        String titulo,


        @NotBlank
        String mensaje,

        @NotBlank
        String curso,

        LocalDateTime fechaCreacion
) {
}
