interface Taggable {
	void tag(String name)
}


def t1 = { println "Tagged with $it" } as Taggable

t1.tag('gr8conf')

Taggable t2 = { println "Tagged with $it" }

t2.tag('St.Paul')


abstract class Greeting {
	
	String say(final String name) {
		"$prefix, $name"
	}

	abstract getPrefix()
}

Greeting gr = { -> 'Hi' }

println gr.say('Gr8Conf US')