package presentacion;

import modelo.Fecha;

public class ProbarFecha {
    public static void main(String[] args) {
        Fecha f1=new Fecha();
        try {
            f1.setMes(13); /*Nos detecta la propagación*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}