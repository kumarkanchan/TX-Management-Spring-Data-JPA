package com.transaction.controller;

import com.transaction.dto.AppointmentFormDto;
import com.transaction.repo.AppointmentRepo;
import com.transaction.service.BookAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAppointmentController {

    @Autowired
    private BookAppointmentService bookAppointmentService;

    @PostMapping("/book")
    public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto){
        return bookAppointmentService.bookAppointment(appointmentFormDto);
    }
}
