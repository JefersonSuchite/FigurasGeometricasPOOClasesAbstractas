
package figurasgeometricas;

public class Figuras extends FigurasBolumetricas{

   @Override
    public double calcularVolumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double calcularVolumenCono(double radio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double calcularVolumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

   @Override
   public double calcularVolumenortoedro(double ancho, double altura, double longitud) {
      return longitud * ancho * altura;
   }

   @Override
   public double calcularAreaTriangulo(double base, double altura) {
      return (base*altura)/2;
   }

   @Override
   public double calcularAreaCuadrado(double lado) {
      return Math.pow(lado, 2);
   }

   @Override
   public double calcularAreaRectangulo(double base, double altura) {
      return base*altura;
   }

   @Override
   public double calcularAreaCirculo(double radio) {
      return Math.PI*(Math.pow(radio,2));
   }

   @Override
   public double calcularAreaoctogono(double lado) {
      return 2*lado*lado*(1+Math.sqrt(2));  
   }
   
}
