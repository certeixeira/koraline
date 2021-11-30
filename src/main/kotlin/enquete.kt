package koraline

import dev.kord.core.entity.*

val sim = ReactionEmoji.Unicode("\u2705")
val nao = ReactionEmoji.Unicode("\u274C")

suspend fun enquete(messageSplit: List<String>, messageData: Message) {
    if (messageSplit.size < 2) {
        messageData.channel.createMessage(
            "Envie o comando da forma correta, exemplo: !enquente [nome da enquente]")
        return
    }

    val enquete = messageSplit.subList(1, messageSplit.size).joinToString(" ")
    val resposta = messageData.channel.createMessage("Iniciei a enquete: $enquete")

    resposta.addReaction(sim)
    resposta.addReaction(nao)
}

