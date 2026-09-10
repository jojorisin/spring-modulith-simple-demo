package se.jensen.johanna.modularmonolithdemo.booking.service;

// inte public - bara de i samma paket kan använda den, i detta fallet
// bookingserviceimpl har bara tillgång
record PackagePrivateDTO(
    int bookingId
) {

}
