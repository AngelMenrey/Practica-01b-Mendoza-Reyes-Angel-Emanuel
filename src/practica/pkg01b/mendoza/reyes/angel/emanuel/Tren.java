package practica.pkg01b.mendoza.reyes.angel.emanuel;

public class Tren extends Transporte {
    //atributos
    private int Registro, NumAsiento;
    private String Nombre;

    public Tren(String color, int PrecioBoleto, int NumPasajeros) {
        super(color, PrecioBoleto, NumPasajeros);
    }
    
    public Tren(int Registro, int NumAsientos, String Nombre, String color, int PrecioBoleto, int NumPasajeros) {
        super(color, PrecioBoleto, NumPasajeros);
        this.Nombre = Nombre;
        this.Registro = Registro;
        this.NumAsiento = NumAsiento;
    }
    
    public Tren(){
        super();
        this.Registro=22110083;
        this.NumAsiento=12;
        this.Nombre="Angel";
    }
    //Setters
    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public void setNumAsiento(int NumAsiento) {
        this.NumAsiento = NumAsiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    //Getters

    public int getRegistro() {
        return Registro;
    }

    public int getNumAsiento() {
        return NumAsiento;
    }

    public String getNombre() {
        return Nombre;
    }
}
