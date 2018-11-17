package com.example.gogonvservice.conversion;

import com.qoppa.office.OfficeException;
import com.qoppa.office.WordConvertOptions;
import com.qoppa.office.WordDocument;
import com.qoppa.pdf.PDFException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import java.io.IOException;


public class ConController {

    @Autowired
    private TaskExecutor taskExecutor;

    public void index() {

        WordConvertOptions opts = new WordConvertOptions();
        WordDocument wdoc = null;

        try {
            wdoc = new WordDocument("/home/tarfa/Document1.doc",opts);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (OfficeException e) {
            e.printStackTrace();
        }

        try {

            wdoc.saveAsPDF("/home/tarfa/out.pdf");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (PDFException e) {
            e.printStackTrace();
        }

    }
}
