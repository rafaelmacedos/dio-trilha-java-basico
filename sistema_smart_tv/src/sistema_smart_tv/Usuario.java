package sistema_smart_tv;

public class Usuario {
	public static void main(String[] args) {
		
		SmartTV smartTv = new SmartTV();
		
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();		
				
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual : " + smartTv.canal);
		System.out.println("Volume Atual : " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
		
		smartTv.mudarCanal(12);
		System.out.println("Canal Atual : " + smartTv.canal);
		
		smartTv.desligar();
		System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
		
		
	}

}
