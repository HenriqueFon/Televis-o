
public class Television {

	private int volume;
	private int canal;
	
	public Television(int volume,int canal) {
		this.volume=volume;
		this.canal=canal;
		
	}
	//getters e setters
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	//getters e setters
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal=canal;
	}
	
	//metodo para aumentar o Volume
	public int aumentaVolume() {
		return volume++;
		
		
	}
	//metodo para diminuir o Volume
	public int diminuiVolume() {
		return volume--;
	}
	//metodo para selecionar Canal
	public int selecionarCanal(int can) {
		
		return canal=can;
	}
	//metodo para aumentar o Canal
	public int aumentarCanal() {
		canal++;
		int resp=0;
		if(canal>150) {
			canal=1;
			resp=canal;
		}
		else {
			resp=canal;
		}
		return canal;
	}
	//metodo para diminuir o Canal
	public int diminuiCanal() {
		canal--;
		int resp=0;
		if(canal<1) {
			canal=150;
		}
		else {
			resp=canal;
		}
		return resp;
	}
	public void printarEstado() {
		System.out.println("Voc� est� assistindo ao canal:" +canal);
		System.out.println("Volume da TV:" +volume);
	}
}
