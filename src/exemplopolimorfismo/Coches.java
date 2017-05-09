
package exemplopolimorfismo;


public class Coches extends Vehiculo {
    
   int numportas;
 

    public Coches(int numportas, String matricula, String marca, int potencia) {
        super(matricula, marca, potencia);
        this.numportas = numportas;
    }

    

 

    public Coches() {
    }

  
    @Override
    public float calcularPrezo() {
        float prezo;
        return  prezo = (95*super.getPotencia());
    }

   
   
}
