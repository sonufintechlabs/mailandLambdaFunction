package model;

import mail.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailCmd implements Email {
    String recipient;
    String subject;
    String htmlBody;
    String textBody;
    String replyTo;
    List<String> cc = new ArrayList<String>();
    List<String> bcc = new ArrayList<String>();


    public String getRecipient() {
        return recipient;
    }

    public List<String> getCc() {
        return cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public String getSubject() {
        return subject;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public String getTextBody() {
        return textBody;
    }

    public String getReplyTo() {
        return replyTo;
    }
}
