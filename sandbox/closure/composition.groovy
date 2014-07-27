def upper = { it.toUpperCase() }
def size = {it.size()}
def add = { it + it }

println add(2)
println add('a')

def upperAdd = upper >> add

println upperAdd('a')

def sizeAdd = add << size

println sizeAdd('abc')