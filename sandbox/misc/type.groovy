class Person {
	String firstname, lastname
	String email

	Object asType(User clazz) {
		if (clazz == User) 
			new User(username: email)
	}
}

class User {
	String username
}

def p = new Person(firstname: 'Hubert', lastname: 'Klein Ikkink', email: 'mrhaki@jdriven.com')

def u = p as User

println u.username