package se.jensen.johanna.modularmonolithdemo.booking.helper;

import org.springframework.stereotype.Component;

@Component
//public så bookingservice kan nå den.
//men notera- paketet har ingen package-info.java
// eftersom inga indra moduler ska använda denna!
public class HelperClass {

  public String getHelp() {
    return "Varsågod!";

  }

}
