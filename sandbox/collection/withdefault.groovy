def m = [event: 'Gr8Conf US'].withDefault { key ->
	key.isNumber() ? 42 : 'Groovy rocks'
}

println m

println m['42']
println m.other



def l = [0,1,2].withDefault { 'default' }

println l
println l[3]
println l[10]

println l

def l2 = [0,1,2].withEagerDefault { 'default' }

println l2
println l2[3]
println l2[10]

println l2

def l3 = [0,1,2].withEagerDefault { index ->
	index
}

println l3[5]
println l3[100]

println l3