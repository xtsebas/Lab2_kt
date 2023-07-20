import kotlin.random.Random

fun calcularPromedio(numbers: List<Int>): Int{
    var sum=  numbers.reduce{acc, num -> (acc + num)}
    return sum/numbers.size
}

fun isPalindrome(cadena: String): Boolean { return cadena == cadena.reversed() }

fun performOperation(a: Int, b: Int, multi: (Int,Int)-> Int ): Int{return multi(a,b)}

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun personToStudent(person: Person): Student{
    val idStudent= Random.nextInt(0, 21)
    return Student(person.name, person.age, person.gender, idStudent.toString())
}
fun main(args: Array<String>) {
    //first
    val list = listOf(1,2,3,4,5)
    println(calcularPromedio(list))
    println("////////////////////////////////////////")

    //second
    val enteros = listOf(6,7,8,9,10)
    val impares= enteros.filter {it%2!=0}
    for (number in impares){
        println(number)
    }
    println("////////////////////////////////////////")

    //third
    var cadena = "sebas"
    if (isPalindrome(cadena)){
        println("Si es")
    }else{
        println("No es")
    }
    println("////////////////////////////////////////")

    //fourth
    var names= listOf("Sebas", "Diego", "Irving", "Sofia", "Majo")
    var modify = names.map { names -> "Hola, " + names + "!" }
    for (names in modify){
        println(names)
    }
    println("////////////////////////////////////////")

    //fifth
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    val result = performOperation(3,4, sum)
    println(result)
    println("////////////////////////////////////////")

    //sixth
    val personList = listOf( Person("Alcira", 20, "F"), Person("Bob", 22, "M"), Person("TUtis", 19, "M"))
    val student = personList.map { person -> personToStudent(person) }
    for (person in student){
        println("El estudiante ${person.name} con Id ${person.studentId} tiene ${person.age} años")
    }

}