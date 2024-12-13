/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.ICadastroDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import modelo.Cadastro;

/**
 *
 * @author Lucas
 */
public class CadastroMapDAO implements ICadastroDAO
{

    private Map<Long, Cadastro> map;

    public CadastroMapDAO()
    {
        this.map = new HashMap<>();
    }
    
     @Override

    public List<Cadastro> getTodos()
    {
        return new ArrayList<>(map.values());
    }
    
    @Override
    public Boolean cadastrar(Cadastro cadastro)
    {
        if (this.map.containsKey(cadastro.getId()))
        {
            return false;
        }
        this.map.put(cadastro.getId(), cadastro);
        return true;
      
    }
    

    @Override
    public boolean existeCadastroDuplicado(String nome, String dataDeNascimento)
    {
        for (Cadastro c : map.values())
        {
            if (c.getNome().equalsIgnoreCase(nome) && c.getDatadenascimento().equals(dataDeNascimento))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void excluir(Long id)
    {
        map.remove(id);

    }

    @Override
    public void alterar(Cadastro cadastro)
    {
        map.put(cadastro.getId(), cadastro);

    }

    @Override
    public Cadastro buscarPorIdOuNome(String consulta)
    {
        try
        {
            Long id = Long.valueOf(consulta);
            return map.get(id);
        } catch (NumberFormatException e)
        {
            return map.values().stream()
                    .filter(c -> c.getNome().equalsIgnoreCase(consulta))
                    .findFirst()
                    .orElse(null);
        }
    }
    
    @Override
    public List<Cadastro> buscarPorNome(String nome)
    {
        return map.values().stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());

    }

    @Override
    public Cadastro consultar(Long id)
    {
        return this.map.get(id);
    }
    
    
    @Override
    public Long getProximoId()
    {
        if (map.isEmpty())
        {
            return 1L; 
        }
        return Collections.max(map.keySet()) + 1; 
    }

}
