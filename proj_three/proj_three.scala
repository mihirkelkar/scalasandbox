import scala.collection.mutable.ListBuffer
def menu() :Int  = {
	println("Enter 1 to see a sentence")
	println("Enter 2 to see the whole list")
	println("Enter 3 to change a sentence")
	println("Enter 4 to switch words")
	println("enter 5 to count letters")
	var menu_choice = readInt()
	return menu_choice
}
def makeList() :ListBuffer[String] =  {
	println("How many sentences?")
	var number = readInt()
	if(number < 0)
	{
		number = 5
	}
	var major = new ListBuffer[String]()
	for(a <- 0 to number - 1)
	{
		major += readLine()
	}	
	//println(major)
	return major
}	
var major  = makeList()
for(l <- 0 to major.length - 1)
{
	var menu_choice = menu()
	println("You selected choice " + menu_choice)
	if(menu_choice == 1)
		{
			println("Which sentence?")
			var index = readInt()
			if(index < 0 || index > major.length - 1)
				println("Invalid Index")	
			else {
				println(major(index))
			}
		}
	else if(menu_choice == 2)
		{
			for(i <- 0 to major.length - 1)
			{
				println(major(i))
			}
		}
	else if(menu_choice == 3)
		{
			println("Which sentence?")
			var in_one = readInt()
			if(in_one < 0 || in_one > major.length - 1)
				println("No such sentence with index" + in_one)
			else{
				println("Enter your new sentence")
				major(in_one) = readLine()
				//println(major)
			}
		}
	else if(menu_choice == 4)
		{
			println("Swap word")
			var word_one = readLine()
			println("in sentence")
			var index_one = readInt()
			println("with word")
			var word_two = readLine()
			println("in sentence")
			var index_two = readInt()
			if(major(index_one).contains(word_one) && major(index_two).contains(word_two))
			{
				major(index_one) = major(index_one).replace(word_one, word_two)
				major(index_two) = major(index_two).replace(word_two, word_one)
			}
			else
			{
				println("One of the indexes is invalid")
			}

		}
	else if(menu_choice == 5) 
		{			
			println("Enter the character you want to count")
		}


	else 
		{
			println("Invalid Index")
		}
	println("------------")
}
