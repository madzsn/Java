package Matemática02;
import java.util.Scanner;

public class cilindroVolume {
    public static void main (String[] args) {

        Scanner cil = new Scanner(System.in);

        System.out.print("Digite o volume do cilíndro: ");
        float volume = cil.nextFloat();

        System.out.print("Digite a altura do cilíndro: ");
        float altura = cil.nextFloat();

        float raio = (float) Math.sqrt(volume / 3.14 * altura);
        System.out.print ("O raio vai ser: " + raio);

        
         

    }
    
}



/*785 = 3,14*r²*13
        785/3,14*13=r²
        raiz(785/3,14*13)=r*/
