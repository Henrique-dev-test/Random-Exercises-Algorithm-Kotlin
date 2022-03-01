/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salario ---------------------------------------- Percentual de Reajuste
0-400.00						15%
400.01-800.00						12%
800.01-1200.00						10%
1200.01-2000.00						7%
Acima de 2000.00					4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, que pode ser maior ou igual a zero, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.



Exemplo de Entrada -------------------------------------- Exemplo de Saída
400.00							Novo salario: 460.00
							Reajuste ganho: 60.00
							Em percentual: 15 %

800.01							Novo salario: 880.01
							Reajuste ganho: 80.00
							Em percentual: 10 %

2000.00							Novo salario: 2140.00
							Reajuste ganho: 140.00
							Em percentual: 7 %
*/

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()

    val reajuste = when(salario) {
        in 0.0..400.00 -> 15
        in 400.01..800.00 -> 12
        in 800.01..1200.00 -> 10
        in 1200.01..2000.00 -> 7
        in 2000.00..Double.MAX_VALUE -> 4
        else -> 0
    }

    //escreva o seu código nos espaços em branco

    val reajusteGanho: Double = (salario) * reajuste / 100
    val novoSalario = salario + reajusteGanho

    println("Novo salario: ${String.format("%.2f", novoSalario)}")
    println("Reajuste ganho: ${String.format("%.2f", reajusteGanho)}")
    println("Em percentual: $reajuste%")
}
