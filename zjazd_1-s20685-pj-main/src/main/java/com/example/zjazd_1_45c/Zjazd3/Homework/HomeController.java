package com.example.zjazd_1_45c.Zjazd3.Homework;

import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeController {


    @GetMapping()
    public ResponseEntity<String> HomeRP(@RequestParam String Varible){
        return ResponseEntity.ok(Varible);
    }
    @GetMapping("{Varible}")
    public ResponseEntity<String> HomePV(@PathVariable String Varible){
        return ResponseEntity.ok(Varible);
    }
    @PutMapping()
    public ResponseEntity<String> HomePURP(@RequestParam String Varible){
        return ResponseEntity.ok(Varible);
    }
    @PutMapping("{Varible}")
    public ResponseEntity<String> HomePUPV(@PathVariable String Varible){
        return ResponseEntity.ok(Varible);
    }
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> HomePORB(@RequestBody String Varible){
        return ResponseEntity.ok(Varible);
    }
    @DeleteMapping
    public ResponseEntity<String> HomeDM(){
        return ResponseEntity.ok("");
    }
}
