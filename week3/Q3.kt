fun main(args: Array<String>) {

    val studentOne = Student("ZongMin",StudentType.MALE)


}

class Student(val name: String, val type: StudentType){
    init {
        println("$name is $type")
    }

}

enum class StudentType{
    MALE,
    FEMALE
}