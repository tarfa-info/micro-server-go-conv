package com.example.gogonvservice.email.service;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Email;
import org.json.JSONArray;
import org.json.JSONObject;

public class EmailService {


    public static void sendEmail(String receiver, String link ) throws MailjetSocketTimeoutException, MailjetException {

        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient(System.getenv(" 422a2fe30ab608dad89be945e3b277dc "), System.getenv("d95fe6ca696ed6525db3c0ac32e388f4"));
        request = new MailjetRequest(Email.resource)
                .property(Email.FROMEMAIL, "ali.tarfa@univ-constantine2.dz")
                .property(Email.FROMNAME, "Go-conv Cloud Service")
                .property(Email.SUBJECT, "File treatment completed successfully")
                .property(Email.TEXTPART, "Hello Sir you file are ready to download use the Link below , Pay attention Sir the after 5 min the link will be not available  "+ link)
                .property(Email.HTMLPART, "<h3>go gonv</h3>")
                .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                                .put("Email", receiver)));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
