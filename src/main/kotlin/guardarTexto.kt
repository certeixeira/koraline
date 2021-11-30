package koraline

import dev.kord.core.entity.*

suspend fun guardarTexto(mensagemSplit: List<String>, mensagemDados: Message) {
    if (mensagemSplit.size < 2) {
        mensagemDados.channel.createMessage(
            "O comando deve ser enviado dessa forma: !guardar [texto]")
        return
    }

    val texto = mensagemSplit.subList(1, mensagemSplit.size).joinToString(" ")
    textos.add(texto)

    mensagemDados.channel.createMessage("Mensagem salva!")
}