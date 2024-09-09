
import java.util.Scanner;

public class Pantalla_Calculadora {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------- ");
        System.out.println("                                 ");
        System.out.println("***** CALCULADORA WINSTON   *****");

        int menu_pantalla_Calculadora = 0;

        System.out.println("Ingrese el primer valor");
        int valor1 = scanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2 = scanner.nextInt();

        do {

            System.out.println("- 1. Sumar                       -");
            System.out.println("- 2. Restar                      -");
            System.out.println("- 3. Multiplicar                 -");
            System.out.println("- 4. Dividir                     -");
            System.out.println("- 5. Salir                       -");

            System.out.println("Seleccione una opcion: ");
            menu_pantalla_Calculadora = scanner.nextInt();
            scanner.nextLine();

            switch (menu_pantalla_Calculadora){

                case 1:

                    System.out.println("-------------------------------------");
                    System.out.println("ha decido sumar");
                    Calculos traerDatoSuma = new Calculos(valor1,valor2);
                    traerDatoSuma.realizarSuma();
                    System.out.println("                 ");
                    System.out.println(valor1 + " + " + valor2 + " = " + traerDatoSuma.getResultado() );
                    System.out.println("                 ");
                    System.out.println("-------------------------------------");

                    break;

                case 2:

                    System.out.println("-------------------------------------");
                    System.out.println("ha decido restar");
                    Calculos traerDatoResta = new Calculos(valor1,valor2);
                    traerDatoResta.realizarResta();
                    System.out.println("                 ");
                    System.out.println( valor1 + " - " + valor2 + " = " + traerDatoResta.getResultado() );
                    System.out.println("                 ");
                    System.out.println("-------------------------------------");

                    break;

                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("ha decido multiplicar");
                    // Coge la clase / le da un nombre al atributo traerDato / new nombre de la clase (valores 1 y 2)
                    Calculos traerDatoMultiplicacion = new Calculos(valor1,valor2);
                    traerDatoMultiplicacion.realizarMultiplicacion();
                    System.out.println("                 ");
                    System.out.println( valor1 + " * " + valor2 + " = " + traerDatoMultiplicacion.getResultado() );
                    System.out.println("                 ");
                    System.out.println("-------------------------------------");

                    break;

                case 4 :
                    System.out.println("-------------------------------------");
                    System.out.println("ha decido dividir");
                    // Coge la clase / le da un nombre al atributo traerDato / new nombre de la clase (valores 1 y 2)
                    Calculos traerDatoDivision = new Calculos(valor1,valor2);
                    traerDatoDivision.realizarDivision();
                    System.out.println("                 ");
                    System.out.println( valor1 + " / " + valor2 + " = " + traerDatoDivision.getResultado() );
                    System.out.println("                 ");
                    System.out.println("-------------------------------------");

                    break;

                case 5:
                    scanner.close();
            }

        }
        while(menu_pantalla_Calculadora !=5);
        scanner.close();
    }

}