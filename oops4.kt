//kotlin program to demonstrate the nested class
 
class outerClass {
    var str :String ="Outer Class"

    class innerClass(){
        var s1 :String =""
        fun nestFunc():String {
            var s2=str 
            return s2 
        }
    }
}

fun main(){
    val inner=outerClass.innerClass()
    inner.s1="Anurag pawar"
    println(inner.nestFunc())
}