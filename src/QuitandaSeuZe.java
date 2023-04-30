/* 
Desafio
Seu Zé está vendendo frutas com a seguinte tabela de preços:


 	        Até 5 Kg	        Acima de 5 Kg
Morango	    R$ 2,50 por Kg	    R$ 2,20 por Kg
Maçã	    R$ 1,80 por Kg	    R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total 
da compra ultrapassar R$ 25,00, receberá ainda um desconto de
 10% sobre este total. Escreva um algoritmo para ler a 
 quantidade (em Kg) de morangos e a quantidade (em Kg) de maças
  adquiridas e escreva o valor a ser pago pelo cliente.

Entrada
Como entrada, você recebera a quantidade em kg de morangos e
 a quantidade em kg de maçãs.

Saída
Será o valor a ser pago pelo cliente, conforme a tabela de 
preços da quintanda do seu Zé.

NOTA HALDIR: Nos Exemplos as entradas são inteiros e as saídas são double.
 */

import java.util.*;

public class QuitandaSeuZe {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int kgMorangos = scan.nextInt();
            int kgMacas = scan.nextInt();
            double valorMorangos = 0d;
            double valorMacas = 0d;
            double valorTotal = 0d;

            // <= 5 kg por produto
            // > 5kg por produto
            valorMorangos = (kgMorangos <= 5) ? (kgMorangos * 2.50) : (kgMorangos * 2.20);
            valorMacas = (kgMacas <= 5) ? (kgMacas * 1.80) : (kgMacas * 1.50);
            valorTotal = valorMorangos + valorMacas;

            // desconto de 10% na compra se
            // > 8 kg de (kgMorangos + kgMacas)
            // valorTotal > 25.00
            valorTotal = (((kgMorangos + kgMacas) > 8) || valorTotal > 25.00)
                    ? valorTotal * (1 - 0.1)
                    : valorTotal;

            System.out.println(valorTotal);
        }

    }
}
