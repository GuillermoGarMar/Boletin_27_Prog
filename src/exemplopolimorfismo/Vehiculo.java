
package exemplopolimorfismo;


public abstract class Vehiculo {
 private String matricula,marca;
 private int potencia;

    public Vehiculo(String matricula, String marca, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.potencia = potencia;
       
    }

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", potencia=" + potencia + '}';
    }

 

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

 
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
 
 
 
 public abstract float calcularPrezo();

}
