printMessage 'JAR Groovy script'

['Groovy', 'rocks'].each {
    print "${it.toUpperCase()} "
}
println '!'

def printMessage(message) {
    def LINE_LENGTH = message.size() + 4
    println '*' * LINE_LENGTH
    println "* $message *"
    println '*' * LINE_LENGTH
}