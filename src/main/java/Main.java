import Entity.*;
import persistence.*;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Car car = new Car();

        car.setCreator("Mercedes");
        car.setModel("E63s");
        car.setCountry("Germany");

        session.save(car);

        Carspecs carspecs = new Carspecs();
        carspecs.setBody("sport4");
        carspecs.setColor("white");
        carspecs.setEngine_size(6);

        session.save(carspecs);

        session.getTransaction().commit();
        System.out.println("Done");


    }
}
