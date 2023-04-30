/* 
Desafio
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados)
e apresente a mensagem:
    Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C
como altura, mostrando a mensagem:
    Area = XX.X

Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com **uma casa decimal**.

NOTA haldir: Nos exemplos, as entradas e saídas são double

Condição de existência do triângulo, dados três segmentos de reta:
https://brasilescola.uol.com.br/o-que-e/matematica/o-que-e-a-condicao-existencia-um-triangulo.htm
 */

import java.io.IOException;
import java.util.Scanner;

public class PerimetroTrianguloOuAreaTrapezio {

    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            double segmentoRetaA = scan.nextDouble();
            double segmentoRetaB = scan.nextDouble();
            double segmentoRetaC = scan.nextDouble();
            double perimetroTriangulo;
            double areaTrapezio;
            /*
             * "Dados três segmentos de reta distintos, se a soma das medidas
             * de dois deles é sempre maior que a medida do terceiro, então,
             * eles podem formar um triângulo.
             * https://brasilescola.uol.com.br/o-que-e/matematica/o-que-e-a-condicao-
             * existencia-um-triangulo.htm
             */
            // Testes - condições de existência triângulos
            boolean condExistencia1 = (segmentoRetaA + segmentoRetaB > segmentoRetaC);
            boolean condExistencia2 = (segmentoRetaA + segmentoRetaC > segmentoRetaB);
            boolean condExistencia3 = (segmentoRetaB + segmentoRetaC > segmentoRetaA);

            if (condExistencia1 && condExistencia2 && condExistencia3) {
                perimetroTriangulo = (segmentoRetaA + segmentoRetaB + segmentoRetaC);
                System.out.printf("Perimetro = %.1f", perimetroTriangulo);
            } else {
                // AREA = ((A + B) x C) / 2
                areaTrapezio = (((segmentoRetaA + segmentoRetaB) * segmentoRetaC) / 2.0);
                System.out.printf("Area = %.1f", areaTrapezio);
            }
        }
    }

}
