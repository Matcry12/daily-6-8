package `daily 6 8`

//2. Nhập tháng và năm. In ra số ngày trong tháng đó.
fun main() {
    val thang: Int
    val nam: Int

    println("moi nhap thang va nam")
    thang = readLine()!!.toInt()
    nam = readLine()!!.toInt()
    if (thang <= 12) {
    if (nam % 4 == 0) {
        if (thang == 1) { println("thang $thang co 31 ngay") }
        if (thang == 2) { println("thang $thang co 29 ngay") }
        if (thang == 3) { println("thang $thang co 31 ngay") }
        if (thang == 4) { println("thang $thang co 30 ngay") }
        if (thang == 5) { println("thang $thang co 31 ngay") }
        if (thang  == 6) { println("thang $thang co 30 ngay") }
        if (thang  == 7) { println("thang $thang co 31 ngay") }
        if (thang == 8) { println("thang $thang co 31 ngay") }
        if (thang  == 9) { println("thang $thang co 30 ngay") }
        if (thang == 10) { println("thang $thang co 31 ngay") }
        if (thang  == 11) { println("thang $thang co 30 ngay") }
        if (thang  == 12) { println("thang $thang co 31 ngay") }
        }

     else {
        if (thang == 1) { println("thang $thang co 31 ngay") }
        if (thang == 2) { println("thang $thang co 28 ngay") }
        if (thang == 3) { println("thang $thang co 31 ngay") }
        if (thang == 4) { println("thang $thang co 30 ngay") }
        if (thang == 5) { println("thang $thang co 31 ngay") }
        if (thang  == 6) { println("thang $thang co 30 ngay") }
        if (thang  == 7) { println("thang $thang co 31 ngay") }
        if (thang == 8) { println("thang $thang co 31 ngay") }
        if (thang  == 9) { println("thang $thang co 30 ngay") }
        if (thang == 10) { println("thang $thang co 31 ngay") }
        if (thang  == 11) { println("thang $thang co 30 ngay") }
        if (thang  == 12) { println("thang $thang co 31 ngay") }
        }
    }
}