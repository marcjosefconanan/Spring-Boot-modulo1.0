package com.develhope.demodevelhope.eserciziPracticeConMicheleEs1;
//Traccia: Sistema di gestione di prodotti
//1. Creazione del progetto Spring: Inizia creando un nuovo progetto Spring Boot utilizzando
//il tuo IDE preferito o utilizzando il sito ufficiale di Spring Boot per generare un progetto di
//base.
//2. Definizione del modello: Crea una classe Product che rappresenti un prodotto con attributi
//come id, nome, descrizione e prezzo.
//3. Service Layer: Crea una classe ProductService che definisca i metodi per gestire i
//prodotti come addProduct, getProductById, getAllProducts, updateProduct, e
//deleteProduct. Usare una lista di Product nel service per simulare tutte le situazioni
//richieste.
//4. Implementazione del Service: Implementa la classe ProductService creando una classe
//che gestisca la logica di business per i prodotti.
//5. Controller Layer: Crea un controller ProductController che fornisca i punti di accesso
//per le operazioni CRUD sui prodotti. Inietta ProductService nel controller.
//6. Endpoint per la gestione dei prodotti: Definisci i metodi del controller per gestire le
//richieste HTTP relative ai prodotti, come l'aggiunta di un nuovo prodotto, la modifica di un
//prodotto esistente, la visualizzazione di tutti i prodotti, la visualizzazione di un singolo
//prodotto e la cancellazione di un prodotto.
//7. Test dell'applicazione: Utilizza Postman o un altro strumento simile per testare i vari
//endpoint dell'applicazione per assicurarti che funzionino correttamente.
class Product {
    private Integer id;
    private String nome;
    private String descrizione;
    private Integer prezzo;

    public Product(Integer id, String nome, String descrizione, Integer prezzo) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }
}