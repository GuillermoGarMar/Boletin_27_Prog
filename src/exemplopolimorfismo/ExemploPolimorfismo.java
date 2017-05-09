
package exemplopolimorfismo;

import javax.swing.JOptionPane;
import milibreria.Milibreria;
public class ExemploPolimorfismo {

   
    public static void main(String[] args) {
       ColeccionVehiculo cole = new ColeccionVehiculo();
    Vehiculo coche = new Coches();
     
    int select;
    
    
    
    
    
    
    
    do{
        
    select = Integer.parseInt(JOptionPane.showInputDialog("elija la opción \n 1.Camión \n 2.Coche \n 3. ver Prezo \n 4.Mostrar"));
    switch(select){
    
          
            case 1:cole.engadirVehiculo(coche);
            break;
            case 2:cole.engadirVehiculo(ExemploPolimorfismo.datosCoche());
            break;
            case 3:cole.verPrezo();
            break;
            case 4:cole.amosar();
            break;
           
            
    }      
    }while(select!=0);
    
    } 
    
    public static Vehiculo datosCamion(){
        Vehiculo cam = new  Camions(Milibreria.pedirString(),Milibreria.pedirString(),Milibreria.pedirUnidades(),Milibreria.pedirBoleano());
        return cam;
    }
    public static Vehiculo datosCoche(){
        
      Vehiculo coch = new Coches(Milibreria.pedirUnidades(),Milibreria.pedirString(),Milibreria.pedirString(),Milibreria.pedirUnidades()); 
      return coch;
    }
   
}
