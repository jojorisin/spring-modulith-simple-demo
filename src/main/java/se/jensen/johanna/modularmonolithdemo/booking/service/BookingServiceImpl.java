package se.jensen.johanna.modularmonolithdemo.booking.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import se.jensen.johanna.modularmonolithdemo.booking.api.BookingService;
import se.jensen.johanna.modularmonolithdemo.booking.helper.HelperClass;
import se.jensen.johanna.modularmonolithdemo.catalog.api.CatalogService;

@Slf4j
@RequiredArgsConstructor
@Service
// Notera 'public' är borta. Det gör det package-private vilket vi VILL i modulär monolit
class BookingServiceImpl implements BookingService {

  private final HelperClass helper;

  //injectar interface jag behöver kommunicera med
  private final CatalogService catalogService;

  @Override
  public void createBooking(int serviceId) {
    // tänk du fick id med vilken tjänst de vill boka från frontend
    //så anropar du catalog för att verifiera att den tjänsten finns ex
    String service = fetchFromCatalog(serviceId);
    String help = getHelpFromHelper();
  }

  @Override
  public void confirmPaidBooking(int bookingId) {
    // hantera eventet som inkommit
  }

  private void getPrivateDto() {
    PackagePrivateDTO dto = new PackagePrivateDTO(1);
  }

  private String getHelpFromHelper() {
    return helper.getHelp();
  }

  private String fetchFromCatalog(int serviceId) {
    return catalogService.getCatalog(serviceId);
  }
}
