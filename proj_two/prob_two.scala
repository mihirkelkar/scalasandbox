println("Enter the first operand")
var num_one = readInt()
println("Enter the second operand")
var num_two = readInt()
println("Enter the operation")
var op = readLine().toLowerCase
//println(num_one, num_two, op)
var operations = List("add", "subtract", "divide", "multiply")
if(operations.contains(op))
{
	if(op == "add"){
			println(num_one + num_two)
		}
	else if(op == "subtract"){
			println(num_one - num_two)
		}
	else if(op == "multilpy"){
			println(num_one * num_two)
		}
	else if(op == "divide"){
			if(num_two == 0){
			println("Division by zero is not allowed")
			}
			else{
			println(num_one.toFloat / num_two.toFloat)
			}
		}
	
}
else
{
	println(op + " is not a valid operation")
}

