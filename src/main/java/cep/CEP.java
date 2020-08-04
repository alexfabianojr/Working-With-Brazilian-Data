package cep;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;

public class CEP {
    public static void main(String[] args) {
        ViaCEPClient client = new ViaCEPClient();
        try {
            ViaCEPEndereco endereco = client.getEndereco("91230210");
            System.out.println(endereco.getBairro());
            System.out.println(endereco.getCep());
            System.out.println(endereco.getUf());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            URL url = new URL("https://viacep.com.br/ws/01001000/json/");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            connection.getInputStream();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
