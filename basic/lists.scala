//The list data structure in scala is extremely peculiar. Where the contents of an array in
// scala have to be the same datatypee and an arays length is fixed.
// The contents themselves can be changed. Thus the array is immutable. 
//On the other hand, in a list data structure, the contents cannot be changed and also have to be the same datatype. 
//The lists in scala are immutable
//You can append and preprend to a scala list, but its contents are locked once and for all

//Defining a scala list
var onetwothree = List(1,2,3)
println(onetwothree)
println("____________________________")

var fourfivesix = List(4,5,6)
//Concatanating two lists. 
var onetwothreefourfivesix = onetwothree ::: fourfivesix
println(onetwothreefourfivesix)
println("____________________________")

//Defining an empty list
var emptylist = Nil
println(emptylist)

//Prepending a new element to a list
var stuff = List()
//Now remember, preprending to a list produces an entirely new list and the original list does not get altered
var stufftwo = 1 :: stuff
println(stufftwo)
println("_____________________________")
//Shorthand for defining a new list
var newstuff = 1 :: 2 :: 3 :: 4 :: Nil
println("_____________________________")
println(newstuff)
