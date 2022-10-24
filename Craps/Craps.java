package Craps;

 
import java.util.Random;

public class Craps {
    public static void main(String []args){

        Random random = new Random();

        int dado1 = random.nextInt(6)+1;
        int dado2 = random.nextInt(6)+1;
        int soma = dado1 + dado2;
        int ponto = soma;
        boolean deusExistir =true;
        int i = 1;

        if (soma == 7 || soma == 11){
            System.out.printf("Dado1: %d  Dado2: %d\nSoma: %d\n",dado1,dado2,soma);
            System.out.print("O jogador venceu");
        }

        else if(soma == 2 || soma == 3 || soma == 12){
            System.out.printf("Dado1: %d  Dado2: %d\nSoma: %d\n",dado1,dado2,soma);
            System.out.print("Craps, o jogador perdeu");
        }

        else{
            System.out.printf("Dado1: %d  Dado2: %d\nPonto: %d\n",dado1,dado2,soma);
            System.out.println("Iniciando estágio 2");

            while(deusExistir){
                dado1 = random.nextInt(6)+1;
                dado2 = random.nextInt(6)+1;
                soma = dado1 + dado2;
                System.out.printf("\nJogada: %d\n",i);

                if(soma == ponto){
                    System.out.printf("Dado1: %d  Dado2: %d\nSoma: %d\n",dado1,dado2,soma);
                    System.out.println("O jogador ganhou :)))))");
                    deusExistir = false;
                }

                else if(soma == 7){
                    System.out.printf("Dado1: %d  Dado2: %d\nSoma: %d\n",dado1,dado2,soma);
                    System.out.println("O jogador perdeu :(((((");
                    deusExistir = false;
                }
                else{
                    System.out.printf("Dado1: %d  Dado2: %d\nSoma: %d\n",dado1,dado2,soma);
                }
                i++;
            }
        }
    }
}