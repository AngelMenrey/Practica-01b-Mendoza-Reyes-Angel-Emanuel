package practica.pkg01b.mendoza.reyes.angel.emanuel;

public class Transporte {
    //atributos
    protected String color;
    protected int PrecioBoleto, NumPasajeros;
    
    //constructor
    public Transporte(String color, int PrecioBoleto, int NumPasajeros) {
        this.color = color;
        this.PrecioBoleto = PrecioBoleto;
        this.NumPasajeros = NumPasajeros;
    }
    
    
    public Transporte(){
        this.color="Rojo";
        this.PrecioBoleto= 100;
        this.NumPasajeros = 65;   
    }
    
    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecioBoleto(int PrecioBoleto) {
        this.PrecioBoleto = PrecioBoleto;
    }

    public void setNumPasajeros(int NumPasajeros) {
        this.NumPasajeros = NumPasajeros;
    }
    
    //Getters
    public String getColor() {
        return color;
    }

    public int getPrecioBoleto() {
        return PrecioBoleto;
    }

    public int getNumPasajeros() {
        return NumPasajeros;
    }
    
}
