
public class LaboratorioNumero3 {
   public static void main(String[]args){
		   java.util.Scanner lectura=new java.util.Scanner(System.in);
		   String informacion[][]=new String[88][5];
		   int Disponibilidad[][]=new int [3][29];
		   int Lugar[][]=new int [3][29];
		   String Posicion[][]=new String[3][29];
		   int i,j,Ingreso,contador,Hora,Horasalida;
		   int recogido[]=new int [87];
		   String placa[]=new String[88];
		 
		 int costoHora;
		 System.out.println("Ingrese el costo de hora impuesto del estado");
		 costoHora=lectura.nextInt();
		   
		 for(i=0;i<=87;i++){
			 for(j=0;j<=2;j++){
				 informacion[i][j]="vacio";
			 }
		 }
		   
		for (i=0;i<=2;i++){
		 for (j=0;j<=28;j++){
		  Posicion[i][j]="vacio";
		  Disponibilidad[i][j]=0;
		 }
		}
		contador=0;
		
		for (i=0;i<=2;i++){
			 for (j=0;j<=28;j++){
			  contador+=1;
			  Posicion[i][j]="vacio";
			  Lugar[i][j]=contador;
			  Disponibilidad[i][j]=0;
			 
			 }
		}
		
		
		int Salir=1;
		while(Salir<=87){
			System.out.print("Va entrar un auto, digite 1 si va a ingresar \n 2 si va a salir y 3 si quiere ver el reporte \t");
			Ingreso=lectura.nextInt();
			  
			
			if(Ingreso==1){
			 						
				for (i=1;i<=3;i++){
					 for (j=1;j<=29;j++){
						 if (Posicion[i-1][j-1]=="vacio"){
							
							 System.out.println("Ingrese en la posicion \t"+Lugar[i-1][j-1]);
							 do{
								 System.out.println("Escriba  la Hora de entrada del automovil entre las 6 am y 21 pm");
								    Hora=lectura.nextInt();
							 }while(Hora<6||Hora>21);
							   
								informacion[(j*i)-1][3]=""+Hora;
						    	System.out.println("Escriba  la placa del automovil");
								informacion[(j*i)-1][2]=lectura.next();
								System.out.println("Escriba el nombre del propietario");
								informacion[(j*i)-1][0]=lectura.next();
								System.out.println("Escriba el apellido del propietario");
								informacion[(j*i)-1][1]=lectura.next();
								Posicion[i-1][j-1]="ocupado";
							 j=30;
							 i=3;
							 Salir+=1;
						 }
						
					 }
					}
				
			}
			
			else if(Ingreso==2){
				 System.out.println("Digite la posicion del automovil");
				 int busquedaPlaca;
				 busquedaPlaca=lectura.nextInt();
				 do{
					 System.out.println("Digite la Hora de salida en un intervalo de 6am a 21pm");
					 Horasalida=lectura.nextInt();
				 }while(Horasalida<6||Horasalida>21);		 
					 	   for (i=0;i<=2;i++){
								 for (j=0;j<=28;j++){
									 if(Lugar[i][j]==busquedaPlaca){
										   System.out.println("El carro esta en la posicion   "+ Lugar[i][j]);
										   for (int h=Lugar[i][j];h<=87;h++){
											   System.out.println("El nombre del propietario: "+informacion[Lugar[i][j]-1][0]);
											   System.out.println("El apellido del propietario: "+informacion[Lugar[i][j]-1][1]);
											   System.out.println("la placa del vehiculo: "+informacion[Lugar[i][j]-1][2]);
											   int pago=(Horasalida-Integer.parseInt(informacion[Lugar[i][j]-1][3]))*costoHora;
											   recogido[Lugar[i][j]-1]+=pago;
											   h=90;
											   System.out.println("El propietario debe pagar: "+pago); 											   
										   }
									}
					   }
					}
			}
					else if(Ingreso==3){
						int count=0;
						for(j=0;j<=2;j++){
							for(i=0;i<=28;i++){
								if(Posicion[j][i]=="vacio"){
									count+=1;
								}
							}
						}
						System.out.println("Hay disponibles "+count+" cupos de parqueadero");
						int ganancias=0;
						for(i=0;i<=86;i++){
							ganancias+=recogido[i];
							System.out.println(recogido[i]);
						}
						System.out.println("Las ganancias del parqueadero del dia son "+ganancias+"\n \n");
						
		}
			
		
   }
   }

}