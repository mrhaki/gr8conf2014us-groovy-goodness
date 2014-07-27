import groovy.transform.*
import groovy.transform.builder.*

@Builder
@ToString(includeNames=true)
class Event {
	String name
	String location
	Date when
}

def gr8confus = Event.builder()
	.name('Gr8Conf US')
	.location('Minneapolis')
	.when(new Date())
	.build()

def gr8confeu = new Event()
gr8confeu.with {
	name = 'Gr8Conf EU'
	location = 'Copenhagen'
	when = new Date() - 45
}

println gr8confus

println gr8confeu