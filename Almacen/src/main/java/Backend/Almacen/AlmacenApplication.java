package Backend.Almacen;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AlmacenApplication {

	public static void main(String[] args) {
		
		int Cont = 0;
		
		Cliente C = new Cliente();
	
		 
		 C.setNombre("Frank");
		 C.setDireccion("carrera 11# 14-08");
		 C.setCedula(12345);
		
        Scanner entrada = new Scanner(System.in);
        

        ArrayList<Productos> ListaProductos = new ArrayList<>();
        
     
        boolean salir = false;
        while (!salir) {   
          
            System.out.println(" INGRESE LA OPCION ");
            System.out.println(" 1 - Agregar al carrito");
            System.out.println(" 2 - Carrito de compras");
            System.out.println(" 3 - Eliminar Productos del carrito");
            System.out.println(" 4 - Modificar Productos del carrito");
            System.out.println(" 0 - Salir ");
            
         
            int opcion = Integer.parseInt(entrada.nextLine());
           
           
            switch(opcion) {
            
                case 1: 
                	
	                double Iva;
	                double Total;
                	
                	Productos P = new Productos();
                	
                	System.out.println("Nombre de usuario: " + C.getNombre());
                	System.out.println("Numero de cedula: " + C.getCedula());
                	System.out.println("Direccion: " + C.getDireccion());
                	System.out.println("______________________________");
                    System.out.println("Ingrese nombre del producto:");
                    P.setNombreProducto(entrada.nextLine());
                    
                    System.out.println("Ingrese descripcion del producto: ");
                    P.setDescripcion(entrada.nextLine());
                    
                    System.out.println("Ingrese el precio del producto");
                    P.setPrecio(Integer.parseInt(entrada.nextLine()));

                    
                    if(P.getPrecio() <= 70000) {
                    
                    	
	                    
	                     int envio = 8000;
	                    	
	                     Iva = P.getPrecio() * 0.19; 
	                     Total = P.getPrecio() + Iva;
	                     
	                     P.setPrecio(Total);
	                     P.setPrecioEnvio(envio);
                     
                    }else if(P.getPrecio() <= 100000){
                    	
                    
                        int envio = 0;
                         	
                        Iva = P.getPrecio() * 0.19; 
                        Total = P.getPrecio() + Iva;
                          
                        P.setPrecio(Total);
                        P.setPrecioEnvio(envio);
                    }
                    
                    ListaProductos.add(P);
                    
           
                    
                    System.out.println("Producto Creado");
                    System.out.println("Nombre: " + P.getNombreProducto());
                    System.out.println("Descripcion: " + P.getDescripcion());
                    System.out.println("Precio: " + P.getPrecio());
                    System.out.println("Costo de envió: " + P.getPrecioEnvio());
                    
                    Cont ++;

                    break;
                 
                case 2: 
                		
                
                	System.out.println("Nombre de usuario: " + C.getNombre());
                	System.out.println("Numero de cedula: " + C.getCedula());
                	System.out.println("Direccion: " + C.getDireccion());
             	   	System.out.println("______________________________");
                	   
             	  
                		
             	   	  for(int i = 0; i < ListaProductos.size(); i++){
             	   		  
             	   	  
                       System.out.println("Opción: " + (i + 1));
                    
                       Productos listProductos =  ListaProductos.get(i); 
                       
                       System.out.println("Nombre Producto: " + listProductos.getNombreProducto());
                       System.out.println("Descripción Producto: " + listProductos.getDescripcion());
                       System.out.println("Precio: " + listProductos.getPrecio());
                       System.out.println("Costo de envio: " + listProductos.getPrecioEnvio());
                       
             	   	  	}
             	   	  Cont ++;
             	   	  
                    break;
                    
                case 3: 
                	
                	System.out.println("Nombre de usuario: " + C.getNombre());
             	   	System.out.println("Numero de cedula: " + C.getCedula());
             	   	System.out.println("Direccion: " + C.getDireccion());
             	   	System.out.println("______________________________");
             	    System.out.println("Ingreser el nombre del producto a eliminar: ");
                    String producto = entrada.nextLine();
             	   
                   if(Cont < 12) {
             	   	  
                      
                      for (int i = 0; i < ListaProductos.size(); i++) {
                      	
                          Productos Producto = ListaProductos.get(i);
                     
                          if (producto.equals(Producto.getNombreProducto())) {
                       
                          	ListaProductos.remove(i);
                              System.out.println("Producto eliminado");
                          }
                      }
                      
                     
                      
                   }else {
             	   		
             	   		System.out.print("Ya pasaron 12 horas, no es posible eliminar el producto");
             	   	}
                  
                   	Cont ++;
                   	
                    break;
                   
               
                case 4:
               	 	
        
                	
                    System.out.println(" Ingrese el nombre del producto a modificar");    
                    producto = entrada.nextLine();
                    
                	if(Cont < 5) {
                		
                    	 for (int i = 0; i < ListaProductos.size(); i++) {
                    		 
                             Productos ListaProducto = ListaProductos.get(i);
                             if (producto.equals(ListaProducto.getNombreProducto())) {
                            	 System.out.println("Nombre Producto: " + ListaProducto.getNombreProducto());
                                 System.out.println("Descripcion: " + ListaProducto.getDescripcion());
                                 System.out.println("Precio: " + ListaProducto.getPrecio());
                                 System.out.println("Ingrese nombre del producto: ");
                                 String nombreproducto = entrada.nextLine();
                                 System.out.println("Ingrese descripcion: ");
                                 String descripcion = entrada.nextLine();;
                                 System.out.println("Ingrese el precio del producto");
                                 int precio = Integer.parseInt(entrada.nextLine());
                                 
                                 ListaProducto.setNombreProducto(nombreproducto);
                                 ListaProducto.setDescripcion(descripcion);
                                 ListaProducto.setPrecio(precio);
                                
                                 System.out.print("Producto Modificado");
                             }
                            
                         }
                    	 
                    }else {
                    	
                      System.out.print("Ya pasaron 5 horas, no es posible modificar la información");
                      
                    }
                   
                    
                   
             	    Cont ++;
                    
             	    break;
                 
                case 0:
                	
                    salir = true;
             
                    break;
                    
                default: 
                	
                    System.out.println("Opcion invalida");
                
            }
        }
        
	}

}

