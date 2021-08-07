package `daily 6 8`

//1. Nhập 4 điểm: ktra miệng, 15', 1 tiết, học kỳ và in ra điểm tổng kết. Nếu điểm tổng kết trên 8 thì in ra HSG, từ 6.5-8 là HSK, còn lại thì ...
//Công thức tính: (miệng + 15' + 1 tiết *2 + hk*3) / 7

fun main() {
    val ktra_mieng: Double
    val ktra_15: Double
    val ktra_1tiet: Double
    val Ktra_Hk: Double
    val TK: Double
    println("luu y tat ca deu la double ")
    println("xin moi nhap du lieu theo thu tu, tu ktra miệng, 15', 1 tiết, học kỳ")
    ktra_mieng = readLine()!!.toDouble()
    ktra_15 = readLine()!!.toDouble()
    ktra_1tiet = readLine()!!.toDouble()
    Ktra_Hk = readLine()!!.toDouble()

    TK = (ktra_mieng + ktra_15 + ktra_1tiet * 2 + Ktra_Hk * 3) / 7
    if (TK <= 10) {
        println("diem tong ket cua ban la  $TK")
        print("====> ")
        if (TK >= 8) {
            print("Ban la hoc sinh gioi")
        } else {
            if (TK >= 6.5) {
                print("ban la hoc sinh kha")
            } else {
                print("ban la hoc sinh Trung binh")
            }
        }
    }
    else {
        println("xảy ra lỗi máy tính chỉ nhận dưới 10 điểm và phải ghi theo double")
    }
}




