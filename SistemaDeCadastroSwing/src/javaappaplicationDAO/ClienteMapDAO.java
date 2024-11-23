/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappaplicationDAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import  javaappaplicationDomain.Cliente;

public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
         return true;

    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);

        if(clienteCadastrado != null){
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
       Cliente clienteCadastrado = this.map.get(cliente.getCpf());

       if(clienteCadastrado != null){
           clienteCadastrado.setNome(cliente.getNome());
           clienteCadastrado.setCidade(cliente.getCidade());
           clienteCadastrado.setCpf(cliente.getCpf());
           clienteCadastrado.setEnd(cliente.getEnd());
           clienteCadastrado.setNumero(cliente.getNumero());
           clienteCadastrado.setEstado(cliente.getEstado());
           clienteCadastrado.setTel(cliente.getTel());

       }

    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);

    }}

   