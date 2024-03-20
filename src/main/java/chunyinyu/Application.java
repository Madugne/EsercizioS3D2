package chunyinyu;

import chunyinyu.dao.EventoDAO;
import chunyinyu.entities.Evento;
import chunyinyu.entities.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class Application {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EsercizioD2S3");
    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EventoDAO dao = new EventoDAO(entityManager);

//        dao.save(new Evento("evento1", new Date(), "evento prova1", TipoEvento.PRIVATO, 10));
//        dao.save(new Evento("evento2", new Date(), "evento prova2", TipoEvento.PUBBLICO, 50));
//        dao.save(new Evento("evento3", new Date(), "evento prova3", TipoEvento.PRIVATO, 20));

        System.out.println(dao.getById(2L));
        dao.delete(1L);
    }
}
