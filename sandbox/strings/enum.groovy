enum Compass {
	NORTH, EAST, SOUTH, WEST
}

def n = 'NORTH' as Compass

println n.class.name
println n
println n.next()
