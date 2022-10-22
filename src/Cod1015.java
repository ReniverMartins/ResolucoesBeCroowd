import java.util.*;
public class Cod1015 {
/*
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano: 
 * p1(x1,y1) e p2(x2,y2)
 * 
 * calcule a distância entre eles, mostrando 4 casas decimais após a vírgula
 */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 

        float x1,x2, y1, y2; 

            x1 = input.nextFloat();
            y1 = input.nextFloat();
            x2 = input.nextFloat();        
            y2 = input.nextFloat();

        //Formula abaixo funciona, mas preferi separar em steps para facilitar o entendimento.
        //float distancia2 = (float) Math.sqrt(((Math.pow(2,(x2-x1))) + (Math.pow(2,(y2-y1)))));

        float stepX = (float) Math.pow(2, (x2 - x1));
        float stepY = (float) Math.pow(2, (y2 - y1));
            
            float distancia = (float) Math.sqrt(stepX+stepY); 

        System.out.printf("%.4f",distancia);
    }
}
