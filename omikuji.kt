import java.util.Random

fun main(args: Array<String>) {
    val r = Random()
    val num = r.nextInt(6) + 1
    val omikuji =
        if (num == 1) "大吉"
        else if (num == 2) "中吉"
        else if (num == 3) "小吉"
        else if (num == 4) "吉"
        else if (num == 5) "凶"
        else "大凶"    
    println(omikuji)
}
