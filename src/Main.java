public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.addPuerta();
        System.out.println(miCoche.getPuertas());
        int resultado = suma(1, 2, 5);
        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

