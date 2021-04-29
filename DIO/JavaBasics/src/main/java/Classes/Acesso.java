package Classes;

public class Acesso {
    
    public static void main() {
        
        Carro Escort = new Carro("Ford", "Escort", 1998);
        Escort.Variante = "GL";

        System.out.println(Escort.getMarca());
        System.out.println(Escort.getModelo());
        System.out.println(Escort.getAnoFabricacao());
        System.out.println(Escort.getVariante());
    }
}
