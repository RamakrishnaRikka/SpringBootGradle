import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EmailService
{
	 public static void main(String[] args) {  
		  
		  String host="mail.javatpoint.com";  
		  final String user="bijaya.kishor@gmail.com";//change accordingly  
		  final String password="123jaishreeram321";//change accordingly  
		    
		  String to="kishor.bijaya@gmail.com";//change accordingly  
		  
		   //Get the session object  
		   Properties props = new Properties();  
		   
		   props.put("mail.smtp.host",host);  
		   props.put("mail.smtp.auth", "true");  
		     
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject("javatpoint");  
		     message.setText("This is simple program of sending email using JavaMail API");  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully...");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}  
		 }  
}
