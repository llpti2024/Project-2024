/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import modelo.Cadastro;

/**
 *
 * @author Lucas
 */
public interface ICadastroDAO
{
   public Boolean cadastrar(Cadastro cadastro);
    public void excluir(Long id);
    public void alterar(Cadastro cadastro);
    public Cadastro consultar(Long id);
    
    //Filtro de condicao para cadastro
    public boolean existeCadastroDuplicado(String nome, String dataDeNascimento);
    
    //Gerador automatico de número de ID
    public Long getProximoId();
    
    //Filtro de nome para excluir ou alterar
    public List<Cadastro> buscarPorNome(String nome);
    
    public Cadastro buscarPorIdOuNome(String consulta);
    
    //Pega todas informações da váriaveis de Cadastro
    public List<Cadastro> getTodos();
    
    
    
    
    
    
}
