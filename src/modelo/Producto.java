package modelo;

public class Producto {
    private int id;
    public void comprobar() throws Exception {
        if (id == 0) {
            throw new Exception("El id debe de ser mayor a 0");

        }
    }
    //Hacer un método comprobarID: si el id es igual a 0 se lanza una excepción
    //y una clase para probar el producto


    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                '}';
    }

    public Producto() {
    }

    public Producto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId (int id){
            this.id = id;
        }
    }


