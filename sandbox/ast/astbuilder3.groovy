import groovy.transform.builder.*
import groovy.transform.*

@ToString()
class Event {
	String name
	String location
	Date when
}

@Builder(builderStrategy = ExternalStrategy, forClass = Event)
class EventBuilder {

}

def event = new EventBuilder()
	.name('Gr8Conf US')
	.build()

println event
