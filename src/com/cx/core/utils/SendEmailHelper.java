package com.cx.core.utils;

import com.cx.core.mail.MailMessage;
import com.cx.core.mail.SendMail;
import com.cx.core.mail.SendMailImp;

import java.io.IOException;

/**
 * Created by cxspace on 16-11-19.
 */
public class SendEmailHelper {

    public static void send(String toEmail , String subject , String content){

        MailMessage message = new MailMessage();
        message.setFrom("13037239781@163.com");
        message.setTo(toEmail);
        message.setSubject("our_sys忘记密码验证");
        message.setUser("13037239781@163.com");
        message.setContent(content);
        message.setDatafrom("13037239781@163.com");
        message.setDatato(toEmail);
        message.setPassword("33269456cx");
        SendMail send = SendMailImp.getInstance(SendMailImp.WANGYI163).setMessage(message);
        try {
            send.sendMail();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
