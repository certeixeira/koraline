package koraline

import dev.kord.core.entity.*

suspend fun guardarTexto(messageSplit: List<String>, messageData: Message) {
    if (messageSplit.size < 2) {
        messageData.channel.createMessage(
            "O comando deve ser enviado dessa forma: !guardar [texto]")
        return
    }

    val texto = messageSplit.subList(1, messageSplit.size).joinToString(" ")
    textos.add(texto)

    messageData.channel.createMessage("Mensagem salva!")
}