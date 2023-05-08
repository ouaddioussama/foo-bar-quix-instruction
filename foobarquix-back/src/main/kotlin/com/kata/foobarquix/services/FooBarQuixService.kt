package com.kata.foobarquix.services

import com.kata.foobarquix.util.EnumFooBarQix
import com.kata.foobarquix.util.Util
import org.springframework.stereotype.Component
import java.lang.StringBuilder

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        val resultFooBarQuix=fooBarQuixDivision(inputNumber)+fooBarQuixContains(inputNumber)
        return if(resultFooBarQuix.isNotEmpty()) resultFooBarQuix else inputNumber.toString()

    }

    fun fooBarQuixDivision(inputNumber: Int):String {
        val result = StringBuilder()
        EnumFooBarQix.values().filter { Util.isDevidedBy(inputNumber, it.inputNumber) && !it.equals(EnumFooBarQix.Quix) }.forEach { result.append(it.name) }
        return result.toString()
    }

    fun fooBarQuixContains(inputNumber: Int):String {
        val result = StringBuilder()
        inputNumber.toString().toCharArray().forEach { result.append(Util.mapNumber(it.toString())) }
        return result.toString()
    }



}



