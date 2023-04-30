
/* 
Desafio
Há um país denominado Lolipad, todos os habitantes ficam
felizes em pagar seus impostos, pois sabem que nele não
existem políticos corruptos e os recursos arrecadados
são utilizados em benefício da população, sem qualquer
desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Você terá o desafio de ler um valor com duas casas decimais,
equivalente ao salário de uma pessoa de Loli. Em seguida,
calcule e mostre o valor que esta pessoa deve pagar de 
Imposto de Renda, segundo a tabela abaixo.

Renda                           Alíquota IR
de R$ 0,00    a R$ 2000,00      Isento
de R$ 2000,01 a R$ 3000,00      8%
de R$ 3000,01 a R$ 4500,00      18%
de R$ 4500,01 a R$ ∞            28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de
8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de
R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo
fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre
R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser 
impresso com duas casas decimais.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de 
Imposto de Renda, com duas casas após o ponto. Se o valor de entrada 
for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
 */
import java.io.IOException;
import java.util.Scanner;

public class TaxaImpostoRenda {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            double renda = scan.nextDouble();
            double valorImpostoRenda = 0;

            // calculo imposto
            if (renda <= 2000.0)
                valorImpostoRenda = 0.0;

            else if (renda <= 3000.0) {
                valorImpostoRenda = (renda - 2000) * 0.08;
            }

            else if (renda <= 4500.0) {
                valorImpostoRenda = 2000 * 0.0 + 1000 * 0.08 + (renda - 3000) * .18;

            } else
                valorImpostoRenda = 2000 * 0.0 + 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28;

            // impressão
            if (valorImpostoRenda == 0.00)
                System.out.printf("Isento");
            else
                System.out.printf("R$ %.2f", valorImpostoRenda);
        }
    }

}