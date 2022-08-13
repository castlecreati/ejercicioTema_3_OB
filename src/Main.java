public class Main {
    public static void main(String[] args) {
        int resultado = suma(1,5,7);
        System.out.println("Sumamos 1, 5 y 7");
        System.out.println(resultado);

        Coche miCoche = new Coche();
        Coche.incrementarPuertas();
        System.out.println("Incrementamos una puerta a un coche con cero puertas y ahora tiene ...");
        System.out.println(Coche.nPuertas);
    }
    public static int  suma (int a, int b, int c){
        return a+b+c;
    }
}

