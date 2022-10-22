import java.util.*;
public class Cod1002 {    
/* Fórmula para calcular a área de uma circunferência: raio = π.(raio.raio)
Considerar π = 3.14159:

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.*/
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

        double raio, area;
    
            raio = input.nextDouble();
            area = 3.14159 * Math.pow(raio,2);

        System.out.printf("Area = "+"%.4f",area);

    }
}
