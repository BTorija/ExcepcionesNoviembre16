package presentacion;

public class Main {
    public static void main(String[] args) {
        int[] enteros = new int[5];
        try {
            enteros[6] = 6;
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Entra al catch IndexOutOfBound");
        }
        catch (Exception e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            System.out.println(e1.getCause());
        }
        //Error tipico en los bucles de recorrer Array
        /*
        for (int i=0; i<enteros.length; i++){
            enteros[i]=i*5;
        }*/

    }
}