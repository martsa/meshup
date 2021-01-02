package project01.meshup.services;

import project01.meshup.domain.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);
    List<Product> listProducts();

}
