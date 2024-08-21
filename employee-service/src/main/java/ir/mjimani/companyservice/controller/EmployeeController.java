package ir.mjimani.companyservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/employee/")
public class EmployeeController {

    @GetMapping("/retrieve")
    public ResponseEntity<String> retrieve(){
        System.out.println("Hello From Employee Service");
        return ResponseEntity.ok("Hello From Employee Service");
    }
}
