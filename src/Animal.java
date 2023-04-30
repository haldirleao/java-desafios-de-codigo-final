/* 
DESAFIO
Neste problema, você deverá ler 3 palavras que definem o tipo 
de animal possível segundo o esquema abaixo, da esquerda para a direita.  
Em seguida conclua qual dos animais seguintes foi escolhido, através
das três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para
identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

Exemplos de entrada.
NOTA haldir: todas sem acentos!
vertebrado - mamifero - onivoro
-
vertebrado - ave - carnivoro
-
invertebrado - anelideo - onivoro
 */

import java.io.IOException;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            String AN1, AN2, AN3;

            // entrada das características do animal
            AN1 = sc.nextLine();
            AN2 = sc.nextLine();
            AN3 = sc.nextLine();

            // concatena as características
            String caracteristicasDadas = (AN1 + AN2 + AN3);

            // Criar as Strings concatenadas que representam o conjunto de caracteristicas:
            // https://drive.google.com/file/d/1TkBTxiIRiSjzxEUwND4bR0V61l71owYe/view?usp=share_link
            // SEM ACENTOS
            String aguia = ("vertebrado" + "ave" + "carnivoro");
            String pomba = ("vertebrado" + "ave" + "onivoro");
            String homem = ("vertebrado" + "mamifero" + "onivoro");
            String vaca = ("vertebrado" + "mamifero" + "herbivoro");
            String pulga = ("invertebrado" + "inseto" + "hematofago");
            String lagarta = ("invertebrado" + "inseto" + "herbivoro");
            String sanguessuga = ("invertebrado" + "anelideo" + "hematofago");
            String minhoca = ("invertebrado" + "anelideo" + "onivoro");

            // condições para testar qual é o animal e imprimir seu nome.
            if (caracteristicasDadas.equals(aguia))
                System.out.println("aguia");
            else if (caracteristicasDadas.equals(pomba))
                System.out.println("pomba");
            else if (caracteristicasDadas.equals(homem))
                System.out.println("homem");
            else if (caracteristicasDadas.equals(vaca))
                System.out.println("vaca");
            else if (caracteristicasDadas.equals(pulga))
                System.out.println("pulga");
            else if (caracteristicasDadas.equals(lagarta))
                System.out.println("lagarta");
            else if (caracteristicasDadas.equals(sanguessuga))
                System.out.println("sanguessuga");
            else if (caracteristicasDadas.equals(minhoca))
                System.out.println("minhoca");
        }
    }
}
