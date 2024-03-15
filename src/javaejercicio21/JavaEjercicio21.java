/*
 * Dados los tres lados de un triángulo, haga un algoritmo que encuentre: 
   perímetro, semiperímetro y el área del triángulo
 */
package javaejercicio21;

import java.util.Scanner;

public class JavaEjercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese la longitud del triángulo del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del triángulo del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del triángulo del tercer lado: ");
        double lado3 = scanner.nextDouble();

        // Cálculo del perímetro
        double perimetro = lado1 + lado2 + lado3;

        // Cálculo del semiperímetro
        double semiperimetro = perimetro / 2;

        // Cálculo del área usando la fórmula de Herón(A=  ala raiz cuadrada de=s×(s−a)×(s−b)×(s−c)
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        // Mostrar resultados
        System.out.println("\nEl resultados para el triángulo es: ");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Semiperímetro: " + semiperimetro);
        System.out.println("Área: " + area);

    }
    
}
