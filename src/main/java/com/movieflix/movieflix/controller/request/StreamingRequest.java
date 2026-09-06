package com.movieflix.movieflix.controller.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

@Builder
public record StreamingRequest(@NotEmpty(message = "nome do serviço de straming é obrigatório.") String name) {
}
