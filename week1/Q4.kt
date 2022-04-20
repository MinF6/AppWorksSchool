fun main(args: Array<String>) {

    val human1 = Human("ZongMin")
    human1.attack()

}

class Human(val name: String){
    fun attack(){
        println("${name} use Fist Attack!")
    }
}
