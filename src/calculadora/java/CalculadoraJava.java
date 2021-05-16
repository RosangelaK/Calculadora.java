package calculadora.java;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosangela
 */
public class CalculadoraJava {

    public static void main(String[] args) {

        List<Anuncio> listaAnuncios = new ArrayList<>();

        boolean continua = true;
        while (continua) {

            Anuncio a = new Anuncio();
            a.setNomeAnuncio(JOptionPane.showInputDialog("Informe o nome do anúncio:"));
            a.setCliente(JOptionPane.showInputDialog("Informe o nome do Cliente:"));
            a.setQuantidadeDias(Double.parseDouble(JOptionPane.showInputDialog("Informe quantos dias deseja investir:")));
            a.setDataInicio(Date.valueOf(JOptionPane.showInputDialog("Informe a data de início: (AAAA-MM-DD)")));
            a.setDataTermino(Date.valueOf(JOptionPane.showInputDialog("Informe a data de término: (AAAA-MM-DD)")));
            a.setInvestPorDia(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor investido por dia:")));

            listaAnuncios.add(a);
            continua = JOptionPane.showInputDialog("Deseja cadastrar mais anúncios? s = sim").toLowerCase().equals("s");
        }
        System.out.println("-----------Anúncios cadastrados-----------");

        for (Anuncio a : listaAnuncios) {
            a.ListarAnuncios();

        }
    }
}
