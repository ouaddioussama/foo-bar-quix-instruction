package com.kata.foobarquix.util

class Util {

    companion object {

        fun isDevidedBy(inputNumber: Int, divisor: Int): Boolean {
            return inputNumber % divisor == 0
        }

        fun mapNumber( inputNumber :String):String{
            return EnumFooBarQix.values().filter { inputNumber.toInt() == it.inputNumber }.joinToString { it.name }
        }

    }
}