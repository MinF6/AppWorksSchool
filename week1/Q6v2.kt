fun main(args: Array<String>) {

    val human1 = Mage("ZongMin")
    human1.attack()
    human1.hasMana()
}

open class Human(val name: String){
    open fun attack(){
        println("${name} use Fist Attack!")
    }
    open fun hasMana(){
        println("${name} dosen't have the power of mana!!")
    }
}

class Mage(name:String) : Human(name){
    override fun attack(){
        println("${name} use Fireball!")
    }
    override fun hasMana(){
        println("${name} has the power of mana!!")
    }

}
