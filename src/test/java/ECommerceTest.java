import org.example.Cart;
import org.example.Order;
import org.example.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ECommerceTest {
    @Test
    public void testAddProductToCart() {
        Cart cart = new Cart();
        Product laptop = new Product(1, "Laptop", 1000.0);

        cart.addProduct(laptop);

        assertTrue(cart.getProducts().contains(laptop));
    }

    @Test
    public void testRemoveProductFromCart() {
        Cart cart = new Cart();
        Product laptop = new Product(1, "Laptop", 1000.0);

        cart.addProduct(laptop);

        cart.removeProduct(laptop);

        assertFalse(cart.getProducts().contains(laptop));
    }

    @Test
    public void testPlaceOrder() {
        Cart cart = mock(Cart.class);
        Product laptop = new Product(1, "Laptop", 1000.0);

        when(cart.addProduct(laptop)).thenReturn(true);

        Order order = new Order(Arrays.asList(laptop));

        order.boughtOrder();

        assertNotNull(order.getOrderId());
        assertTrue(order.getProducts().contains(laptop));
    }

    @Test
    public void testGetOrderStatus() {
        Order order = new Order(Arrays.asList(new Product(1, "Laptop", 1000.0)));

        assertEquals("pending", order.getStatus());
    }
}
