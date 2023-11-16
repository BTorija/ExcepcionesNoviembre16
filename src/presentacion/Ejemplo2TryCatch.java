package presentacion;

import modelo.Producto;
import modelo.TipoProducto;

public class Ejemplo2TryCatch {
    public static void main(String[] args) {

        try {
            TipoProducto leche=TipoProducto.valueOf("PRODUCTO_PRIMERA_NECESIDAD");

        }catch (Exception e1){
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            System.out.println(e1.getCause());
        }finally {
            System.out.println("Entra al finally");
        }
    }
}
