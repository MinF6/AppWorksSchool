fun main(args: Array<String>) {

    val human1 = Human("ZongMin")
    human1.attack()
    var flag = if(human1.mana) "${human1.name} has the power of mana!!" else "${human1.name} dosen't have the power of mana!!"
    println(flag)
}

open class Human(val name: String){
    open fun attack(){
        println("${name} use Fist Attack!")
    }
    open var mana: Boolean = false
}

class Mage(name:String) : Human(name){
    override fun attack(){
        println("${name} use Fireball!")
    }
    override var mana = true

}
