package modelos;


public class Empresa extends Empleado{

     int nit;
    String nombre; 
    String direccion;
    String ciudad;

    public Empresa(String nombre, int nit, String direccion, String ciudad) {
        
    }

    public Empresa() {
    }
    
    
    public int getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
