package bookingservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingServiceController {

    @GetMapping(path = "/bookTicket")
    public String bookTicket(@RequestParam String seatNum){
        return "Sucessfully booked "+seatNum;
    }

}
