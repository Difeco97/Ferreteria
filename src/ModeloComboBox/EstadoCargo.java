package ModeloComboBox;

public class EstadoCargo {
    

    private String codigo;
    private String nombre;
    
    
    public EstadoCargo(String codigo,String nombre){
        setCodigo(codigo);
        setNombre(nombre);
    }      
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
           
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String toString(){
        return this.nombre;
    }

         
}
