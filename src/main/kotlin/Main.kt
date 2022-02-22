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
    val diam = readLine()!!.toFloat()
    println("A área deste circulo é de: ${3.14 *(diam * diam)}")
    print("O perímetro deste circulo é de: ${2 * 3.14 * diam}")
    
}