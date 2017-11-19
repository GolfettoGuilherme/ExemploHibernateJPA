package br.com.jpa.DAO;

import br.com.jpa.model.Bitcoin;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BitcoinDAO {
    
    public EntityManager getEM(){
        return Persistence.createEntityManagerFactory("ProjetoJPAPU").createEntityManager();
    }
    
    public void salvar(Bitcoin bit){
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.persist(bit);
        em.getTransaction().commit();
        em.close();
    }
    
    public void excluir(Bitcoin bit){
        EntityManager em = getEM();
        em.getTransaction().begin();
        Bitcoin bitRemover = em.find(Bitcoin.class, bit.getId());
        em.remove(bitRemover);
        em.getTransaction().commit();
        em.close();
    }
    
    public Bitcoin buscar(int id){
        EntityManager em = getEM();
        em.getTransaction().begin();
        Bitcoin bit = em.find(Bitcoin.class, id);
        em.close();
        return bit;
    }
    
    public void update(Bitcoin bit){
        EntityManager em = getEM();
        em.getTransaction().begin();
        Bitcoin bitNovo = em.find(Bitcoin.class, bit.getId());
        bitNovo.setData(bit.getData());
        bitNovo.setValor(bit.getValor());
        em.merge(bitNovo);
        em.getTransaction().commit();
        em.close();
    }
    
}
