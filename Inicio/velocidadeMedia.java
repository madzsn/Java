package Inicio;

import java.util.Scanner;

public class velocidadeMedia {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a distância percorrida em metros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo gasto em segundos: ");
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;

        System.out.println("A velocidade média é " + velocidadeMedia + " m/s.");

    }
    
}
