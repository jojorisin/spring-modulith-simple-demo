package se.jensen.johanna.modularmonolithdemo.payment.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import se.jensen.johanna.modularmonolithdemo.payment.api.PaymentService;
import se.jensen.johanna.modularmonolithdemo.payment.api.event.BookingPaidEvent;

@Service
@RequiredArgsConstructor
class PaymentServiceImpl implements PaymentService {

  private final ApplicationEventPublisher publisher;

  @Override
  public void pay(int bookingId) {
    // betalar för bokning
    // publicerar event som den som vill kan lyssna på
    publisher.publishEvent(new BookingPaidEvent(bookingId));

  }


}
