package com.develhope.demodevelhope.eserciziPracticeConMicheleEs1;
//5. Controller Layer: Crea un controller ProductController che fornisca i punti di accesso
//per le operazioni CRUD sui prodotti. Inietta ProductService nel controller.
//5. Controller Layer: Crea un controller ProductController che fornisca i punti di accesso
//per le operazioni CRUD sui prodotti. Inietta ProductService nel controller.
//6. Endpoint per la gestione dei prodotti: Definisci i metodi del controller per gestire le
//richieste HTTP relative ai prodotti, come l'aggiunta di un nuovo prodotto, la modifica di un
//prodotto esistente, la visualizzazione di tutti i prodotti, la visualizzazione di un singolo
//prodotto e la cancellazione di un prodotto.
//7. Test dell'applicazione: Utilizza Postman o un altro strumento simile per testare i vari
//endpoint dell'applicazione per assicurarti che funzionino correttamente.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/EsLezione1")
public class ProductController {
     @Autowired
    public ProductService productService;
     @PostMapping("/add") // CRUD
    public ResponseEntity<Product> addProduct (@RequestBody Product addProduct){
         return ResponseEntity.ok().body(productService.addProduct(addProduct));
     }
     @GetMapping("/get")
    public ResponseEntity<List<Product>> getProduct (){
         List<Product> listOfProducts =productService.getAllProducts();
         return ResponseEntity.ok().body(listOfProducts);
     }
    @PutMapping ("/update")
    public ResponseEntity<Product> updateProduct (@RequestBody Product updateProduct){
        return ResponseEntity.ok().body(productService.updateProduct(updateProduct));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Product> deleteProduct (@RequestBody Product deleteProduct){
         return ResponseEntity.ok().body(productService.deleteProduct(deleteProduct));
    }
}
