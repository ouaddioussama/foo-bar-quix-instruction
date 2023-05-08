package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class FooBarQuixApplicationTests {


	val fooBarQuixService=FooBarQuixService()


	@Test
	fun testFooBarQuixDivision(){
		assertEquals("Foo",fooBarQuixService.fooBarQuixDivision(3))
		assertEquals("Bar",fooBarQuixService.fooBarQuixDivision(5))
		assertEquals("",fooBarQuixService.fooBarQuixDivision(7))
		assertEquals("Foo",fooBarQuixService.fooBarQuixDivision(9))
		assertEquals("FooBar",fooBarQuixService.fooBarQuixDivision(15))
		assertEquals("Foo",fooBarQuixService.fooBarQuixDivision(33))
		assertEquals("Foo",fooBarQuixService.fooBarQuixDivision(27))

	}

	@Test
	fun testFooBarQuixContains(){
		assertEquals("Foo",fooBarQuixService.fooBarQuixContains(3))
		assertEquals("Bar",fooBarQuixService.fooBarQuixContains(5))
		assertEquals("Quix",fooBarQuixService.fooBarQuixContains(7))
		assertEquals("",fooBarQuixService.fooBarQuixContains(9))

	}

	@Test
	fun testConvertNumber(){
		assertEquals("1",fooBarQuixService.convertNumber(1))
		assertEquals("FooFoo",fooBarQuixService.convertNumber(3))
		assertEquals("BarBar",fooBarQuixService.convertNumber(5))
		assertEquals("Quix",fooBarQuixService.convertNumber(7))
		assertEquals("Foo",fooBarQuixService.convertNumber(9))
		assertEquals("FooBarBar",fooBarQuixService.convertNumber(15))
		assertEquals("Foo",fooBarQuixService.convertNumber(21))
		assertEquals("FooQuix",fooBarQuixService.convertNumber(27))
		assertEquals("FooFooFoo",fooBarQuixService.convertNumber(33))
		assertEquals("BarFoo",fooBarQuixService.convertNumber(53))

	}

}
