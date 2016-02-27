
public class LaboratorioNuemero2 {
   public static void main(String[]args){
	   java.util.Scanner lectura=new java.util.Scanner(System.in);
	   String nombre,apellido,Ncedula,N;
	int Matriz[][]=new int [2][4];
	int Matriz1[][]=new int [2][4];
	int Matriz2[][]=new int [7][6];
	int Matriz3[][]=new int [7][6];
	String Tabla[][]=new String[50][5];
	int i=0,j=0,n=0,b=0,Cliente=0,a=0,c=0,h=0,numerodeCedula;
	for(i=0;i<=1;i++){
 		for(j=0;j<=3;j++){
 			Matriz[i][j]=0;
 			System.out.print("   "+Matriz[i][j]+"\t");
 		}
 		System.out.println("");
 	}
 	int contador=0;
 	for(i=0;i<=1;i++){
 		for(j=0;j<=3;j++){
 			contador++;
 			Matriz1[i][j]=contador;
 		}
     	}
 	for(i=0;i<=6;i++){
 		for(j=0;j<=5;j++){
 			Matriz2[i][j]=0;
 			System.out.print(" "+Matriz2[i][j]+"\t");
 		}
 		System.out.println("");
 	}
 	int numeracion=0;
 	for(i=0;i<=6;i++){
 		for(j=0;j<=5;j++){
 			numeracion++;
 			Matriz3[i][j]=numeracion;
 		}
 	}
 	
 
	for(int fin=0;fin<=49;fin++){
		i=0;
		System.out.println(" Digite nombre y numero de cedula respectivamente");
		System.out.print(" Nombre: ");
		nombre=lectura.next();
		Tabla[fin][i]=nombre;
		System.out.print(" Apellido: ");
		apellido=lectura.next();
		Tabla[fin][i+1]=apellido;
		System.out.print(" Número de Cedula: ");
		numerodeCedula=lectura.nextInt();
		Ncedula=String.valueOf(numerodeCedula);
		Tabla[fin][i+2]=Ncedula;
		System.out.println(" Si el cliente desea comprar clase ejectuivo debera digitar 1 y para clase economico 2");
			
		for(j=1;j<=1 ;j++){
			b=lectura.nextInt();
			if (esCorrecto(b)==true && b==1){
				System.out.println("El cliente a comprado un boleto de clase ejecutiva");
				Tabla[fin][i+3]="Clase Ejecutiva";
				Cliente=1;
			} else if(esCorrecto(b)==true && b==2){
				System.out.println("El cliente a comprado un boleto de clase economica");
				Tabla[fin][i+3]="Clase Economica";
				Cliente=2;
			}
			else if(esCorrecto(b)==false){
				System.out.println("el cliente ejecuto mal las opciones, vuelve a intentarlo");
				j=j-1;
			}
		}
		
	     	
		
	     	System.out.println("Que silla desea elegir");
	     	n=lectura.nextInt();
	     	N=String.valueOf(n);
	     	Tabla[fin][i+4]=N;
	     	for(i=0;i<=1;i++){
		     		for(j=0;j<=3;j++){
		     			if(Matriz[i][j]!=0){
 		     		 a=1;
		     			}
 		     		 else{
 		     			a=0; 
 		     		 }
		     		}
				}
	     	if (b==1){
	     		
	     	for(i=0;i<=1;i++){
	     		for(j=0;j<=3;j++){
	     			for(h=0;h<1;h++){
	     			if (Matriz1[i][j]==n){
	     				if(Matriz[i][j]==0){
	     					Matriz[i][j]=1;
	     				}
	     				else if (a==1){
		     		     		System.out.println("Todas las sillas de clase ejecutiva estan ocupadas, deseas elegir otra silla de economico \n digita 1 si afirmas y 2 si no deseas comprar");
		     		     		          c=lectura.nextInt();
		     		     		          if(c==1){
		     		     		        	b=2;
		     		     		        	System.out.println("Elige el numero de silla en economico");
		     		     		        	n=lectura.nextInt();
		    		     		     		h=10;  
		     		     		          }
		     		     		          else {
		     		     		        	System.out.println("Gracias por venir");
		     		     		        	fin=fin-1;
		     		     		          }
		     		     	
	     					}
	     					else if (a==0){
	     						System.out.println("La silla esta ocupada, elige otra");
	     						h=h-1;
	     						n=lectura.nextInt();
	     					}
	     		
	     				
	     			}
	     			}
	     			}	   
	     		}
	     	} 
	     	for(i=0;i<=6;i++){
	     		for(j=0;j<=5;j++){
	     			if(Matriz2[i][j]!=0){
		     		 a=1;
	     			}
		     		 else{
		     			a=0; 
		     		 }
	     		}
			}
	     	if(b==2){
	     		
	     		for(i=0;i<=6;i++){
		     		for(j=0;j<=5;j++){
		     			for(h=0;h<1;h++){
		     			if (Matriz3[i][j]==n){
		     				
		     				if(Matriz2[i][j]==0){
		     					Matriz2[i][j]=1;
		     				}
		     				else if (a==1){
		     		     		
		     		     		        	System.out.println("Gracias por venir");
		     		     		        	fin=fin-1;
		     		  
		     		     	
	     					}
		     				else if (a==0) {
		     				
		     						System.out.println("La silla esta ocupada, elige otra");
		     						h=h-1;
		     						
		     						n=lectura.nextInt();
		     					}
		    				}
		     			}
		     		}
	     		}
	     		
	     	}
	     	for(i=0;i<=1;i++){
	     		for(j=0;j<=3;j++){
	     			System.out.print("    "+Matriz[i][j]+"\t");   
	     		}
	     		System.out.println("");
	     	}	
	     	for(i=0;i<=6;i++){
	     		for(j=0;j<=5;j++){
	     			System.out.print("  "+Matriz2[i][j]+"\t");   
	     		}
	     		System.out.println("");
	     	}     		
	     	System.out.println("Desea ingresar mas pasajeros, para afirmar digite 1 y para generar el reporte de clientes digite 2");
	     	int Pas=lectura.nextInt();
	     	if(Pas==1){   		
	     	}
	     	else{
	     		fin+=50;
	     	}
	     	
	}
	for(i=0;i<=50;i++){
 		for(j=0;j<=4;j++){
 			System.out.print("    "+Tabla[i][j]+"\t");   
 		}
 		System.out.println("");
 	}	
	}
   
   public static boolean esCorrecto(int a) {
		boolean opcion = false;
	    if (a==1){
	    	opcion=true;
	    } else if(a==2){
	    	opcion=true;
	    }
	    else if(a!=1||a!=2){
	    	opcion=false;
	    }
	    return opcion;
	}
}