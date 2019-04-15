fun main(args: Array<String>) {
    /*
      val name = "Marco"
      val lastname = "Parco"
      val age = 27
      val rate = 15.8

      var speed:Double = 15.0

      //speed = 15.5

      println("Speed value is $speed")
      println("Speed + 1 value is ${speed + 1}")

      if(speed >10){
          println("Too Fast")
      }else{
          println("atright")
      }

      for(i in 1..10){
          println(i)
      }

      pepito@ for (row in 1..5){
          for (column in 1..5){
              if(row==2 && column==2){
                  continue@pepito
              }
              println(column)
          }
          println()
      }

      var count =10
      while(count>0){
          println(count)
          count --
      }


      do{
          print(count)
          count ++
      }while (count<10)

      val number=10

      when(number){
          0-> println("zero")
          10-> println("ten")
          else-> print("something else")
      }

      when(number){
          in 0..10-> println("lower than 10")
          in 11..20-> println("between 11 and 20")
          else-> println("something else")
      }



    var nullableName: String? = null
    var lenght = nullableName?.length ?:-1 // Se pude igualar a cualquier tipo - El -1 nos permitira comprobar si no ocurre la accion
    println("name: $nullableName")
    println("lenght: $lenght")

    nullableName = "Marco"

    println(nullableName)
    println(lenght)

    //PAIR & TRIPLETS

    val coordinates=Pair(1.3,1.5)
    println(coordinates)
    val(x,y)=Pair(4,5)
    println("x: $x,y:$y")
    val coordinate3D=Triple(3,4,5)
    val(x2,y2,_)=coordinate3D



    //FUNCTIONS

    fun printMyName(){  //Funcion que retorna VOID
        println("My name is MArco")
    }

    printMyName()

    fun otherPrint():Unit{ //Funcion que retorna VOID
        println("Other print")

    }
    otherPrint()

    fun multiply(n1:Int,n2:Int):Int{
        return n1*n2
    }

    println("Resultado: ${multiply(2,2)} " )


     */

    //ARRAYS - LIST- MAPS

    /*

    Arrays
    Acceder by index -> O(1)
    Insert/delete    -> O(n)

    Insert/delete    -> O(1)
    Insert/delete    -> O(1)???

    Maps
    Acceder by index -> O(n)
    Insert/delete    -> O(1)
     */

    val evenNumbers= arrayOf(2,4,6,8,10)
    val oldNumbers: Array<Int> = arrayOf(1,3,5,7)
    val intArray= intArrayOf(1,2,3,4,5,6,7)
    val players= arrayOf("Alice","Bob","Marco","Carlos")

    //Los arreglos son un conjunto de datos ordenados por el indice
    // Los arreglos son inmutables
    // evenNumbers[5]=12 ->Index Out of Bounds

    for (i in evenNumbers){
        println(i)
    }
    println()
    println(evenNumbers[1])
    // .size longitud del arreglo
    evenNumbers.contains(10)

    val myInts = listOf(1,2,3,4,5,6)
    println(myInts[5])

    val mutableList= mutableListOf(1,2,3,4,5,6)

    for (i in mutableList){
        println(i)
    }
    println()

    val namesAndScores= mutableMapOf("marco" to 12,"marcorp" to 10,"dana" to 11,"pat" to 9)
    println(namesAndScores["marco"])
    namesAndScores["diana"]=45

    for ((player,score) in namesAndScores){
        println("$player - $score")
    }
    println()


    //Lambdas
    // si solo vamos a utilizar en una sola parte
    // funcion lambda no tiene nombre
    //filter, map, reduce, sort

    var ints= listOf(4,5,2,3)

    println(ints.filter { it >10 }) //cada elemento se compara y si cumple lo imprime

    //map realizar una fucnion con cada valor

    println(ints.map { it * it })

    val result= ints.map { a -> Int
        a * a
    }
    println(result)

    println(ints.reduce({acc,i -> acc+i }))
    println(ints.fold(10){acc,i -> acc+i })

}

