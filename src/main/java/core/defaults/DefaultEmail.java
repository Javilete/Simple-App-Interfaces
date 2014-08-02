package core.defaults;

import core.models.Email;

import java.util.Date;

public class DefaultEmail implements Email {
    private Date date;
    private String from;
    private String to;
    private String subject;
    private String content;

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public void setDate(Date date) {

    }

    @Override
    public Date getFrom() {
        return null;
    }

    @Override
    public void setFrom(String from) {

    }

    @Override
    public Date getTo() {
        return null;
    }

    @Override
    public void setTo(String to) {

    }

    @Override
    public Date getSubject() {
        return null;
    }

    @Override
    public void setSubject(String subject) {

    }

    @Override
    public Date getContent() {
        return null;
    }

    @Override
    public void setContent(String content) {

    }
}
