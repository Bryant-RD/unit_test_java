# 🧪 Práctica: Pruebas Unitarias con TDD y JUnit - Cálculo de Nómina Semanal

## 📋 Descripción
Este proyecto implementa un módulo de cálculo de nómina semanal para empleados utilizando Java y el framework de pruebas **JUnit 5**, aplicando la metodología de **Desarrollo Guiado por Pruebas (TDD)**. El objetivo principal fue garantizar la calidad del software desde su concepción, cumpliendo con reglas de negocio específicas para empleados de tipo **FULL_TIME** y **PART_TIME**.

---

## ✅ Requisitos del Sistema

- Java 17 o superior
- Maven (para compilar y ejecutar las pruebas)
- IDE recomendado: IntelliJ IDEA o VS Code

---

## ▶️ Instrucciones para Ejecutar las Pruebas

### 🔧 Paso 1: Clonar el repositorio
```bash
git clone <ENLACE_DEL_REPOSITORIO>
cd calculo-nomina-tdd
```

### 🧪 Paso 2: Ejecutar pruebas con Maven
```bash
mvn test
```

### 💻 Paso 3 (opcional): Ejecutar desde el IDE
1. Abre el proyecto en IntelliJ IDEA o VS Code.
2. Dirígete a `ServicioNominaTest.java`.
3. Haz clic derecho sobre la clase y selecciona **Run 'ServicioNominaTest'**.

---

## 📁 Estructura del Proyecto

```
src
├── main
│   └── java
│       └── nomina
│           ├── Empleado.java
│           ├── TipoEmpleado.java
│           └── ServicioNomina.java
└── test
    └── java
        └── nomina
            └── ServicioNominaTest.java
```

---

## ✅ Funcionalidades probadas

- ✅ Cálculo correcto del salario sin horas extra.
- ✅ Cálculo correcto del salario con horas extra (solo para FULL_TIME).
- ✅ No aplicar horas extra a empleados PART_TIME.
- ✅ Lanzar excepción para horas negativas.
- ✅ Lanzar excepción si el empleado es `null`.
- ✅ Validar que el salario no exceda el tope sin autorización.
- ✅ Aplicar bono de puntualidad por más de 38 horas trabajadas.

---

## 🧠 Cierre Reflexivo

### ¿Cómo influyó el enfoque TDD en tu proceso de desarrollo?
El enfoque TDD nos permitió estructurar el desarrollo de forma incremental, garantizando que cada parte del sistema fuera diseñada para pasar una prueba específica. Esto nos ayudó a mantener el enfoque en los requisitos del sistema desde el primer momento y a reducir retrabajos.

### ¿Qué beneficios notaste al escribir primero los tests?
Escribir primero las pruebas facilitó la identificación de errores desde el inicio. También permitió entender mejor la funcionalidad deseada antes de escribir la lógica, promoviendo un desarrollo más disciplinado y orientado a resultados.

### ¿Qué dificultades encontraste en la aplicación del enfoque?
Inicialmente fue complicado cambiar el chip hacia escribir primero los tests. Además, prever todos los escenarios posibles antes de tener el código requería más planeación y análisis. Sin embargo, con la práctica se volvió más natural.

### ¿Consideras que el código resultante es más confiable y fácil de mantener?
Totalmente. Al estar respaldado por pruebas, cualquier cambio futuro puede validarse de inmediato. Además, el diseño del código fue más modular, limpio y enfocado en cumplir con comportamientos esperados desde el inicio.

### ¿Qué aprendizajes sobre aseguramiento de la calidad puedes aplicar en tus futuros proyectos?
Aprendimos que el aseguramiento de la calidad no debe ser una etapa final, sino parte del proceso desde el inicio. La metodología TDD y las pruebas unitarias nos ayudan a construir software más robusto, mantenible y alineado con los requisitos reales.

---

## 👤 Autor

- **Nombre:** Bryant J. Reynoso
- **Carrera/Curso:** Aseguramiento de calidad de Software
- **Fecha de entrega:** 27/05/2025

---
