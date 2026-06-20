# Programación Básica en Java

Aplicación de consola desarrollada en Java que reúne ejercicios introductorios de programación básica.

El proyecto integra problemas académicos de primeros semestres en un solo programa con menú principal, permitiendo practicar entrada de datos, fórmulas matemáticas, despejes, conversiones de unidades, estructuras condicionales y ciclos.

---

## Objetivo del proyecto

Desarrollar una aplicación de consola que permita resolver ejercicios básicos de programación mediante una estructura clara, ordenada y fácil de ejecutar.

El programa está diseñado para practicar:

* Lectura de datos desde consola.
* Uso de variables numéricas y de texto.
* Aplicación de fórmulas matemáticas.
* Despeje de fórmulas.
* Conversión de unidades.
* Estructuras condicionales `if-else`.
* Estructura de control `switch`.
* Ciclos `for`.
* Separación del código en métodos.

---

## Tecnologías utilizadas

* Java
* JDK
* Visual Studio Code
* Consola / Terminal

---

## Estructura del repositorio

```text
Programacion-Basica/
├── src/
│   └── ProgramacionBasica.java
├── README.md
└── LICENSE
```

---

## Archivo principal

El archivo principal del proyecto es:

```text
src/ProgramacionBasica.java
```

Este archivo contiene la aplicación completa, organizada mediante métodos para separar cada ejercicio del menú principal.

---

## Ejercicios incluidos

La aplicación contiene ocho ejercicios:

| No. | Ejercicio                                | Concepto trabajado       |
| --: | ---------------------------------------- | ------------------------ |
|   1 | Área y perímetro de triángulo rectángulo | Fórmulas directas        |
|   2 | Despeje de la fórmula `v = d / t`        | Despeje matemático       |
|   3 | Conversión metros-centímetros            | Conversión de unidades   |
|   4 | Conversión kilómetros-metros             | Conversión de unidades   |
|   5 | Selección entre opciones B o C           | Condicionales `if-else`  |
|   6 | Área o perímetro de un cuadrado          | Condicionales y fórmulas |
|   7 | Repetición de mensajes                   | Ciclos `for`             |
|   8 | Impresión de corazones                   | Ciclos `for`             |

---

## Menú principal

Al ejecutar el programa se muestra el siguiente menú:

```text
========================================
      PROGRAMACIÓN BÁSICA EN JAVA
========================================
1. Área y perímetro de triángulo rectángulo
2. Despeje de fórmula v = d / t
3. Conversión metros-centímetros
4. Conversión kilómetros-metros
5. Selección con if-else
6. Área o perímetro de un cuadrado
7. Repetición de mensajes con ciclos
8. Impresión de corazones con ciclos
0. Salir
========================================
```

El usuario selecciona una opción y el programa ejecuta el ejercicio correspondiente.

---

## Requisitos

Para ejecutar este proyecto necesitas tener instalado:

* Java JDK
* Visual Studio Code o cualquier editor compatible con Java
* Terminal o consola de comandos

Para verificar que Java está instalado:

```bash
java -version
```

Para verificar que el compilador de Java está disponible:

```bash
javac -version
```

---

## Ejecución en Visual Studio Code

Abre la carpeta del proyecto en VSCode.

Después, desde la terminal integrada, entra a la carpeta `src`:

```bash
cd src
```

Compila el archivo principal:

```bash
javac ProgramacionBasica.java
```

Ejecuta el programa:

```bash
java ProgramacionBasica
```

---

## Ejecución desde terminal

Desde la carpeta raíz del repositorio:

```bash
cd src
javac ProgramacionBasica.java
java ProgramacionBasica
```

---

## Descripción de funcionamiento

El programa inicia mostrando un menú principal.

Cada opción llama a un método diferente, lo que permite mantener el código organizado y separar la lógica de cada ejercicio.

Ejemplo de organización interna:

```text
calcularTrianguloRectangulo()
despejarFormulaVelocidad()
convertirMetrosCentimetros()
convertirKilometrosMetros()
seleccionarOpcionBasica()
calcularCuadrado()
repetirPregunta()
imprimirCorazones()
```

La aplicación valida entradas numéricas para evitar errores al ingresar datos incorrectos y regresa al menú principal después de cada ejercicio.

---

## Conceptos aplicados

### Entrada de datos

El programa utiliza lectura desde consola para recibir información ingresada por el usuario, como números, opciones de menú y letras de selección.

### Fórmulas matemáticas

Se aplican fórmulas para calcular área, perímetro, distancia, tiempo y conversiones de unidades.

### Condicionales

Se utilizan estructuras `if-else` para tomar decisiones según la opción ingresada por el usuario.

### Ciclos

Se utilizan ciclos `for` para repetir mensajes o imprimir símbolos una cantidad determinada de veces.

### Métodos

Cada ejercicio está separado en un método propio para mantener el código ordenado y legible.

---

## Ejemplo de uso

```text
Selecciona una opción: 1

Concepto trabajado: Fórmula directa
Objetivo: Calcular área y perímetro de un triángulo rectángulo.

Ingresa el cateto adyacente: 3
Ingresa el cateto opuesto: 4
Ingresa la hipotenusa: 5

Resultado
Perímetro: 12.00
Área: 6.00
```

---

## Enfoque académico

Este repositorio presenta ejercicios de programación básica reformulados como una aplicación de consola completa.

El proyecto conserva el propósito académico original y lo organiza en una estructura clara para mostrar fundamentos de Java, lógica de programación y resolución de problemas mediante código.

---

## Autora

**Sofía Pacheco**
GitHub: [SofiPv](https://github.com/SofiPv)

---

## Licencia

Este proyecto se distribuye bajo licencia MIT.
