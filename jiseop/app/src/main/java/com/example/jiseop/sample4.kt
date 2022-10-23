package com.example.jiseop

//Singleton Pattern
//클래스를 읽을 때 한 번 객체를 생성하고 다시 생성하지 않는다
object CarFactory{
    var cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}