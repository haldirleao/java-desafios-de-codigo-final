/* 
Desafio
Jorginho é professor do primário de uma determinada escola.
Ele tem 100000 alunos e precisa criar um programa que verifica
quantos espaços em branco e quantas vogais existem em uma 
determinada string de entrada que os alunos entregaram na 
avaliação final. Ajude-o a realizar essa tarefa antes que o 
tempo para entrega-la no fim do semestre acabe!

Entrada
A entrada será uma frase no formato de string. 

Saída
A saída deverá retornar quantos espaços em branco e quantas 
vogais existem na determinada string, conforme exemplo abaixo:

Exemplo de saída:
Espacos em branco: 2 Vogais: 5 

 */

import java.util.Scanner;

public class ContaEspacosEVogais {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
            
            String fraseDigitada = str.toLowerCase();

            long espacosEmBranco = fraseDigitada.chars().filter(ch -> ch == ' ').count();

            long qtdeVogais = fraseDigitada.chars().filter(ch -> (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' || ch == 'u')).count();

            System.out.println("Espacos em branco: " +
                    (int) espacosEmBranco + " Vogais: " + (int) qtdeVogais);
        }
    }
}
