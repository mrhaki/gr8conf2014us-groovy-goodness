package gr8conf

import gr8conf.us.User
import groovy.transform.CompileStatic

@CompileStatic
class App {
	void workWithUser() {
		def u = new User(username: 'mrhaki')
		u.changeUsername('hubert')
		println u
	}
}

def app = new App()
app.workWithUser()
