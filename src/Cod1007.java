import java.util.*;
public class Cod1007 {
/* 
 * Leia quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D. 
 * fórmula: DIFERENCA = (A * B - C * D).
*/
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in); 

        int A, B, C, D;
            
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

            int diferenca = ((A * B) - (C * D));

        System.out.println("DIFERENCA = "+diferenca);
    }
}
