import java.util.Scanner;

public class UMovieApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        boolean datosCargados = false;

        while (!salir) {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Carga de datos");
            System.out.println("2. Ejecutar consultas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:

                    break;

                case 2:
                     {
                        boolean volver = false;

                        while (!volver) {
                            System.out.println("MENÚ DE CONSULTAS");
                            System.out.println("1. Top 5 películas por idioma");
                            System.out.println("2. Top 10 películas mejor calificadas");
                            System.out.println("3. Top 5 colecciones con más ingresos");
                            System.out.println("4. Top 10 directores mejor calificados");
                            System.out.println("5. Actor más popular por mes");
                            System.out.println("6. Usuarios más activos por género");
                            System.out.println("7. Volver al menú principal");
                            System.out.print("Seleccione una opción: ");

                            int opcionConsulta = scanner.nextInt();
                            scanner.nextLine();
                            switch (opcionConsulta) {
                                case 1:
                                    System.out.println("Top 5 películas por idioma");
                                    break;

                                case 2:
                                    System.out.println(" Top 10 películas mejor calificadas");
                                    break;
                                case 3:
                                    System.out.println("Top 5 Colecciones con Más Ingresos");
                                    break;

                                case 4:
                                    System.out.println("Top 10 Directores Mejor Calificados");

                                    break;

                                case 5:
                                    System.out.println("Actor Más Popular por Mes ");
                                    break;

                                case 6:

                                    System.out.println("Top Usuarios por Género ");
                                    break;
                                case 7:
                                    volver = true;
                                    System.out.println("Volviendo al menú principal...");
                                    break;

                                default:
                                    System.out.println("Opción no válida. Intente nuevamente.");
                            }
                        }
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}