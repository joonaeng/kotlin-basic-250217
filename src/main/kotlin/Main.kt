package com.ll

import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import javax.xml.transform.Source

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //코틀린의 메인 함수는 fun 이다

//    val name = "Kotlin"
//    val number = 11
//    //코틀린의 입력은 val(불변), var(가변으로 나뉜다)
//
//    val message = if(number % 2 == 0) "Even Number" else "Odd Number"
//    //코틀린에서는 if, else문을 표현식으로 가능하다.
//
//    for (i in 0 until 5) {
//        println("Count : $i")
//    }
//    //반복문은 in-until로 in~until-1까지 반복한다.
//
//    println("Name : $name")
//    println("Number : $number")
//    println("Message : $message")
//    //코틀린에서는 출력을 println으로 표현하며 $를 사용해 인자값을 받아올 수 있다
//
//    val result = add(5, number)
//    println("Result : $result")
//
//    val person = Person("Alice")
//    person.greet()
////    객체 선언을 간결하게 정의할 수 있다.

//    val names = listOf("Alice", "Bob", "Charlie")
//    for (name in names) {
//        println(name)
//    }
//    //리스트 선언은 listOf를 사용해서 하고 내부값을 가져올 때는 in을 사용한다.

//    val ages = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35)
//    for ((name, age) in ages) {
//        println("$name is $age years old.")
//    }
//    //map 선언은 mapOf를 사용해서 하고 내부 값을 가져올때는 in을 사용한다.

//    val name : String? = null
//    println(name?.length ?: "Name is null")
//    val person:Person? = Person()
//    // 코틀린에서는 안전하게 함수 호출하려면 이렇게만 해도 됩니다.
//    person?.leftArm?.hand?.grab();
//    //nullable 타입은 ?를 사용해서 명시하고 ?. 연산자로 안전하게 접근합니다.

//    val names = listOf("Alice", "Bob", "Charlie")
//    names.forEach{ println("Hello, $it") }
//    //람다 표현식은 다음과 같이 표시하고 it을 사용해서 단일 매개변수 조회가 가능하다.

//    val person = Person("Alice", 30)
//    println(person)
//    //데이터 클래스의 경우 자동형변환이 가능하다.

//    println("Alice".greet())
//    //확장함수 기존 클래스에 새로운 함수를 추가하는 확장 함수 기능

//    sayHello()
//    sayHello("Alice")
//    //코틀린에서는 기본 매개변수를 제공하여 오버로딩 없이 기본값 설정 가능

//    Singleton.showMessage()
//    //object를 사용해서 싱글톤 패턴을 만들 수 있다.

//    val name = "Alice"
//    val age = 25
//    println("My name is  $name and I am $age years old")
//    //문자열 탬플릿은 $를 사용하여 문자형에 상관없이 사용가능하다.

//    copy("a.txt", "a_copy.txt")
//    //try를 표현식으로 사용할 수 있습니다.

//    val day = 3
//    val dayName = when(day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        else -> "Invalid Day"
//    }
//    println("Day : $dayName")
//    //when문은 자바의 switch 문을 대신하고 else는 기본적인 default 역할이다.
}

//fun add(a : Int, b : Int) : Int {
//    //함수의 반환 타입은 함수 선언 끝에 적는다.
//    return a + b
//}

//class Person(private val name : String) {
//    //객체 선언을 간결하게 정의할 수 있다.
//    fun greet() {
//        println("Hello, my name is $name")
//    }
//}

//data class Person(val name: String, val age: Int)
////자동형변환

//fun String.greet(): String {
//    return "Hello, $this!"
//    //기존 클래스에 새로운 함수를 추가할 수 있는 확장함수 기능 제공
//}

//fun sayHello(name: String = "Guest") {
//    println("Hello, $name")
//    //코틀린에서는 기본 매개변수를 제공하여 오버로딩 없이 기본값 설정 가능
//}

//object Singleton {
//    fun showMessage() {
//        println("Hello from Singleton!")
//    }
//    //object를 사용해서 싱글톤 패턴을 만들 수 있다.
//}

//fun copy(source: String, target: String) {
//    Files.copy(File(source).toPath(),File(target).toPath(), StandardCopyOption.REPLACE_EXISTING)
//}
////throws 선언이 필요없이 예외처리를 할 수 있습니다.