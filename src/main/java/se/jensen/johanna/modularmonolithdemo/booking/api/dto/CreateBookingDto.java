package se.jensen.johanna.modularmonolithdemo.booking.api.dto;

// DTO är publika. Om en annan modul ska anropa bookings interface
// och booking tar emot en DTO så måste de ju givetvis använda samma.
// HOWEVER - ALL DATA UT TILL KLIENTEN ska mappas om till en EGEN dto av den modulen som ska skicka ut datan
// Varför? För att MINSKA beroende och säkra utdatan.
// Samma data visas på olika sätt för olika klienter och för olika syften
public record CreateBookingDto(
    String whoThisBookingIsFor,
    int serviceId
) {

}
