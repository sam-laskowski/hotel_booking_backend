package com.sam.SamHotel.service.interfac;

import com.sam.SamHotel.dto.Response;
import com.sam.SamHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
