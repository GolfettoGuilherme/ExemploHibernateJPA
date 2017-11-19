package br.com.jpa.model;

import br.com.jpa.DAO.BitcoinDAO;

public class ProjetoJPA {


    public static void main(String[] args) {
//        Bitcoin bit = new Bitcoin();
//        bit.setValor(27500);
//        bit.setData(1511124108);
        BitcoinDAO dao = new BitcoinDAO();
        
        //insert
//        dao.salvar(bit);
//        System.out.println("Salvo");        

        
        //excluir
        //bit.setId(2);
        //dao.excluir(bit);
        //System.out.println("Excluido");                
        
        //update
        Bitcoin bitTabela = dao.buscar(1);
        bitTabela.setValor(28000);
        bitTabela.setData(4108);
        dao.update(bitTabela);
        System.out.println("alterado");
    }
    
}
