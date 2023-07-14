package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String complemento;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String numero;
    private String cep;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.complemento = endereco.complemento();
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cidade = endereco.cidade();
        this.numero = endereco.numero();
        this.cep = endereco.cep();
        this.uf = endereco.uf();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if (dados.numero() != null){
            this.numero = dados.numero();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
        if (dados.uf() != null){
            this.uf = dados.uf();
        }
    }
}
