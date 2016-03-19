
public class LaboratorioCodigoDiagrama4 {

	public static void main(String[] args){
		java.util.Scanner leer=	new java.util.Scanner(System.in);
		int jugar=1;
		
		while (jugar==1){
			Guessgame();
			System.out.println("deseas jugar de nuevo? (digita 1 si quieres jugar y digita 2 si no)");
			jugar=leer.nextInt();
		}
			
	}
	
	public static void Guessgame(){
		java.util.Scanner leer = new java.util.Scanner(System.in);
		int answer= (int) Math.floor((Math.random()*100)+1);
		int guess=0;
		int numGuesses=1;
		
		while (numGuesses<=7){
			System.out.println("Adivina un numero");
			guess=leer.nextInt();
			if (guess==answer){
				System.out.println("GANASTE");
				numGuesses=numGuesses+7;
			}
			else{
				if(guess<answer){
					System.out.println("Escoge un numero mayor");
				}
				else{
					System.out.println("Escoge un numero menor");
				}
				
			}
			numGuesses=numGuesses+1;
		}
		
		if(numGuesses==7){
			System.out.println("PERDISTE");
		}
	}
}

