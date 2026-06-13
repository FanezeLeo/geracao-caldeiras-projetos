package br.com.caldeiras.desafio.viacep.modelos;

public record Endereco(
        String cep,
        String logradouro,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        String ibge,
        String ddd,
        String siafi
) {
}
