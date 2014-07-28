def l = ['mrhaki', 'hubert', 'other']

println l.take(5)
println l.take(2)

println l.drop(2)

println l.takeWhile { it.size() == 6 }

println l.dropWhile { it.contains('a') }