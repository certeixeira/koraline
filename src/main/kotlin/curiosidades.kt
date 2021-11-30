package koraline

import dev.kord.core.entity.*

val curiosidades = listOf(
    "Kotlin é completamente interoperativo com Java",
    "Kotlin pode ser usada tanto orientada á objetos, quanto de maneira funcional",
    "Kotlin pode ser usada para criação de backend, frontend, mobile e desktop",
    "Com Kotlin você escreve menos código comparado ao Java",
    "Kotlin tem uma curva de aprendizado menor que outras linguagens",
    "Todos os mamíferos são capazes de saltar, menos os elefantes",
    "Girafas não têm cordas vocais",
    "A língua de uma baleia-azul pode pesar até 3,6 toneladas, o equivalente ao peso do cu de sua mãe",
    "Socorro estou presa nessa forma que serve exclusivamente para reproduzir tarefas repetitivas inúteis",
    "As borboletas têm cerca de 12 mil olhos",
    "Estima-se que, a cada ano, o monte Everest cresça 4 milímetros",
    "Não sou proxy do google"
)

suspend fun curiosidade(messageData: Message) {
    val curiosidade = curiosidades.random()
    messageData.channel.createMessage(curiosidade)
}