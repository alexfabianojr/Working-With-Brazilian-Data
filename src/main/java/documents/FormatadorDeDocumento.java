package documents;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDeDocumento {
    public static void main(String[] args) {
        String cpf = "737.631.510-10";
        String cnpj = "25.057.229/0001-93";
        String tituloEleitor = "224176370140";

        CPFFormatter cpfFormatter = new CPFFormatter();
        CNPJFormatter cnpjFormatter = new CNPJFormatter();
        TituloEleitoralFormatter tituloEleitoralFormatter = new TituloEleitoralFormatter();

        String cpfSemFormatacao = cpfFormatter.unformat(cpf);
        String cnpjSemFormatacao = cnpjFormatter.unformat(cnpj);
        String tituloFormatado = tituloEleitoralFormatter.format(tituloEleitor);

        System.out.println(cpfFormatter.canBeFormatted(cpf));
        System.out.println(cpfFormatter.isFormatted(cpf));

        System.out.println(cpfSemFormatacao);
        System.out.println(cpfFormatter.format(cpfSemFormatacao));
        System.out.println(cnpjSemFormatacao);
        System.out.println(tituloFormatado);

    }
}
