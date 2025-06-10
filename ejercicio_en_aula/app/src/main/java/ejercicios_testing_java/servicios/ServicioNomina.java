package main.java.ejercicios_testing_java.servicios;

import main.java.ejercicios_testing_java.entidades.Empleado;
import main.java.ejercicios_testing_java.entidades.TipoEmpleado;


public class ServicioNomina {

    private static final double TOPE_SALARIAL = 20000;
    private static final double MULTIPLICADOR_EXTRA = 1.5;
    private static final double BONO_PUNTUALIDAD = 500;

    public double calcularSalarioSemanal(Empleado empleado, int horasTrabajadas) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }

        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas no pueden ser negativas");
        }

        double salario = 0;
        double tarifa = empleado.getTarifaPorHora();

        if (empleado.getTipo() == TipoEmpleado.FULL_TIME) {
            int horasNormales = Math.min(40, horasTrabajadas);
            int horasExtra = Math.max(0, horasTrabajadas - 40);
            salario = horasNormales * tarifa + horasExtra * tarifa * MULTIPLICADOR_EXTRA;
        } else {
            salario = horasTrabajadas * tarifa;
        }

        if (horasTrabajadas > 38) {
            salario += BONO_PUNTUALIDAD;
        }

        // Aplicar tope salarial sin autorización
        return Math.min(salario, TOPE_SALARIAL);
    }
}