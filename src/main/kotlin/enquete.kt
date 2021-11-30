package koraline

import dev.kord.core.entity.*

val sim = ReactionEmoji.Unicode("\u2705")
val nao = ReactionEmoji.Unicode("\u274C")

suspend fun enquete(mensagemSplit: List<String>, mensagemDados: Message) {
    if (mensagemSplit.size < 2) {
        mensagemDados.channel.createMessage(
            "Envie o comando da forma correta, exemplo: !enquente [nome da enquente]")
        return
    }

    val enquete = mensagemSplit.subList(1, mensagemSplit.size).joinToString(" ")
    val resposta = mensagemDados.channel.createMessage("Iniciei a enquete: $enquete")

    resposta.addReaction(sim)
    resposta.addReaction(nao)
}

