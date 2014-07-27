import groovy.transform.builder.*

@groovy.transform.ToString(includeNames=true,ignoreNulls=true)
@Builder(builderStrategy = InitializerStrategy, excludes='when')
class Event {
	String name
	String location
	Date when
}


@groovy.transform.CompileStatic 
def createEvent() {
	def builder = Event.createInitializer()
		         .name('Gr8Conf US')
		         .location('MSP')
    def e = new Event(builder)
    e.when = new Date()
	println e
}

createEvent()