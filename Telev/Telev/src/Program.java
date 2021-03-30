import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Program {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        int escolha=0;
        int valor=0;
        int escolha2=0;
        Television TV=new Television(0,0);
        int loop=0;
        while(loop!=5) {
        System.out.println("1 Escolher o canal");
        System.out.println("2 Aumentar ou diminiur volume");
        System.out.println("3 Mudar o canal");
        System.out.println("4 Mostrar estado da TV");
        System.out.println("5 Sair ");
        System.out.print("Digite a sua op��o: ");
        str=entrada.readLine();
        escolha=Integer.parseInt(str);
        switch(escolha) {
        //Escolher canal
        case 1:
        	System.out.print("Digite o n�mero do canal: ");
        	str=entrada.readLine();
        	valor=Integer.parseInt(str);
        	if(valor>=0&&valor<=150) {
        		TV.selecionarCanal(valor);
        	}
        	else {
        		System.out.println("N�o existe esse canal");
        	}
        	break;
        	//Aumentar ou diminuir volume
        case 2:
        	System.out.print("Digite 1 para aumentar e 2 para diminuir o volume: ");
        	str=entrada.readLine();
        	escolha2=Integer.parseInt(str);
        	if(escolha2==1) {
        		TV.aumentaVolume();
        	}
        	else if(escolha2==1) {
        		TV.diminuiVolume();
        	}
        	else { 
        		System.out.println("Escolha inexistente ");
        	}
        	break;
        	//Mudar o canl
        case 3:
        	System.out.print("Digite 1 para aumentar o canal e 2 para diminiur o canal: ");
        	str=entrada.readLine();
        	escolha2=Integer.parseInt(str);
        	if(escolha2==1) {
        		TV.aumentarCanal();
        	}
        	else if(escolha2==2) {
        		TV.diminuiCanal();
        	}
        	else {
        		System.out.println("Escolha inexistente");
        	}
        	break;
        case 4:
        	TV.printarEstado();
        	break;
        case 5:
        	loop=5;
        	break;
        }
	}
	}
}
