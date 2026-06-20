import java.util.Scanner;

public class ProgramacionBasica {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ejecutarMenu();
        scanner.close();
    }

    private static void ejecutarMenu() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Selecciona una opción: ", 0, 8);
            System.out.println();

            switch (opcion) {
                case 1:
                    calcularTrianguloRectangulo();
                    break;
                case 2:
                    despejarFormulaVelocidad();
                    break;
                case 3:
                    convertirMetrosCentimetros();
                    break;
                case 4:
                    convertirKilometrosMetros();
                    break;
                case 5:
                    seleccionarOpcionBasica();
                    break;
                case 6:
                    calcularCuadrado();
                    break;
                case 7:
                    repetirPregunta();
                    break;
                case 8:
                    imprimirCorazones();
                    break;
                case 0:
                    System.out.println("Programa finalizado. Gracias por practicar programación básica en Java.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (opcion != 0) {
                pausar();
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        limpiarPantallaVisual();
        System.out.println("========================================");
        System.out.println("      PROGRAMACIÓN BÁSICA EN JAVA       ");
        System.out.println("========================================");
        System.out.println("1. Área y perímetro de triángulo rectángulo");
        System.out.println("2. Despeje de fórmula v = d / t");
        System.out.println("3. Conversión metros-centímetros");
        System.out.println("4. Conversión kilómetros-metros");
        System.out.println("5. Selección con if-else");
        System.out.println("6. Área o perímetro de un cuadrado");
        System.out.println("7. Repetición de mensajes con ciclos");
        System.out.println("8. Impresión de corazones con ciclos");
        System.out.println("0. Salir");
        System.out.println("========================================");
    }

    private static void calcularTrianguloRectangulo() {
        mostrarTema("Fórmula directa", "Calcular área y perímetro de un triángulo rectángulo.");

        double catetoAdyacente = leerDoublePositivo("Ingresa el cateto adyacente: ");
        double catetoOpuesto = leerDoublePositivo("Ingresa el cateto opuesto: ");
        double hipotenusa = leerDoublePositivo("Ingresa la hipotenusa: ");

        double perimetro = catetoAdyacente + catetoOpuesto + hipotenusa;
        double area = (catetoAdyacente * catetoOpuesto) / 2;

        System.out.println("\nResultado");
        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Área: %.2f%n", area);
    }

    private static void despejarFormulaVelocidad() {
        mostrarTema("Despeje de fórmula", "Trabajar con la fórmula v = d / t.");

        System.out.println("¿Qué variable deseas calcular?");
        System.out.println("D. Distancia");
        System.out.println("T. Tiempo");

        String opcion = leerTexto("Selecciona D o T: ").toUpperCase();

        if (opcion.equals("D")) {
            double velocidad = leerDoublePositivo("Ingresa la velocidad: ");
            double tiempo = leerDoublePositivo("Ingresa el tiempo: ");
            double distancia = velocidad * tiempo;

            System.out.printf("\nDistancia calculada: %.2f%n", distancia);
        } else if (opcion.equals("T")) {
            double distancia = leerDoublePositivo("Ingresa la distancia: ");
            double velocidad = leerDoublePositivo("Ingresa la velocidad: ");
            double tiempo = distancia / velocidad;

            System.out.printf("\nTiempo calculado: %.2f%n", tiempo);
        } else {
            System.out.println("Opción no válida. Debes escribir D o T.");
        }
    }

    private static void convertirMetrosCentimetros() {
        mostrarTema("Conversión de unidades", "Convertir entre metros y centímetros.");

        System.out.println("1. Metros a centímetros");
        System.out.println("2. Centímetros a metros");

        int opcion = leerEntero("Selecciona una opción: ", 1, 2);

        if (opcion == 1) {
            double metros = leerDoublePositivo("Ingresa los metros: ");
            double centimetros = metros * 100;
            System.out.printf("\n%.2f metros equivalen a %.2f centímetros.%n", metros, centimetros);
        } else {
            double centimetros = leerDoublePositivo("Ingresa los centímetros: ");
            double metros = centimetros / 100;
            System.out.printf("\n%.2f centímetros equivalen a %.2f metros.%n", centimetros, metros);
        }
    }

    private static void convertirKilometrosMetros() {
        mostrarTema("Conversión de unidades", "Convertir entre kilómetros y metros.");

        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a kilómetros");

        int opcion = leerEntero("Selecciona una opción: ", 1, 2);

        if (opcion == 1) {
            double kilometros = leerDoublePositivo("Ingresa los kilómetros: ");
            double metros = kilometros * 1000;
            System.out.printf("\n%.2f kilómetros equivalen a %.2f metros.%n", kilometros, metros);
        } else {
            double metros = leerDoublePositivo("Ingresa los metros: ");
            double kilometros = metros / 1000;
            System.out.printf("\n%.2f metros equivalen a %.2f kilómetros.%n", metros, kilometros);
        }
    }

    private static void seleccionarOpcionBasica() {
        mostrarTema("Estructura if-else", "Tomar una decisión según la opción ingresada.");

        String opcion = leerTexto("Escribe B o C: ").toUpperCase();

        if (opcion.equals("B")) {
            System.out.println("Escogiste la opción B.");
        } else if (opcion.equals("C")) {
            System.out.println("Escogiste la opción C.");
        } else {
            System.out.println("Opción no válida. Debes escribir B o C.");
        }
    }

    private static void calcularCuadrado() {
        mostrarTema("Estructura if-else", "Calcular área o perímetro de un cuadrado.");

        System.out.println("A. Área");
        System.out.println("P. Perímetro");

        String opcion = leerTexto("Selecciona A o P: ").toUpperCase();
        double lado = leerDoublePositivo("Ingresa el valor del lado: ");

        if (opcion.equals("A")) {
            double area = lado * lado;
            System.out.printf("\nÁrea del cuadrado: %.2f%n", area);
        } else if (opcion.equals("P")) {
            double perimetro = lado * 4;
            System.out.printf("\nPerímetro del cuadrado: %.2f%n", perimetro);
        } else {
            System.out.println("Opción no válida. Debes escribir A o P.");
        }
    }

    private static void repetirPregunta() {
        mostrarTema("Ciclos for", "Repetir mensajes una cantidad determinada de veces.");

        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ". Estas son cuatro oraciones consecutivas.");
        }

        int repeticiones = leerEntero("\n¿Cuántas veces deseas repetir la pregunta? ", 1, 100);

        for (int i = 1; i <= repeticiones; i++) {
            System.out.println(i + ". ¿Las contaste?");
        }
    }

    private static void imprimirCorazones() {
        mostrarTema("Ciclos for", "Imprimir un símbolo según la cantidad indicada por el usuario.");

        int cantidad = leerEntero("¿Cuántos corazones deseas imprimir? ", 1, 100);

        for (int i = 1; i <= cantidad; i++) {
            System.out.println(i + ". ♥");
        }
    }

    private static void mostrarTema(String concepto, String objetivo) {
        System.out.println("----------------------------------------");
        System.out.println("Concepto trabajado: " + concepto);
        System.out.println("Objetivo: " + objetivo);
        System.out.println("----------------------------------------");
    }

    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    private static double leerDoublePositivo(String mensaje) {
        double numero;

        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();

            try {
                numero = Double.parseDouble(entrada);

                if (numero > 0) {
                    return numero;
                }

                System.out.println("El valor debe ser mayor que cero.");
            } catch (NumberFormatException error) {
                System.out.println("Entrada no válida. Ingresa un número.");
            }
        }
    }

    private static int leerEntero(String mensaje, int minimo, int maximo) {
        int numero;

        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();

            try {
                numero = Integer.parseInt(entrada);

                if (numero >= minimo && numero <= maximo) {
                    return numero;
                }

                System.out.printf("Ingresa un número entre %d y %d.%n", minimo, maximo);
            } catch (NumberFormatException error) {
                System.out.println("Entrada no válida. Ingresa un número entero.");
            }
        }
    }

    private static void pausar() {
        System.out.println("\nPresiona Enter para volver al menú principal...");
        scanner.nextLine();
    }

    private static void limpiarPantallaVisual() {
        System.out.println("\n\n");
    }
}
