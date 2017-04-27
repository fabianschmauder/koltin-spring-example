package com.schmauder.controller

import com.schmauder.data.Hotel
import com.schmauder.service.HotelService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hotel")
class HotelController(val hotelService: HotelService) {

    @RequestMapping(method = arrayOf(RequestMethod.POST))
    fun saveHotel(@RequestBody hotel:Hotel) = hotelService.save(hotel)

}