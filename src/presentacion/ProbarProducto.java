package presentacion;

import modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p1=new Producto(0);
        System.out.println(p1.toString());
        try {
            p1.comprobar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
