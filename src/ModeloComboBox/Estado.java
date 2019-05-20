
package ModeloComboBox;

public class Estado {
    
    private String nit;
    private String nombre;
    
    public Estado(String nit, String nombre) {
        setNit(nit);
        setNombre(nombre);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
        return this.nombre;
    }
            
}

