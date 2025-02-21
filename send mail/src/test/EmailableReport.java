package test;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.AfterTest;

public class EmailableReport {

  public static void execute() throws Exception {

	  String file =null;
	  
  final String username = "mizansapon@gmail.com";
  final String password = "*******";
  String emailSentTo="mdsapon@yahoo.com";

   Properties props = new Properties();
  props.put("mail.smtp.starttls.enable", "true");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.port", "587");

   Session session = Session.getInstance(props,
    new javax.mail.Authenticator() {
     protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(username, password);
     }
    });

   try {

    Message message = new MimeMessage(session);
   message.setFrom(new InternetAddress(username));
   message.setRecipients(Message.RecipientType.TO,
     InternetAddress.parse(emailSentTo));
   message.setSubject("Reports Availalbe!");
   message.setText("Dear Mail Crawler,"
     + "\n\n No spam to my email, please!");
   
   

    MimeBodyPart messageBodyPart = new MimeBodyPart();

    Multipart multipart = new MimeMultipart();

    messageBodyPart = new MimeBodyPart();
   
  //String fileName ="emailable-report.html";//reportFileName;
    file =System.getProperty("user.dir")+"\\test-output\\emailable-report.html";
   DataSource source = new FileDataSource(file);
   
     
   
   messageBodyPart.setDataHandler(new DataHandler(source));
  // messageBodyPart.setFileName(fileName);
   multipart.addBodyPart(messageBodyPart);

    message.setContent(multipart);
   System.out.println("Sending");
   
  
   
   Transport.send(message);
   
   System.out.println("Done");
  } catch (MessagingException e) {
   throw new RuntimeException(e);
  }
 }


  /*
public static void main(String args[]) throws Exception{
	SendMailDifferentWay etr=new SendMailDifferentWay();
	etr.execute("emailable-report.html");
}
*/
}
