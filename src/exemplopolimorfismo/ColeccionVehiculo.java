
package exemplopolimorfismo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ColeccionVehiculo {
    List<Vehiculo> listaVehiculos;

    public   ColeccionVehiculo(){
     listaVehiculos = new ArrayList<>();   
    }
    
    public void engadirVehiculo(Vehiculo vehi){
        
        listaVehiculos.add(vehi);
        
    }
    public void verPrezo(){
        
        for(Vehiculo ve:listaVehiculos){
                  System.out.println("Prezo : "+ve.calcularPrezo());
        }
  
        
    }
  
    
    public void amosar(){
        
        Iterator <Vehiculo> it = listaVehiculos.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
    }
    
  

    
}
