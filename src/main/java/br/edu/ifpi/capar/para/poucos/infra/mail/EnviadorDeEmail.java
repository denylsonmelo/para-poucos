package br.edu.ifpi.capar.para.poucos.infra.mail;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Denylson Melo
 */
@ApplicationScoped
public class EnviadorDeEmail {

    @Resource(mappedName = "java:/jboss/mail/gmail")
    private Session session;

    public void envia(String origem, String destino, String assunto, String corpoEmail) {
        Message mensagem = new MimeMessage(session);

        try {
            mensagem.setRecipient(Message.RecipientType.TO, new InternetAddress(destino));
            mensagem.setFrom(new InternetAddress(origem));
            mensagem.setSubject(assunto);
            mensagem.setContent(corpoEmail, "text/html");

            Transport.send(mensagem);

        } catch (AddressException ex) {
            Logger.getLogger(EnviadorDeEmail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(EnviadorDeEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
