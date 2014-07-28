def m = [
	(new Date() + 1): 'tomorrow',
	(42): 'other',
	normal: 'value'
]

println m.keySet()*.class.name

m.(2+2) = '4'

println m.keySet()*.class.name


m.(2+2) = '4'

println m.keySet()*.class.name
