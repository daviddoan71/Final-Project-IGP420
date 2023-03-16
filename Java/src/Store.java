public class Store {
    ppublic class Product {
        private String name;
        private String description;
        private double price;
        private String category;
        // add other properties as needed

        // constructors, getters and setters
    }
    public class Store {
        private Map<String, Product> products; // use name as key

        public Store() {
            products = new HashMap<>();
        }

        public void addProduct(Product product) {
            products.put(product.getName(), product);
        }

        public void deleteProduct(String name) {
            products.remove(name);
        }

        public void editProduct(String name, Product product) {
            products.put(name, product);
        }

        public List<Product> listProducts() {
            return new ArrayList<>(products.values());
        }

        // add other methods as needed
    }
    public class ShoppingCart {
        private List<Product> items;

        public ShoppingCart() {
            items = new ArrayList<>();
        }

        public void addItem(Product product) {
            items.add(product);
        }

        public void removeItem(Product product) {
            items.remove(product);
        }

        public double getTotal() {
            double total = 0.0;
            for (Product item : items) {
                total += item.getPrice();
            }
            return total;
        }

        // add other methods as needed
    }
    import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

    public class StoreGUI extends Application {
        private Store store;
        private ShoppingCart cart;

        private TextField searchField;
        private GridPane productGrid;
        private GridPane cartGrid;

        public void start(Stage stage) {
            store = new Store();
            cart = new ShoppingCart();

            searchField = new TextField();
            Button searchButton = new Button("Search");
            searchButton.setOnAction(e -> searchProducts());

            productGrid = new GridPane();
            productGrid.setHgap(10);
            productGrid.setVgap(10);

            cartGrid = new GridPane();
            cartGrid.setHgap(10);
            cartGrid.setVgap(10);

            Button addButton = new Button("Add to Cart");
            addButton.setOnAction(e -> addToCart());

            Button checkoutButton = new Button("Checkout");
            checkoutButton.setOnAction(e -> checkout());

            GridPane root = new GridPane();
            root.setHgap(10);
            root.setVgap(10

        }