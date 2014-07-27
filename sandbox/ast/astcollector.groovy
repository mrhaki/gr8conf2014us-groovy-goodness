import groovy.transform.*

@AnnotationCollector([ToString, EqualsAndHashCode])
@interface PlainObject {}


@PlainObject(includeNames=true, ignoreNulls=true)
class Event {
	String name = 'gr8conf US'
}

def e = new Event()
def e1 = new Event()
println e

println e == e1

println Event.class.annotations