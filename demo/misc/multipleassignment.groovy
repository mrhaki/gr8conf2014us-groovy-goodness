package gr8conf.us

def entry = '100 Dollar'



def (ex, amount, currency) = (entry =~ /(\d+) (\w+)/)[0]

println amount
println currency