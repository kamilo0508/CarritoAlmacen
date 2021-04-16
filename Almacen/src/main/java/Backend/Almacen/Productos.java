package Backend.Almacen;

public class Productos {
	private String NombreProducto;
    private String Descripcion;
    private double Precio;
    private int PrecioEnvio;
  
    
   
    public Productos(){}
  
    
    public Productos(String NombreProducto, String Descripcion, double Precio, int PrecioEnvio){
    	
        this.NombreProducto = NombreProducto;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.PrecioEnvio = PrecioEnvio;
        
    }

    
    public String getNombreProducto(){
        return this.NombreProducto;
    }
    
    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }
    
    public String getDescripcion(){
        return this.Descripcion;
    }
     
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
  
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }
    
    public double getPrecio(){
        return this.Precio;
    }
    
    public void setPrecioEnvio(int PrecioEnvio){
        this.PrecioEnvio = PrecioEnvio;
    }
    
    public double getPrecioEnvio(){
        return this.PrecioEnvio;
    }
}
   
