package documents;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class ValidacaoDocumento {
    public static void main(String[] args) {
        String cpf = "";
        CPFValidator cpfValidator = new CPFValidator();

        String cnpj = "82588641000173";
        CNPJValidator cnpjValidator = new CNPJValidator();

        String tituloEleitor = "417453530116";
        TituloEleitoralValidator tituloEleitoralValidator = new TituloEleitoralValidator();

        cpf = "86288366757";
        try {
            cpfValidator.assertValid(cpf);
            System.out.println("CPF Valido!");
        } catch (InvalidStateException e) {
            System.out.println("CPF Invalido!");
        }

        cpf = "98745366797";
        try {
            cpfValidator.assertValid(cpf);
            System.out.println("CPF Valido!");
        } catch (InvalidStateException e) {
            System.out.println("CPF Invalido!");
        }

        try {
            cnpjValidator.assertValid(cnpj);
            System.out.println("CNPJ Valido!");
        } catch (InvalidStateException e) {
            System.out.println("CNPJ Invalido!");
        }

        try {
            tituloEleitoralValidator.assertValid(tituloEleitor);
            System.out.println("Titulo Valido!");
        } catch (InvalidStateException e) {
            System.out.println("Titulo Invalido!");
        }
    }
}
