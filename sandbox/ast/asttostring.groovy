package gr8conf.us

import groovy.transform.ToString

//@ToString()
//@ToString(includeNames=true)
//@ToString(includeNames=true, includePackage=false,ignoreNulls=true)
@ToString(cache=true)
class Event {
	String name
	String location
	Date start
	Date end
}

def e = new Event(name: 'Gr8Conf US', 
	start: new Date(), end: new Date() + 2)

println e.toString()

e.location = 'MSP'

println e.toString()