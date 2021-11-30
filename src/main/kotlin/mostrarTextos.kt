package koraline

import dev.kord.core.entity.*

suspend fun mostrarTextos(messageData: Message) {
    val textosString = textos.joinToString(", ")
    messageData.channel.createMessage(
        "As mensagens guardadas são: $textosString")
}