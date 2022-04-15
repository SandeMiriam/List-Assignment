fun main(){
    var countries= myCountries(listOf("Kenya","Uganda","Tanzania","Rwanda","Burundi","Ghana","Namibia","Brazil","Mexico","Australia"))
    var heightPlusAverage = height(listOf(2.3,1.49,1.76,1.88))
    println(heightPlusAverage)
    var a = Man("Ninah",26,1.85,55.9)
    var b = Man("Swabra",25,2.3,75.5)
    var c = Man("Shanaya",24,1.75,95.5)
    var list1 = listOf(a,b,c)
    var citizens = list1.sortedByDescending { person-> person.age }
    println(citizens)
    var sindu = Man("Swabz",36,1.89,76.5)
    var vindu = Man("Ray",34,1.45,60.5)
    var list2 = listOf(sindu, vindu)
    println(list1.plus(list2))
    var Audi = Rover("KAR108G",96)
    var Patrol = Rover("KBZ024R",160)
    var cars = listOf(Audi, Patrol)
    println(myCars(cars))

}

//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)

fun myCountries(name: List<String>): List<String>{
    name.forEachIndexed { index, s ->
        if (index%2==0) {
            println(s)
        }

    }
    return  name
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)

fun height(values: List<Double>): String{
    var length = values.sum()
    var average = values.average()
    var total = "$length, $average"

    return total

}


//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)

data class Man(var name: String, var age:Int, var height:Double, var weight:Double)







//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)

fun Man(dwarf: List<Any>): List<Any>{
    return listOf()

}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)

data class Rover(var registration: String, var mileage: Int)
fun myCars(vehicle: List<Rover>): Int{
    var Kim = 0
    vehicle.forEach { car-> car.mileage
        Kim+= car.mileage
    }
    var avrg = Kim/vehicle.count()
    return  avrg
}