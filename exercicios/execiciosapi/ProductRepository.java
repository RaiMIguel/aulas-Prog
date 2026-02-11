package exercicios.execiciosapi;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public void save(Product product) throws ProductException {
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new ProductException("Product name cannot be empty");
        }
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }

    public void delete(int id) throws ProductException {
        boolean removed = products.removeIf(p -> p.getId() == id);
        if (!removed) {
            throw new ProductException("Product ID not found: " + id);
        }
    }

    public void update(int id, Product updatedProduct) throws ProductException {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, updatedProduct);
                return;
            }
        }
        throw new ProductException("Product ID not found: " + id);
    }
}