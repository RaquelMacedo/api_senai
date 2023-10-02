package com.api_senai.api.entitiles;

//import lombok.Data;
//import org.apache.http.client.methods.Http.Get;



@Data
public class Endereco {
    private String cep;
    private String numero;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco getEnderecoByCep(String cep){
        Endereco endereco = new Endereco();

        HttpGet request = HttpGet("https://viacep.com.br/ws/"+ cep+"/json/");


        return endereco;
    }
}
