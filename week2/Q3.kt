fun main(args: Array<String>) {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    for (fruit in numbersMap) {
        println("${fruit.key} (${fruit.value})")
    }

}

