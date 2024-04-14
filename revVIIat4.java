import java.util.ArrayList;

public class revVIIat4 {

    public static void main(String[] args) {
        ArrayList<Double> vendasBrutas = new ArrayList<>();
        
        
        vendasBrutas.add(3000.0);
        vendasBrutas.add(2500.0);
        vendasBrutas.add(4500.0);
        vendasBrutas.add(800.0);
        vendasBrutas.add(1200.0);
        
        
        int[] contadores = new int[9]; 
        
        
        for (double vendas : vendasBrutas) {
            double salario = 200 + (0.09 * vendas);
            int indiceIntervalo = (int) (salario - 200) / 100;
            if (indiceIntervalo >= 0 && indiceIntervalo < contadores.length) {
                contadores[indiceIntervalo]++;
            } else {
                contadores[contadores.length - 1]++; 
            }
        }
        
        
        System.out.println("Número de vendedores por intervalo de salário:");
        int inicioIntervalo = 200;
        for (int i = 0; i < contadores.length; i++) {
            int fimIntervalo = inicioIntervalo + 99;
            if (inicioIntervalo == 1000) {
                System.out.println("$1000 em diante: " + contadores[i]);
            } else {
                System.out.println("$" + inicioIntervalo + " - $" + fimIntervalo + ": " + contadores[i]);
            }
            inicioIntervalo += 100;
        }
    }
}
