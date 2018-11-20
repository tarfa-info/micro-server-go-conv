package com.example.gogonvservice.conversionController;

import com.example.gogonvservice.converionService.ConverionService;
import com.example.gogonvservice.conversion.ConvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class ConversionController {

    @Autowired
    private ConverionService converionService;

    public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";

    @GetMapping("/home")
    private String getHome() {
        return "Hi from from go conv Service ";
    }


    @RequestMapping("/upload")
    private String startConversion(Model model, @RequestParam("file") MultipartFile file) {
        StringBuilder fileNames = new StringBuilder();

            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
            fileNames.append(file.getOriginalFilename()+" ");
            try {
               Path path= Files.write(fileNameAndPath, file.getBytes());
                ConvService.conversion(fileNameAndPath.toString(),"pdf");
            } catch (IOException e) {
                e.printStackTrace();
            }

        return "uploadstatusview";
    }


}
