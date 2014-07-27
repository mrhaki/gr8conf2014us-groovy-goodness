import groovy.transform.*

@ToString()
class User {
	String username
}

//@Newify
@Newify([User])
class Creator {

	def createUsers() {
		//[[username: 'mrhaki'] as User]
		//[new User(username: 'mrhaki')]
		//[User.newInstance(username: 'mrhaki')]
		//[User.new(username:'mrhaki')]
		[User(username: 'mrhaki')]
	}

}

@Newify
def creator = Creator.new()

println creator.createUsers()