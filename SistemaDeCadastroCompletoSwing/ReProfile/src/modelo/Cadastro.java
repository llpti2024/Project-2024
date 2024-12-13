/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lucas
 */
public class Cadastro
{

    private String apelido;
    private String email;
    private String nome;
    private Long telefone;
    private String datadenascimento;
    private Long id;
    private String cidade;
    private String endereco;
    private Integer numero;
    private String bairro;
    private Long cep;
    private String estado;
    private Long ddd;

    public Cadastro(String id, String apelido, String nome, String datadenascimento, String endereco, String numero, String estado, String cidade, String bairro, String cep, String ddd, String telefone, String email)
    {
        this.id = Long.valueOf(id.trim());
        this.apelido = apelido;
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.endereco = endereco;
        this.numero = Integer.valueOf(numero.trim());
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = Long.valueOf(cep.trim());
        this.telefone = Long.valueOf(telefone.trim());
        this.email = email;
        this.ddd = Long.valueOf(ddd.trim());

    }

    public String getApelido()
    {
        return apelido;
    }

    public void setApelido(String apelido)
    {
        this.apelido = apelido;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Long getDdd()
    {
        return ddd;
    }

    public void setDdd(Long ddd)
    {
        this.ddd = ddd;
    }

    public Long getTelefone()
    {
        return telefone;
    }

    public void setTelefone(Long telefone)
    {
        this.telefone = telefone;
    }

    public String getDatadenascimento()
    {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento)
    {
        this.datadenascimento = datadenascimento;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public Integer getNumero()
    {
        return numero;
    }

    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }

    public String getBairro()
    {
        return bairro;
    }

    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    public Long getCep()
    {
        return cep;
    }

    public void setCep(Long cep)
    {
        this.cep = cep;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    @Override
public String toString() {
    return id + ";" + apelido + ";" + nome + ";" + datadenascimento + ";" +
           endereco + ";" + numero + ";" + estado + ";" + cidade + ";" + bairro + ";" +
           cep + ";" + ddd + ";" + telefone + ";" + email;
}

public static Cadastro fromString(String linha) {
    String[] dados = linha.split(";");
    return new Cadastro(
        dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], 
        dados[6], dados[7], dados[8], dados[9], dados[10], dados[11],dados[12]
    );
}

}
