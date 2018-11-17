package com.example.gogonvservice.conversion;

import com.qoppa.office.OfficeException;
import com.qoppa.office.WordConvertOptions;
import com.qoppa.office.WordDocument;
import com.qoppa.pdf.PDFException;

import java.io.IOException;


public class ConvService  {

    public static void conversion(String pathFile,String toType) {

        WordConvertOptions opts = new WordConvertOptions();
        Thread thread=new Thread(() -> {
            try {

                WordDocument  wdoc = new WordDocument(pathFile,opts);
                wdoc.saveAsPDF("/home/tarfa/out."+toType);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (PDFException e) {
                e.printStackTrace();
            } catch (OfficeException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }


}
