//Declaring Arrays in scala

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ","
greetStrings(2) = "World"

greetStrings.foreach(print)
print("\n")
println("----------------------------------")
for(i <- 0 to 2)
	print(greetStrings(i))
print("\n")

