printMessage 'Remote Groovy script @ http://www.mrhaki.com/samples/remotesample.groovy'

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