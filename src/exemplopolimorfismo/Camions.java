
package exemplopolimorfismo;


public class Camions extends Vehiculo {
private boolean remolque =false;
 
   
 

    public Camions(String matricula, String marca, int potencia,boolean remolque) {
        super(matricula, marca, potencia);
        this.remolque = remolque;
    }


    public Camions() {
        
    }

    @Override
    public float calcularPrezo() {
            float prezo;
        if(remolque==true){

      return  prezo =(super.getPotencia()*120+1000);  
        }else{
           // return remolque?super.getPotencia()*120+10000:120*super.getPotencia();
             return    prezo= super.getPotencia()+120;
        }
    }

    
    
    
    
   
 
    
}
