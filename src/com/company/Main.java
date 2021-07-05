package com.company;
import dao.ContatoDAO;
import models.Contato;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

    ContatoDAO contatoDao = new ContatoDAO();

   // Contato contato = new Contato();
    //contato.setNome("Ana Lobo");
    //contato.setIdade(24);
    //contato.setDataCadastro(new Date());

    //contatoDao.save(contato);

   // for(Contato contato: contatoDao.getContatos()) {
        //System.out.println("O Contato " + contato.getNome() + ", tem " + contato.getIdade() + " anos.");
    //}

        /*Contato c = new Contato();
        c.setNome("Ana Maria Lobo");
        c.setIdade(26);
        c.setDataCadastro(new Date());
        c.setId(5);

        contatoDao.update(c);
        System.out.println("Contato atualizado");


*/

        contatoDao.delete(4);
        System.out.println("Contato deletado!");
    }
}
