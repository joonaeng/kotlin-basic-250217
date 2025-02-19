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

//    val numbers = listOf(1, 2, 3, 4, 5, 6)
//    val evenNumber = numbers.filter { it % 2 == 0 }
//    println(evenNumber)
//    //filter 함수를 사용해서 필터링 가능 내부 인자 = it

//    val names = listOf("Alice", "Bob", "Charlie")
//    val greetings = names.map { "Hello, $it" }
//    greetings.forEach(::println)
//    //코틀린에서는 기본적으로 map이 제공되어 mapping 가능하다

//    val name: String? = null
//    val displayName = name ?: "Guest"
//    println("Hello, $displayName")
//    //엘비스 연산자 ?: null인 경우 기본값을 제공할 수 있다.

//    val obj: Any = "Hello"
//    if (obj is String) {
//        println(obj.length)
//    }
//    //is를 통해 자동 타입 캐스팅이 가능하다.

//    //apply, let, also, run, with 같은 스코프 함수를 제공한다.
//    val person = Person().apply {
//        name = "Alice"
//        age = 30
//    }
//    person.printInfo()
//    //apply 객체를 생성한 후 내부 속성을 설정할 때 사용
//    //마지막에 해당 객체 반환함, 객체 초기화에 유용하다

//    val name: String? = null
////    val name: String? = "Alice"
//    name?.let {
//        println("Length: ${it.length}")
//    }
//    //let은 null이 아닌 경우 특정 로직을 실행하는데 유용하다.
//    //리턴값을 변환하여 새로운 값으로 사용할 수도 있습니다.
//    //주로 안전호출 ?. 과 함께 사용된다.

//    val message ="Hello".also {
//        println("Before: $it")
//    }.uppercase().also {
//        println("After: $it")
//    }
//    //also는 객체를 유지하면서 추가적인 작업을 수행할 때 사용
//    //로그출력이나 디버깅에 활용된다.

//    val result = run {
//        val x = 5
//        x * 2 + 10
//    }
//    println("Result: $result")
//    //run은 일회성 작업을 수행한 후 결과를 반환할 때 유용
//    //객체 생성 없이 특정 블록 실행 가능

//    val person = Person("Alice", 30, 55.0 ,50000.0)
//    val info = with(person) {
//        increaseAge(5)
//        increaseWeight(3.5)
//        increaseSalary(10000.0)
//        getInfo()
//    }
//    println(info)
//    //with는 객체를 컨텍스트로 가져와 여러작업을 수행한 후 결과를 반환합니다.
//    //객체를 수정하는 점이 아니라 작업만 수행하는 점이 apply와 다르다.

    //apply, also 객체 자체 반환
    //let, run, with 람다 결과를 반환
    //apply, run, with -> this 사용
    //let, also -> it 사용

//    val person = Person()
//    person.apply { // 객체 자체 반환
//        name = "Alice"
//        age = 30
//    }.also { // 객체 그대로 유지하면서 로깅 가능
//        println("Created person: ${it.name}, ${it.age}")
//    }.let { // 변환 가능 (여기서는 이름 길이 반환)
//        it.name.length
//    }.run { // 특정 연산 후 결과 반환
//        this * 2
//    }.also { println("Final result: $it") }
//
//    val personInfo = with(person) { // 객체 컨텍스트로 실행 후 결과 반환
//        "Name: $name, Age: $age"
//    }
//    println(personInfo)

//    val example = Example()
//    //lateinit 초기화 없이 선언 가능 나중에 값을 할당
//    example.value = "Hello, Kotlin!"
//    //값 초기화 전에 접근하면 예외 발생
//    example.printValue()

//    println("Before accessing lazyValue")
//    println(lazyValue) // 첫 호출 시 초기화
//    //객체를 처음 사용할 때 초기화 됨 지연로딩
//    println(lazyValue) // 이후에는 캐싱된 값 사용

//    val example = Example()
//    // lateinit 사용: 명시적으로 값 할당 후 사용
//    example.name = "Alice"
//    println("Name: ${example.name}")
//    // lazy 사용: 최초 접근 시 초기화
//    println("Before accessing lazyMessage")
//    println(example.lazyMessage)
//    println(example.lazyMessage) // 두 번째 호출은 초기화 없이 사용
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

//class Person {
//    var name: String = ""
//    var age: Int = 0
//
//    fun printInfo() {
//        println("$name is $age years old.")
//    }
//}

//class Person(val name: String, var age: Int, var weight: Double, var salary: Double) {
//    fun increaseAge(years: Int) {
//        age += years
//    }
//
//    fun increaseWeight(kg: Double) {
//        weight += kg
//    }
//
//    fun increaseSalary(amount: Double) {
//        salary += amount
//    }
//
//    fun getInfo() = "$name is $age years old, weights $weight kg, and earns $salary"
//}
//
//class Person {
//    var name: String = ""
//    var age: Int = 0
//}

//class Example {
//    lateinit var value: String
//    //lateinit은 var에서 사용가능
//    //null 허용 불가
//    fun printValue() {
//        println(value)
//    }
//}

//val lazyValue: String by lazy {
//    println("Initializing...") //최초 접근시 실행
//    //lazy는 val에서 사용가능
//    //한번만 초기화 됨
//    "Hello, Lazy!"
//}

//class Example {
//    lateinit var name: String
//    val lazyMessage: String by lazy {
//        println("Lazy value initialized!")
//        "Hello, Lazy!"
//    }
//}