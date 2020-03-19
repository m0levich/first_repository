package lesson_6.ITC_1.Task_2;

import java.util.List;

interface Basket {

    public void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}
