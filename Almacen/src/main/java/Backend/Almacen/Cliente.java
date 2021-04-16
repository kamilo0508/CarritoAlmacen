package Backend.Almacen;

public class Cliente {

	private String Nombre;
	private String Direccion;
    private int Cedula;
   

    public Cliente(){}
  
    
    public Cliente(String Nombre, String Direccion, int Cedula){
    	
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
    }

    
    public String getNombre(){
        return this.Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getDireccion(){
        return this.Direccion;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
  
    public void setCedula(int Cedula){
        this.Cedula = Cedula;
    }
    
    public int getCedula(){
        return this.Cedula;
    }
 
}
