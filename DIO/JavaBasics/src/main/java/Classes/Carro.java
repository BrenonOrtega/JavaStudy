package Classes;

public class Carro {

    String Marca;
    String Modelo;
    int AnoFabricacao;
    String Variante;

    public Carro(String marca, String modelo, int anoFabricacao){
        Marca = marca;
        Modelo = modelo;
        AnoFabricacao = anoFabricacao;
    }

    public String getMarca() {return Marca; } 
    public void SetMarca(String value){ Marca = value; }

    public String getModelo() {return Modelo; }
    public void SetModelo(String value){ Modelo = value; }

    public int getAnoFabricacao() {return AnoFabricacao; }
    public void SetAnoFabricacao(int value){ AnoFabricacao = value; }
    
    public String getVariante() {return Variante; }
    public void SetVariante(String value){ Variante = value; }
    
    
}
