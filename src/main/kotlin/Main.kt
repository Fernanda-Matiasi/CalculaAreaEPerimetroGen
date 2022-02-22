import kotlin.math.pow

fun main() {
    /*
    O usuário digitará sua idade e o programa
    deverá printar o ano em que ele nasceu.

    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()
    print("Você nasceu no ano de: ${2022 - idade}")

     */
/* ------------------------------------------------------------------------------------------------------- */
    /*
    Faça um programa em que o usuário digite
    o diâmetro de um círculo e calcule a área e o
    perímetro dele
    */

    print("Digite o diâmetro do circulo: ")
    val diam = readLine()!!.toDouble()
    val raio = diam / 2
    val pi = 3.14
    val area = pi * raio.pow(2)
    val peri = 2 * pi * raio

    println("Para o diâmetro com o valor $diam: ")
    println("O raio é: $raio")
    println("A área é $area")
    println("O perímetro é de $peri")

}