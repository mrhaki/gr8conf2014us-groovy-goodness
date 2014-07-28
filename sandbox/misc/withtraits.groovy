import groovy.transform.*

trait Id {
	Long id
}

class User {
	String username
}

def u = new User(username: 'mrhaki') as Id
u.id = 100

println u.username
println u.id


trait Version {
	Long version = 0
}

def u2 = new User(username: 'hubert').withTraits Id, Version
u2.version = 1
u2.id = 200

println u2.version
println u2.id
println u2.username