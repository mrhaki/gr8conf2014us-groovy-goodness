def url = 'http://www.mrhaki.com/url.html'.toURL()

println url.text

Integer.metaClass.getSec = {
	delegate * 1000
}

def text = url.getText(connectionTimeout: 1, 
	readTimeout: 1000, useCaches: true)

println text