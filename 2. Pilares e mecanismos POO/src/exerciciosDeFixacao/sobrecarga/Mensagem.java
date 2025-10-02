package exerciciosDeFixacao.sobrecarga;

import java.util.List;

public class Mensagem {

    public void enviar(String texto) {
        System.out.println("Foi enviado o texto: " + texto);
    }

    public void enviar(String texto, String destimatario) {
        System.out.println("Foi enviado o texto: " + texto + ", para o destinatário: " + destimatario);
    }

    public void enviar(String texto, List<String> destinatarios) {
        System.out.println("Foi enviado o texto: " + texto + ".");
        System.out.println("Para os seguinte destinatários:");
        for (String destinatario : destinatarios) {
            System.out.println(destinatario);
        }
    }
}
