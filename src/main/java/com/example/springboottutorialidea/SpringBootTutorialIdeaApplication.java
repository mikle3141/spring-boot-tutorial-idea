package com.example.springboottutorialidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringBootTutorialIdeaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialIdeaApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PutMapping(
            value = "/put",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<OutPutDto> put(@RequestBody InPutDto inPutDto) {
        OutPutDto outPutDto = new OutPutDto();
        outPutDto.setFirstName(inPutDto.getFirstName());
        outPutDto.setMiddleName(inPutDto.getMiddleName());
        outPutDto.setLastName(inPutDto.getLastName());
        return new ResponseEntity<>(outPutDto, HttpStatus.OK);
    }

    @PutMapping(
            value = "/putAI",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<OutPutDto> putAI(@RequestBody InPutAIDto inPutDto) {
        OutPutDto outPutDto = new OutPutDto();
        if (inPutDto.hasAttr("firstName")) outPutDto.setFirstName(inPutDto.getFirstName());
        if (inPutDto.hasAttr("middleName")) outPutDto.setMiddleName(inPutDto.getMiddleName());
        if (inPutDto.hasAttr("lastName")) outPutDto.setLastName(inPutDto.getLastName());
        return new ResponseEntity<>(outPutDto, HttpStatus.OK);
    }

}
