package se.jensen.johanna.modularmonolithdemo.booking.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;
import se.jensen.johanna.modularmonolithdemo.booking.api.BookingService;
import se.jensen.johanna.modularmonolithdemo.payment.api.event.BookingPaidEvent;

@Component
@RequiredArgsConstructor
class BookingEventListener {

  private final BookingService bookingService;


  @ApplicationModuleListener
    // parametertypen (BookingPaidEvent) talar om vad det är den lyssnar på
  void onConfirmedPayment(BookingPaidEvent event) {
    // här är de bra att plocka ut det vi behöver eller mappa om
    // vi vil inte att en dto/ event från en annan modul
    // ska läcka för mycket in i en annan modul - separation
    bookingService.confirmPaidBooking(event.bookingId());

  }


}
