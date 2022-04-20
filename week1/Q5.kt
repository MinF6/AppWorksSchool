fun main(args: Array<String>) {

    val human1 = Mage("ZongMin")
    human1.attack()

}

open class Human(val name: String){
    open fun attack(){
        println("${name} use Fist Attack!")
    }
}

class Mage(name:String) : Human(name){
    override fun attack(){
        println("${name} use Fireball!")
    }
}
