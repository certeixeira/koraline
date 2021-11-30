package koraline

import dev.kord.core.entity.*

suspend fun mostrarTextos(mensagemDados: Message) {
    val textosString = textos.joinToString(", ")
    mensagemDados.channel.createMessage(
        "As mensagens guardadas são: $textosString")
}