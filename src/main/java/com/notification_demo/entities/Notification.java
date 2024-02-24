package com.notification_demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="notifications_table")
public class Notification {
    @Id
    @Column(name="notification_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "notification_type") // email.sms enum class modify
    private String type;
    @Column(name="notification_content")
    private String content; // content can be body supports attachments can be blob
    // create a new variable can be attachements
    // craete a new table of attachements
    private String senderAdress; // renamed to sender adress // sizes add fieelds
    private String recipient;
    private Date timeStamp; // added to data base // log time
    // create a one more date time stamp5r

}
