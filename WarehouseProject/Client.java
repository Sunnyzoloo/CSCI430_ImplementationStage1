import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private String name;
    private List<Product> wishlist;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
        this.wishlist = new ArrayList<>();
    }

    // Accessors
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Wishlist operations
    public void addToWishlist(Product product) {
        wishlist.add(product);
    }

    public List<Product> getWishlist() {
        return wishlist;
    }

    @Override
    public String toString() {
        return "Client{id='" + id + "', name='" + name + "'}";
    }
}
