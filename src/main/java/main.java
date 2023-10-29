import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("default");
        EntityManager manager = ef.createEntityManager();

        try{
            manager.getTransaction().begin();
            Book book = new Book();

            book.setWriter("chang");
            book.setTitle("ccc");
            manager.persist(book);
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }
}
