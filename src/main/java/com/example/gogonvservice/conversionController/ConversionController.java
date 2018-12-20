package com.example.gogonvservice.conversionController;

import com.example.gogonvservice.converionService.ConverionService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
public class ConversionController   {

    @Autowired
    private ConverionService converionService;
    List<String> files = new ArrayList<String>();



    @CrossOrigin("http://localhost:4200")
    @GetMapping("/home")
    private String getHome() {

        return "Hi from from go conv Service";
    }



    @Async
    @JsonFormat
    @CrossOrigin("http://localhost:4200")
    @PostMapping("/upload")
    public CompletableFuture<Map<String, String>> startConversion(@RequestParam MultipartFile file) throws InterruptedException, ExecutionException, MailjetSocketTimeoutException, MailjetException {
         Map<String, String> value =converionService.store(file);
         return CompletableFuture.completedFuture(value);
    }

    @PostMapping("/up")
    public void  newConversion(@RequestParam MultipartFile file) throws ExecutionException, InterruptedException {
     converionService.store2(file);

    }

}
