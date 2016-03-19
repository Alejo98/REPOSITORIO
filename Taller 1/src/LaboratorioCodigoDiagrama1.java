
public class LaboratorioCodigoDiagrama1 {
 public static void main (String[]args){
	 java.util.Scanner leer=new java.util.Scanner(System.in);
	 int A=leer.nextInt();
	 int B=leer.nextInt();
	 int C=leer.nextInt();
	 int mayor;
	 if(A>B){
		 if(A>C){
			mayor=A;
		 }
		 else{
			 mayor=C;
		 }
	 }
	 else{
		 if(B>C){
			 mayor=B;
		 }
		 else{
			 mayor=C;
		 }
	 }
	 System.out.println("El numero mayor es "+ mayor);
 }
}
