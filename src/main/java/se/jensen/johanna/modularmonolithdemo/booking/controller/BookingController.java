package se.jensen.johanna.modularmonolithdemo.booking.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import se.jensen.johanna.modularmonolithdemo.booking.api.BookingService;

@RequiredArgsConstructor
@RestController
// Controller är inte public eftersom INGA andra moduler ska kommunicera med den
class BookingController {

  // injicerar interface- ej service impl
  private final BookingService bookingService;

  @PostMapping("/booking/{serviceId}")
  public void createBooking(@PathVariable int serviceId) {
    bookingService.createBooking(serviceId);
  }
}
