package koraline

import dev.kord.core.entity.Message

//catch name and randomly curses a name
val xingamentos = listOf(
    "é kenga",
    "é vagaba",
    "mira tortona pra esquerda",
    "é a paquita do capeta",
    "é o espantalho do fandangos",
    "tem uma cara de cu com cãimbra"
)

suspend fun pegaNome(messageSplit: List<String>, messageData: Message) {
    if (messageSplit.size < 2) {
        messageData.channel.createMessage(
            "O nome deve conter pelo menos 2 caracteres")
        return
    }
    val xinga = xingamentos.random()
    val nome = messageSplit.subList(1, messageSplit.size).joinToString(" ")
    nomes.add(nome)

    messageData.channel.createMessage("$nome $xinga")

}