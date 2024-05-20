package br.com.fiap.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class EstadoValidoValidator implements ConstraintValidator<EstadoValido, String> {

    private static final List<String> SIGLAS_ESTADOS_VALIDOS = Arrays.asList("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");

    @Override
    public void initialize(EstadoValido constraintAnnotation) {
        // Método inicializado, mas não precisamos fazer nada aqui
    }

    @Override
    public boolean isValid(String estado, ConstraintValidatorContext constraintValidatorContext) {
        return SIGLAS_ESTADOS_VALIDOS.contains(estado.toUpperCase());
    }
}