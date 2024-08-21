package ir.mjimani.companyservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/company/")
public class CompanyController {

    @GetMapping("/retrieve")
    public ResponseEntity<String> retrieve(){
        System.out.println("Hello From Company Service");
        return ResponseEntity.ok("Hello From Company Service");
    }
}
