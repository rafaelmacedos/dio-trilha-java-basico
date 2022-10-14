package sistema_smart_tv;
import java.util.Locale;
import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		SmartTV smartTv = new SmartTV();
		
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();		
				
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual : " + smartTv.canal);
		System.out.println("Volume Atual : " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
		
		System.out.println("Canal Atual : " + smartTv.canal);
		
		System.out.println("Digite o canal que você deseja: ");
		int canal = scanner.nextInt();
		smartTv.mudarCanal(canal);
		System.out.println("Canal Atual : " + smartTv.canal);

		
		smartTv.desligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
		
		
	}

}
