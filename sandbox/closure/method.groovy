class Methods {
	static def size(final String name) {
		name.size()
	}
}

def sizeClosure = Methods.&size

def l = ['mrhaki', 'hubert', 'other']


println l.collect(sizeClosure)