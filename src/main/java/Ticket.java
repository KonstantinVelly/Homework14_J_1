import java.util.Collection;

public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int price;
    protected String depAiport;
    protected String arrAirport;
    protected int destTime;

    public Ticket(int id, int price, String depAiport, String arrAirport, int destTime) {
        this.id = id;
        this.price = price;
        this.depAiport = depAiport;
        this.arrAirport = arrAirport;
        this.destTime = destTime;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDepAiport() {
        return depAiport;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public int getDestTime() {
        return destTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDepAiport(String depAiport) {
        this.depAiport = depAiport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public void setDestTime(int destTime) {
        this.destTime = destTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}

