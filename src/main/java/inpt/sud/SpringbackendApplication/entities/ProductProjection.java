package inpt.sud.SpringbackendApplication.entities;
import inpt.sud.SpringbackendApplication.data.Product;
import org.springframework.data.rest.core.config.Projection;
@Projection(name="P1", types= Product.class)
public interface ProductProjection {
    public double getCurrentPrice();
}
