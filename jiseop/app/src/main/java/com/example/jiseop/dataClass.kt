package com.example.jiseop


//데이터 클래스
// toString(), hashCode(), equals(), copy() -> 컴파일 시 만들어짐
// data class와 class의 차이점
// data class: 지금 데이터 클래스 안에 들어있는 값을 보여줌()
// class : 지금 데이터 클래스의 주소지를 보여줌
data class Ticket(val companyName : String, val name : String, var date : String,var seatNumber : Int)
class TicketNormal(val companyName : String, val name : String, var date : String,var seatNumber : Int)


fun main(){
    val ticketA = Ticket("koreanAir","songjiseop","2020-10-23", seatNumber = 14)
    val ticketB = TicketNormal("koreanAir","songjiseop","2020-10-23", seatNumber = 14)
    println(ticketA)//지금 친 클래스의 값을 보여줌
    println(ticketB)//메모리 주소지를 찾을 수 있음
}

