package dinheiro;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.convert.ExchangeRateType;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

public class ConversaoDeMoedas {
    public static void main(String[] args) {
        //Primeiro vamos criar as moedas e os valores
        CurrencyUnit dolar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");
        MonetaryAmount valorProdutoDolar = FastMoney.of(90, dolar);
        MonetaryAmount valorImpostoReal = FastMoney.of(30, real);

        //Agora vamos usar o provider para pegar a cotação
        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);

        //Vamos pegar a conversão atual(do dia)
        CurrencyConversion conversaoAtual = provider.getCurrencyConversion(dolar);

        //Agora vamos transformar o valor do imposto em Real para dólar
        MonetaryAmount valorImpostoDolar = conversaoAtual.apply(valorImpostoReal);

        //Agora que o valor do imposto está em dólar, podemos somar com o valor inicial do produto
        MonetaryAmount valorFinalProdutoDolar = valorProdutoDolar.add(valorImpostoDolar);
        System.out.println(dolar);
        System.out.println(real);
        System.out.println(valorProdutoDolar);
        System.out.println(valorImpostoReal);
        System.out.println(provider);
        System.out.println(conversaoAtual);
        System.out.println(valorImpostoDolar);
        System.out.println(valorFinalProdutoDolar);

    }
}
