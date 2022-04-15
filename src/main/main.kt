fun main(){
    var countries= favCountries(listOf("Busia","Moroco","Rwanda","Amsterdam","Zambia","Singapore","Canada","Morocco","Italy","Berlin"))
    var heightAndAverage = heightOfPeople(listOf(2.3,1.49,1.76,1.88))
    println(heightAndAverage)
    var insan = Human("Nina",22,1.45,47.5)
    var people = Human("Rehema",23,1.49,54.5)
    var mahluk = Human("Miriam",21,1.45,55.5)
    var list1 = listOf(insan,people,mahluk)
    var individuals = list1.sortedByDescending { person-> person.age }
    println(individuals)
    var mundu = Human("Kimberly",22,1.49,53.5)
    var andu = Human("Jane",23,1.70,52.5)
    var list2 = listOf(mundu, andu)
    println(list1.plus(list2))
    var Range = Risaal("KDS105J",80)
    var Lambo = Risaal("KBD134A",120)
    var Risaals = listOf(Range, Lambo)
    println(myRisaal(Risaals))

}

//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)

fun favCountries(names: List<String>): List<String>{
    names.forEachIndexed { index, s ->
        if (index%2==0) {
            println(s)
        }

    }
    return  names
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)

fun heightOfPeople(values: List<Double>): String{
    var urefu = values.sum()
    var avg = values.average()
    var both = "$urefu, $avg"

    return both

}


//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)

data class Human(var name: String, var age:Int, var height:Double, var weight:Double)







//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)

fun naas(gente: List<Any>): List<Any>{
    return listOf()

}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)

data class Risaal(var registration: String, var mileage: Int)
fun myRisaal(vehicle: List<Risaal>): Int{
    var kiki = 0
    vehicle.forEach { car-> car.mileage
        kiki+= car.mileage
    }
    var avrg = Rene/vehicle.count()
    return  avrg
}