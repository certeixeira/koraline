package koraline

import dev.kord.core.*
import dev.kord.core.entity.*
import dev.kord.core.event.message.*
import java.security.Security

val textos = mutableListOf<String>()

suspend fun main() {
    /*the bot has a bug when i tried to run, so i found a solution on stackoverflow,
    it fix the bug but i don't know what that code belows do*/
    System.setProperty("io.ktor.random.secure.random.provider", "DRBG")
    Security.setProperty("securerandom.drbg.config", "HMAC_DRBG,SHA-512,256,pr_and_reseed")



    val cliente = Kord("OTEyODIzMzY0MjI0MTc2MTQ4.YZ1jAQ.5Fpjs9CGNNYzn4_WKmzOP9SEmIQ")

    cliente.on<MessageCreateEvent> {
        val mensagemSplit = message.content.split(" ")
        when(mensagemSplit[0]){
            "!enquete" -> enquete(mensagemSplit, message)
            "!curiosidade" -> curiosidade(message)
            "!guardar" -> guardarTexto(mensagemSplit, message)
            "!mostrar" -> mostrarTextos(message)
            "!boaNoite" -> boaNoite(message)
        }
    }

    cliente.login()
}