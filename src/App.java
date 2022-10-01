import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        float pi = 3.14f;
        float raio = 0.0f;
        float areaCirculo = 0.0f;

        System.out.println("Por favor digite o raio do circulo:");
        raio = console.nextFloat();

        areaCirculo = pi * (raio * raio);

        System.out.println("A área do Circulo é: " + areaCirculo);
    
    }
}
