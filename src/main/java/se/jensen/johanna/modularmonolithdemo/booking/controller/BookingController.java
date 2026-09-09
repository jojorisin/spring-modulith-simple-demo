package se.jensen.johanna.modularmonolithdemo.booking.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import se.jensen.johanna.modularmonolithdemo.booking.api.BookingService;

@RequiredArgsConstructor
@RestController
public class BookingController {

  private final BookingService bookingService;

  // även här anropar interface
  @PostMapping("/booking/{serviceId}")
  public void createBooking(@PathVariable int serviceId) {
    bookingService.createBooking(serviceId);
  }
}
