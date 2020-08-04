package numero_extenso;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class NumeroPorExtenso {
    public static void main(String[] args) {
        NumericToWordsConverter converter = new NumericToWordsConverter(new InteiroSemFormato());
        double valor = 75.0;
        String valorPorExtenso = converter.toWords(valor);
        System.out.println(valorPorExtenso);

        BigDecimal valor_bg = new BigDecimal("175.00");
        String valorPorExtenso_bg = converter.toWords(valor_bg.doubleValue());
        System.out.println(valorPorExtenso_bg);

        NumericToWordsConverter converter_reais = new NumericToWordsConverter(new FormatoDeReal());
        String valor_real = converter_reais.toWords(valor);
        System.out.println(valor_real);
    }
}
