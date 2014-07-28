def (a,b,c) = ['ABC', 1, new Date()]

println a
println b
println c


def (String d, int e, Date f) = ['ABC', 1, new Date()]

println d
println e
println f


def value = '100 Dollar'

def regex = /(\d+) (\w+)/
def (ex, amount, currency) = (value =~ regex)[0]

println amount
println currency