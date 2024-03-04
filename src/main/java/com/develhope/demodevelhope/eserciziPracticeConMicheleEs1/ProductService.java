package com.develhope.demodevelhope.eserciziPracticeConMicheleEs1;
import java.util.ArrayList;
import java.util.List;
//3. Service Layer: Crea una classe ProductService che definisca i metodi per gestire i
//prodotti come addProduct, getProductById, getAllProducts, updateProduct, e
//deleteProduct. Usare una lista di Product nel service per simulare tutte le situazioni
//richieste.
//4. Implementazione del Service: Implementa la classe ProductService creando una classe
//che gestisca la logica di business per i prodotti.


public class ProductService {
    List<Product> listaProdotti = new ArrayList<>();

    public Product addProduct (Product prodottoDaAggiungere) {
        listaProdotti.add(prodottoDaAggiungere);
        return prodottoDaAggiungere;
    }
    public Product getProductById (Integer id){
        Product prodotto = new Product();
        for (Product product : listaProdotti) {
            if (product.getId().equals(id)) {
                product = prodotto;
            }
        }
        return prodotto;
    }

    public List<Product> getAllProducts (){
        return listaProdotti;
    }

    public Product updateProduct (Product prodottoDaUpdatare){
        for (Product product : listaProdotti){
            if (product.getId().equals(prodottoDaUpdatare.getId())){
                product.setNome(prodottoDaUpdatare.getNome());
                product.setDescrizione(prodottoDaUpdatare.getDescrizione());
                product.setPrezzo(prodottoDaUpdatare.getPrezzo());
            }
        }
        return prodottoDaUpdatare;
    }
    public Product deleteProduct (Product productEliminare){
        listaProdotti.remove(productEliminare);
        return productEliminare;
    }

}
