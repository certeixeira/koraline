package koraline

import dev.kord.core.entity.*

val boaNoites = listOf(
    "Vai tomar no cu",
    "Foda-se",
    "Foda-se vc tbm arrombado",
    "Boa noite, durma bem <3",
    "O diabo que te carregue",
    "kkkkkkkkkkkk"
)

suspend fun boaNoite (messageData: Message) {
    val dormir = boaNoites.random()
    messageData.channel.createMessage(dormir)
}