package com.schmauder.service

import com.schmauder.data.Hotel
import com.schmauder.data.HotelRepository
import org.springframework.stereotype.Service

@Service
class HotelService(val hotelRepository: HotelRepository) {
    fun save(hotel: Hotel) : Hotel = hotelRepository.save(hotel)
}