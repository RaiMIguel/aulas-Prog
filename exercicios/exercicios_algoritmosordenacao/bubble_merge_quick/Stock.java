package exercicios.exercicios_algoritmosordenacao.bubble_merge_quick;

public class Stock {
    String name;
    long id;
    double valueProduct;

    public Stock(String name, long id, double valueProduct){
        this.name = name;
        this.id = id;
        this.valueProduct = valueProduct;
    }
    @Override
    public String toString(){
        return String.format("ID: %d | Nome: %s | Valor: %.2f ", id, name, valueProduct);
    }
}
