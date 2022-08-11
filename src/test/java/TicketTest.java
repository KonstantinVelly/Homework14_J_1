import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(1, 200, "PUL", "HER", 360);
    Ticket ticket2 = new Ticket(22, 400, "PUL", "HEL", 180);
    Ticket ticket3 = new Ticket(333, 150, "PUL", "HEL", 60);
    Ticket ticket4 = new Ticket(44, 500, "LON", "ATH", 240);
    Ticket ticket5 = new Ticket(5, 200, "PUL", "HEL", 120);


    @Test //Ищем нужные элементы в списке и сортируем по возрастанию цены
    public void findItemByDestination() {
        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.save(ticket4);
        repo.save(ticket5);

        Ticket[] expected = {ticket3, ticket5, ticket2};
        Ticket[] actual = manager.searchBy("PUL", "HEL");

        assertArrayEquals(expected, actual);
    }
}