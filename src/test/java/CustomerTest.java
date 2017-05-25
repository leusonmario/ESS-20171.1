import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leuson on 24/05/17.
 */
public class CustomerTest {

    @Test
    public void oneMovieRentedTest(){
        Customer client = new Customer("Leuson");
        Movie p1 = new Movie("get out", 1);
        Movie p2 = new Movie("o rastro", 0);

        Rental rental = new Rental(p1, 3);
        client.addRental(rental);
        assertEquals("Rental Record for Leuson\n" +
                "\tget out\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points", client.statement());

    }

    @Test
    public void twoMoviesRentedTest(){
        Customer client = new Customer("Leuson");
        Movie p1 = new Movie("get out", 1);
        Movie p2 = new Movie("o rastro", 0);

        Rental rental = new Rental(p1, 3);
        client.addRental(rental);
        Rental rental2 = new Rental(p2, 3);
        client.addRental(rental2);

        assertEquals("Rental Record for Leuson\n" +
                "\tget out\t9.0\n" +
                "\to rastro\t3.5\n" +
                "Amount owed is 12.5\n" +
                "You earned 3 frequent renter points", client.statement());

    }


}