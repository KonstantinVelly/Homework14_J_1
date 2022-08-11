import java.util.Arrays;

public class TicketManager {
    private TicketRepository repo;

    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }

    public void save(Ticket ticket) {
        repo.save(ticket); // добавляем элемент
    }

    public void removedById(int id) {
        repo.removeById(id);
    }

    public Ticket[] getTickets() {
        return repo.getTickets();
    }

    public Ticket[] searchBy(String text, String text1) {
        Ticket[] result = new Ticket[0]; // тут будем хранить подошедшие запросу продукты
        for (Ticket ticket : repo.getTickets()) {
            if (matches(ticket, text, text1)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
                // "добавляем в конец" массива result продукт product
            }
        }
        Arrays.sort(result);
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Ticket ticket, String depAirport, String arrAirport) {
        if (ticket.getDepAiport().contains(depAirport) &
         ticket.getArrAirport().contains(arrAirport)){
            return true;
        }
        return false;
        // или в одну строку:
        // return product.getName().contains(search);
    }
}
