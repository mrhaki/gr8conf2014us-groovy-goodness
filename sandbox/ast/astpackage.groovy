package gr8conf.us

import groovy.transform.PackageScope

class User {
	String username

	@PackageScope
	void changeUsername(final String name) {
		this.username = name
	}
}

