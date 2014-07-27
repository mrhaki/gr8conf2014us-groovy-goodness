import groovy.transform.*


class Calc {

	@Memoized
	long longCalculation(multiplier) {
		long result = multiplier * 1_000_000
		println "$multiplier * 1_000_000 = $result"
		result
	}

	long calc(multiplier) {
		def calc = { 
			long result = multiplier * 1_000_000
			println "$multiplier * 1_000_000 = $result"
			result
		}.memoize()
		calc(multiplier)
	}

}

def c = new Calc()

println c.longCalculation(100)
println c.longCalculation(1_000)
println c.longCalculation(100)

println c.calc(100)
println c.calc(1_000)
println c.calc(100)

