def name = 'mrhaki'

def s = "Hello $name"

println s

name = 'Hubert'

println s


def user = 'mrhaki'

def s1 = "Hello ${-> user}"

println s1

user = 'Hubert'

println s1