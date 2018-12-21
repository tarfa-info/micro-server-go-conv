package com.example.gogonvservice.converionService;

import com.example.gogonvservice.conversion.ConvService;
import com.example.gogonvservice.email.service.EmailService;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;



@Service
public class ConverionService  {


    private final Path rootLocation = Paths.get("/home/tarfa/upload-dir");
    private final String pathFolderLocator="/home/tarfa/upload-dir";




    public Map<String, String> store(MultipartFile file ) throws InterruptedException, ExecutionException, MailjetSocketTimeoutException, MailjetException {
        Map<String,String> map=new HashMap<>();

        final Future<String>  task;
        try {
            long number = Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
            ConvService convService = new ConvService(pathFolderLocator, this.rootLocation.resolve(file.getOriginalFilename()).toString(),file.getOriginalFilename(),".pdf");
            final ExecutorService service;
            service = Executors.newFixedThreadPool(1);
            task    = service.submit(convService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("FAIL!");
        }

        /**
         * call E-mail Service
         */
        EmailService.sendEmail("ali.tarfa.cs@gmail.com","no");


        map.put("status",task.get());
        map.put("file",loadFile(file.getOriginalFilename()+".pdf"));


        /**
         * Delete the file in this  place
         *
         */

        // get the path of the Dir
        // get the name of the file

        File file1=new File(pathFolderLocator+"/"+file.getOriginalFilename());
        if (file1.exists() ){
            file1.delete();
        }else {
            System.err.println("File No Exist !!! ");
        }

        deleteFile5Min(rootLocation+"/"+file.getOriginalFilename()+".pdf");

        return map ;
    }

    public String loadFile(String filename) {
        try {
            Path file = rootLocation.resolve(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource.getURI().toString();
            } else {
                throw new RuntimeException("FAIL!");
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("FAIL!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public void deleteAll() {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }

    public void init() {
        try {
            Files.createDirectory(rootLocation);
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize storage!");
        }
    }


    public void deleteFile5Min(String filePath) {
        TimerTask timerTask =new TimerTask() {
            @Override
            public void run() {
                File file=new File(filePath);
                file.delete();
                System.out.println("file Deleted");
            }
        };

        Timer timer1=new Timer();
        timer1.schedule(timerTask,new Date(new Date().getTime()+1000*60*5));
    }

}
