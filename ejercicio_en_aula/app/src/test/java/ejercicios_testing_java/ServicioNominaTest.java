package test.java.ejercicios_testing_java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.java.ejercicios_testing_java.entidades.Empleado;
import main.java.ejercicios_testing_java.entidades.TipoEmpleado;
import main.java.ejercicios_testing_java.servicios.ServicioNomina;


public class ServicioNominaTest {

    private ServicioNomina servicio;
    private Empleado empleadoFullTime;
    private Empleado empleadoPartTime;

    @BeforeEach
    public void setUp() {
        servicio = new ServicioNomina();
        empleadoFullTime = new Empleado("Ana", TipoEmpleado.FULL_TIME, 500);
        empleadoPartTime = new Empleado("Luis", TipoEmpleado.PART_TIME, 400);
    }

    // RED

    @Test
    public void testCalculoSalarioSinHorasExtra() {
        double salario = servicio.calcularSalarioSemanal(empleadoFullTime, 38);
        assertEquals(19000, salario); // 38 * 500
    }


    // Green
    @Test
public void testCalculoConHorasExtraFullTime() {
    double salario = servicio.calcularSalarioSemanal(empleadoFullTime, 45);
    // 40*500 + 5*500*1.5 = 20000 + 3750 = 23750 + bono = 24250 (pero debe ajustarse a tope)
    assertEquals(20000, salario);
}

@Test
public void testCalculoConHorasExtraPartTime() {
    double salario = servicio.calcularSalarioSemanal(empleadoPartTime, 45);
    // 45*400 = 18000
    double bono = 500;
    assertEquals(18000 + bono, salario);
}

@Test
public void testHorasNegativasLanzanExcepcion() {
    assertThrows(IllegalArgumentException.class, () -> {
        servicio.calcularSalarioSemanal(empleadoFullTime, -5);
    });
}

@Test
public void testEmpleadoNuloLanzaExcepcion() {
    assertThrows(IllegalArgumentException.class, () -> {
        servicio.calcularSalarioSemanal(null, 10);
    });
}

@Test
public void testBonoPorPuntualidad() {
    double salario = servicio.calcularSalarioSemanal(empleadoPartTime, 39);
    // 39 * 400 + bono de 500 = 15600 + 500 = 16100
    assertEquals(16100, salario);
}
}