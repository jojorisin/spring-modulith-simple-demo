package se.jensen.johanna.modularmonolithdemo.booking.api;

// public för andra moduler ska kommunicera med denna klass
public interface BookingService {

  // Alla metoder omvärlden ska ha tillgång till ska vara i interfacet
  // gäller både modulerna och rest api
  void createBooking(int serviceId);

  void confirmPaidBooking(int bookingId);

}
