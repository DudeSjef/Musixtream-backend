package nl.fontys.musixtream.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController
{
    @GetMapping
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }
}
