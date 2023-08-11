
package figurasgeometricas;

public abstract class FigurasPlanas {
   protected double lado;
   protected double angulo;
   protected double base;
   protected double altura;
   protected double area;
   protected double radio;
   
   public abstract double calcularAreaTriangulo(double base, double altura);
   public abstract double calcularAreaCuadrado(double lado);
   public abstract double calcularAreaRectangulo(double base, double altura);
   public abstract double calcularAreaCirculo(double radio);
   public abstract double calcularAreaoctogono(double lado);
}
