package com.schmauder

import com.schmauder.data.Hotel
import com.schmauder.data.HotelRepository
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.contains
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest


import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class KotlinSpringExampleApplicationTests {

	@Autowired
	private lateinit var mockMvc: MockMvc

	@Autowired
	private lateinit var hotelRepository : HotelRepository

	@Test
	fun saveAHotelToTheDatabase() {
		mockMvc.perform(post("/hotel").content("""
			{
				"key":"123",
				"name":"Hotel name"
			}
		""").contentType("application/json")).andExpect(status().isOk)

		assertThat(hotelRepository.findAll(), contains(Hotel("123","Hotel name")))
	}
}
