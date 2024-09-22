//kotlin prgoram of creating multiple objects and accessing the property and member function of class 

class employee {
    
    //Constructor
     var name: String=""
     var age: Int=0
     var gender: Char='M'
     var salary: Double= 0.0
     

     fun insertValues(n:String, a:Int,g:Char,s:Double) {
        name=n 
        age=a 
        gender=g 
        salary=s
        println("name of the employee : $name")
        println("age of the employee: $age")
        println("gender of the employee: $gender")
        println("salary of the employee: $salary")
     }
}

fun main(){
    //creating multiple objects 
    var obj= employee()

    //objects 2 of class employee 
    var obj1=employee()

    //object 3 of class employee 
    var obj2=employee()

    obj.insertValues("Anurag",21,'M',1223456.25)
    obj1.insertValues("Omkar",21,'M',800050.34)
    obj2.insertValues("sahil",21,'M',900000.34)
}

