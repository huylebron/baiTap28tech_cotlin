package com.example.a28tech.bai16



    fun  main (){

        val xc = readLine()!!.first()

        if ( xc == 'Z' || xc == 'z'){

            println('a')
        }
        else  if ( xc in 'a' until 'z'){
            println(xc + 1)
        }
        else {
            println(xc + 33)
        }



    }

