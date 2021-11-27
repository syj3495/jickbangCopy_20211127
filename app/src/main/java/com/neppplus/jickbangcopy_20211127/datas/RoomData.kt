package com.neppplus.jickbangcopy_20211127.datas

import java.text.NumberFormat
import java.util.*

class RoomData(

    val price: Int,
    val address: String,
    val floor: Int,
    val description: String

) {

//    방 데이터의 기능 : 가격을 가공해서 String으로 주는 기능, +> 리스트뷰 / 상세화면 두군데에서 사용.

    fun getFormattedPrice() : String{
        if( this.price < 10000 ){

//            return "1억미만"
//            ex, 8000 -. 8,000

            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

        }else{

//            return "1억이상"
//            175300 -> 17억 5,300

            val uk = this.price / 10000 //Int나누기 Int하면 결과도 Int로 나누고 소수점 버림 => 억단위 추출

            val rest = this.price % 10000 // 나머지 구하기 => 천만원단위
            val str = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)


            return "${uk}억${str}"


        }


    }

//    추가 기능 : 층수도 가공해서 String으로 주자.

    fun getFormattedFloor() : String {

        if( this.floor >0 ){

            return "${this.floor}층"

        }else if ( this.floor ==0){
            return "반지하"

        }else {

            return "지하${-this.floor}층" // -숫자에 -붙여주면 +가 된다.
        }

    }




}