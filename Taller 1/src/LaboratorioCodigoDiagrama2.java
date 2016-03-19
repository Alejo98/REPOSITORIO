
public class LaboratorioCodigoDiagrama2 {


	public static void main(String[] args) {
		int cuenta_as=1;
		int contador=1;
		int blan=1;
		int numero=5;
		char asterisco='*';
		char espacio=' ';
		System.out.print("");
		while(contador<=numero){
			blan=numero-contador;
			while(blan>0){
				System.out.print(espacio);
				blan-=1;
			}
			cuenta_as=1;
			while(cuenta_as<(2*contador)){
				System.out.print(asterisco);
				cuenta_as+=1;
			}
			contador+=1;
			System.out.println("");
			
		}
	}

}

