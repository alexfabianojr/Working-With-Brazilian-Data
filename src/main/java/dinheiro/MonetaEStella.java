package dinheiro;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

public class MonetaEStella {
    public static void main(String[] args) {
        CurrencyUnit moeda = Monetary.getCurrency("BRL");
        MonetaryAmount parcela = Money.of(75, moeda);
        MonetaryAmount valorTotal = parcela.multiply(12);
        MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));

        NumberValue descontoSemMoeda = desconto.getNumber();

        NumericToWordsConverter converter = new NumericToWordsConverter(new FormatoDeReal());
        String valorPorExenso = converter.toWords(descontoSemMoeda.doubleValue());


        System.out.println(parcela);
        System.out.println(valorTotal);
        System.out.println(desconto);
        System.out.println(valorPorExenso);
    }
}
