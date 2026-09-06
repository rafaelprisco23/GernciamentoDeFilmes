package com.movieflix.movieflix.controller.request;

import jakarta.validation.constraints.NotEmpty;

public record CategoryRequest(@NotEmpty(message = "nome da categoria é obrigatório.") String name) {
}
