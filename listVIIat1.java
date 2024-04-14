import java.util.Scanner;
public class listVIIat1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        double[] temperaturas = new double[12];
	
	        for (int i = 0; i < 12; i++) {
	            System.out.print("Digite a temperatura média do mês " + (i+1) + ": ");
	            temperaturas[i] = scanner.nextDouble();
	        }
	        
	        double soma = 0;
	        for (double temperatura : temperaturas) {
	            soma += temperatura;
	        }
	        double mediaAnual = soma / 12;
	        
	        System.out.println("Temperaturas acima da média anual (" + mediaAnual + "ºC):");
	        for (int i = 0; i < 12; i++) {
	            if (temperaturas[i] > mediaAnual) {
	                String mes = obterNomeDoMes(i + 1);
	                System.out.println(mes + " - " + temperaturas[i] + "ºC");
	            }
	        }
	        
	        scanner.close();
	    }
	    
	    public static String obterNomeDoMes(int numeroMes) {
	        switch (numeroMes) {
	            case 1:
	                return "Janeiro";
	            case 2:
	                return "Fevereiro";
	            case 3:
	                return "Março";
	            case 4:
	                return "Abril";
	            case 5:
	                return "Maio";
	            case 6:
	                return "Junho";
	            case 7:
	                return "Julho";
	            case 8:
	                return "Agosto";
	            case 9:
	                return "Setembro";
	            case 10:
	                return "Outubro";
	            case 11:
	                return "Novembro";
	            case 12:
	                return "Dezembro";
	            default:
	                return "Mês inválido";
	        }
	    }
	}