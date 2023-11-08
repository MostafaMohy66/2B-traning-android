package com.example.tasks_day_1.model

class Task {
//Kotlin Function Exercises
    fun task1(name:String){
        println("welcome $name")
    }
    fun task2(array:Array<Int>){
        for (item in array){
            if (item % 2 ==0) println(item)
        }
    }

    fun countVowels(sentence:String):Int{
        val vowels = arrayOf('a','i','e','o','u')
        var conter=0
        for (item in sentence){
            if (item in vowels) conter++
        }
        return conter
    }

    fun reversString(sentence:String):String{
        return  sentence.reversed()
    }

    fun isPalindrome(sentence:String):Boolean{
        val cleanSentence = sentence.lowercase().replace(Regex("[^a-zA-Z0-9]"), "")
        return cleanSentence == cleanSentence.reversed()
    }
    fun printMessege(){
        println("welcome to our world")
    }

    fun rectangleArea(length:Double=0.0,width:Double=0.0):Double{
        return length * width
    }

    fun calculatesBMI(height:Double=0.0,weight:Double=0.0):Double{
        return weight / height
    }
    fun calculatesAreaCircle(radius:Double):Double{
        val pi = 3.14
        var area=pi * Math.pow(radius,2.0)
        return area
    }
    fun task10(name:String,age:Int,city:String){
        println("your name is: $name , your age is : $age and you are living in $city")
    }
    //------------------------------------------------------------------------------------------
    //Kotlin Recursion and Tail Recursion function Exercises
    fun sumDigits(number:Int):Int{
        return  if(number < 10){
            number
        }else{
            var digit = number % 10
            var newNum = number / 10

            digit + sumDigits(newNum)
        }
    }

    fun powerOfnumber(number:Int ,power:Int):Int{
        return if (power == 0){
            1
        }else{
            number * powerOfnumber(number,power-1)
        }
    }

    fun sumRecursion(array:Array<Int>, index:Int=0):Int{
        if (array.isNotEmpty()){

            return if (index == array.size){
                0
            }else{
                array[index]+sumRecursion(array,index+1)
            }

        }else{
            return 0
        }



    }

    fun findSmallestElement(arr: IntArray, index: Int = 0, smallest: Int = Int.MAX_VALUE): Int {
        if (index == arr.size) {
            return smallest
        }

        return findSmallestElement(arr, index + 1, if (arr[index] < smallest) arr[index] else smallest)
    }
    //-------------------------------------------------------------------------------------------------------------------
    //Kotlin Lambda expressions
    //task1
    val multiply:(Int,Int)-> Int ={ x , y -> x*y}
    //task2
    val square :(Int)->Int={x -> x * x }
    //task3
    val isEven:(Int)->Boolean = { x -> x % 2==0}
    //task4
    val average:(Array<Int>)-> Int ={array ->
        var sum = 0
        for (item in array){
            sum+=item
        }
        sum/array.size
    }
    //task5
    val strinStartK:(Array<String>)->ArrayList<String> ={array ->
        var startWithK=ArrayList<String>()
        if (array.isNotEmpty()){
            for (item in array){
                if (item.startsWith("k")){
                    startWithK.add(item)
                }
            }
            startWithK

        }else{
            startWithK
        }
    }
}