//Jeferson Alexis Suchite Chavez 0909-22-12781

package figurasgeometricas;

import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figuras figura = new Figuras();
        
        int opcion;
        do {
           System.out.println("");
           System.out.println("Menu:");
           System.out.println("1. Calcular area de un triangulo");
           System.out.println("2. Calcular area de un cuadrado");
            System.out.println("3. Calcular area de un rectangulo");
           System.out.println("4. Calcular area de un circulo");
           System.out.println("5. Calcular area de un octogono");
           System.out.println("6. Calcular volumen de una esfera");
           System.out.println("7. Calcular volumen de un cilindro");
           System.out.println("8. Calcular volumen de un cono");
           System.out.println("9. Calcular volumen de un cubo");
           System.out.println("10. Calcular volumen de un ortoedro");
           System.out.println("0. Salir");
           System.out.print("Ingrese una opcion: ");
           opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base del triangulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("Area del triangulo: " + figura.calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    System.out.println("Area del cuadrado: " + figura.calcularAreaCuadrado(ladoCuadrado));
                    break;
                case 3:
                    System.out.print("Ingrese la base del rectangulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    System.out.println("Area del rectangulo: " + figura.calcularAreaRectangulo(baseRectangulo, alturaRectangulo));
                    break;
                case 4:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radioCirculo = scanner.nextDouble();
                    System.out.println("Area del circulo: " + figura.calcularAreaCirculo(radioCirculo));
                    break;
                case 5:
                    System.out.print("Ingrese el lado del octogono: ");
                    double ladoOctogono = scanner.nextDouble();
                    System.out.println("Area del octogono: " + figura.calcularAreaoctogono(ladoOctogono));
                    break;
                case 6:
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    System.out.println("Volumen de la esfera: " + figura.calcularVolumenEsfera(radioEsfera));
                    break;
                case 7:
                    System.out.print("Ingrese el radio del cilindro: ");
                    double radioCilindro = scanner.nextDouble();
                    System.out.print("Ingrese la altura del cilindro: ");
                    double alturaCilindro = scanner.nextDouble();
                    System.out.println("Volumen del cilindro: " + figura.calcularVolumenCilindro(radioCilindro, alturaCilindro));
                    break;
                case 8:
                    System.out.print("Ingrese el radio del cono: ");
                    double radioCono = scanner.nextDouble();
                    System.out.print("Ingrese la altura del cono: ");
                    double alturaCono = scanner.nextDouble();
                    System.out.println("Volumen del cono: " + figura.calcularVolumenCono(radioCono, alturaCono));
                    break;
                case 9:
                    System.out.print("Ingrese el lado del cubo: ");
                    double ladoCubo = scanner.nextDouble();
                    System.out.println("Volumen del cubo: " + figura.calcularVolumenCubo(ladoCubo));
                    break;
                case 10:
                    System.out.print("Ingrese el ancho del ortoedro: ");
                    double anchoOrtoedro = scanner.nextDouble();
                    System.out.print("Ingrese la altura del ortoedro: ");
                    double alturaOrtoedro = scanner.nextDouble();
                    System.out.print("Ingrese la longitud del ortoedro: ");
                    double longitudOrtoedro = scanner.nextDouble();
                    System.out.println("Volumen del ortoedro: " + figura.calcularVolumenortoedro(anchoOrtoedro, alturaOrtoedro, longitudOrtoedro));
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
}
