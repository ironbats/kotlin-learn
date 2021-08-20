import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    println("Hello World !!! Kotlin ")
    // trabalhando com loops
    loops()
}


private fun loops() {
    for (i in 5 downTo 0 step 1) {

        println()

        val titular = "Felipe Rodrigues  $i"
        var banco_selecionado = "ITAU"
        var saldo_conta: BigDecimal = BigDecimal("10000000")
        val numero_conta = 47181981

        println("Dados do banco $banco_selecionado  referente ao cliente $titular")
        print(
            "Titular: " + titular + " saldo em conta : " + BigDecimal.valueOf(saldo_conta.toDouble())
                .setScale(2, RoundingMode.HALF_EVEN) + " conta: " + numero_conta
        )

        println()


        val isOk = conditions(saldo_conta)
        println(isOk)
    }
}

fun conditions(saldo_conta: BigDecimal) {

    // opcao 1 de condicao kotlin

    if (saldo_conta != null && saldo_conta.toDouble() > 0) {
        println("Uoool voce nao esta negativo !!!")
    } else {
        println("Meu amigo economieze !!! estamos em uma pandemia ")
    }

    // opcao 2 de condicao kotlin

    when {
        saldo_conta != null && saldo_conta.toDouble() > 0 -> {
            println("Uoool voce nao esta negativo !!!")
        }
        else -> {
            println("Meu amigo economieze !!! estamos em uma pandemia ")
        }
    }
}