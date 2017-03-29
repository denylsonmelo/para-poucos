package br.edu.ifpi.capar.para.poucos.login;

import org.jboss.security.Base64Encoder;

/**
 *
 * @author Denylson Melo
 */
public class GeradorDeSenha {
    public static void main(String[] args) throws Exception {
        Base64Encoder.main(new String[]{"123456","SHA-256"});
    }
}
