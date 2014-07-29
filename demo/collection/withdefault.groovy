package gr8conf.us

def l = [0, 1, 2].withEagerDefault { index -> index }

println l

println l[100]

println l