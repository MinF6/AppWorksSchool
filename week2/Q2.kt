fun main(args: Array<String>) {
    val str1 = "This is a string"
    //取得位置5之後的字串
    println(str1.substring(5))
    //取得從位置1到位置2之前的字串
    println(str1.substring(1,2))
    //取得從位置1到位置2的字
    println(str1.substring(1..2))



    val str2 = "This is a string"
    val split = str2.split(' ')
    //用空格來區分
    println(split)

}

