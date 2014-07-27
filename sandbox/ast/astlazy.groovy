import groovy.transform.*


class Web {
	String url

	@Lazy 
	String content = url?.toURL().text
}

def w = new Web(url: 'http://www.mrhaki.com/books.xml')

println w.dump()

println w.content


class People {
	@Lazy
	List<String> names = ['mrhaki', 'hubert', 'gr8conf attendee']

	@Lazy
	List users = { names.collect{ new Expando(name: it)} }()
}

def p = new People()

println p.dump()

println p.names

println p.dump()

println p.users
