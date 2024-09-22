class Car{
    var make: String = ""
    var model: String= ""
    var year: Int= 0

    fun getInfo(): String {
        return "$make $model, year $year"
    }
}

fun main(){
    var myCar =Car()
    myCar.make="Toyota"
    myCar.model="Carmy"
    myCar.year=2020

    println(myCar.getInfo())
}