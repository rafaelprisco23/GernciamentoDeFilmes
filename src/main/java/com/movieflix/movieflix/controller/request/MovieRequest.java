package com.movieflix.movieflix.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

public record MovieRequest(@Schema(type = "string", description = "nome do filme")
                           @NotEmpty(message = "Título do filme é obrigatório.")
                           String title,
                           @Schema(type = "string", description = "descrição do filme")
                           String description,
                           @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
                           @Schema(type = "date", description = "data de lançamento do filme")
                           LocalDate releaseDate,
                           @Schema(type = "double", description = "avaliação do filme")
                           double rating,

                           @Schema(type = "array", description = "categorias do filme")
                           List<Long> categories,
                           @Schema(type = "array", description = "plataformas de streaming")
                           List<Long> streaming
                           ) {
}
