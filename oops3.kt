//kotlin Nested class and inner class 

class Car{
    var make: String=""
    var model: String=""
    var year:Int=0

    inner class Engine{
        var horsepower:Int=0 
        var cylinders:Int=0

        fun getEngineInfo(): String {
            return "$horsepower horsepower, $cylinders cylinders in a $make $model"
        }
    }

    fun getInfo():String {
        return "$make $model, year $year"
    }
}

fun main(){
    val myCar=Car()
    myCar.make="Toyota"
    myCar.model="Carmy"
    myCar.year=2020

    val engine =myCar.Engine()
    engine.horsepower=250 
    engine.cylinders=6

    println(engine.getEngineInfo())
}