package com.example.zjazd_1_45c.Zjazd3;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class Zad1 {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }
    @GetMapping("/{someValue}")
    public ResponseEntity<String> getSomeValue(@PathVariable String someValue){
            return ResponseEntity.ok(someValue);
    }
    @GetMapping("")
    public ResponseEntity<String> getreqSomeValue(@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }
    @PostMapping("/zad5")
    public ResponseEntity<Car> endPoint(@RequestBody Car endPoint){
        return ResponseEntity.ok(endPoint);
    }

    @GetMapping("/model")
    public ResponseEntity<Car> car() {
        Car car = new Car();
        return ResponseEntity.ok(car);
    }
}



