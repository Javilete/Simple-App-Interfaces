package core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.defaults.DefaultEmail;

import java.util.Date;

@JsonDeserialize(as = DefaultEmail.class)
public interface Email {

    @JsonProperty(value = "date", required = true)
    public Date getDate();

    public void setDate(Date date);

    @JsonProperty(value = "from", required = true)
    public Date getFrom();

    public void setFrom(String from);

    @JsonProperty(value = "to", required = true)
    public Date getTo();

    public void setTo(String to);

    @JsonProperty(value = "subject", required = true)
    public Date getSubject();

    public void setSubject(String subject);

    @JsonProperty(value = "content", required = true)
    public Date getContent();

    public void setContent(String content);
}
