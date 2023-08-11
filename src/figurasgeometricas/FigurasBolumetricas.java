
package figurasgeometricas;

public abstract class FigurasBolumetricas extends FigurasPlanas{
   protected double volumen;
   protected double diametro;
   protected double longitud;
   
   public abstract double calcularVolumenEsfera(double radio);
   public abstract double calcularVolumenCilindro(double radio, double altura);
   public abstract double calcularVolumenCono(double radio, double altura);
   public abstract double calcularVolumenCubo(double lado);
   public abstract double calcularVolumenortoedro(double ancho, double altura, double longitud);
   
}
