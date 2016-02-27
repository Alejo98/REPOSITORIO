
public class LaboratorioNumero1 {

	public static void main(String[] args) {
		java.util.Scanner lectura= new java.util.Scanner(System.in);
		System.out.print("Cuantos candidatos desea evaluar: ");
		int N=lectura.nextInt();
		int n=N+1;
		int Mayor=0,TOTAL=0,Porcentaje=0;
		int z=0,y=0,mayor=0,h=0;		 
		int i=1,j=1,Votos=0,total=0,tot=0;
		int [] Tot=new int [20];
		int [] Fal=new int [20];
		int [] Vot=new int [20];
		String x,f,votos;
		String [][] Elecciones=new String [20][20];
		String [] nombre=new String [20];
		String [] orden=new String [20];
		String [] municipio=new String [20];
	
					
		for (i=1;i<n;i=i+1){

			System.out.println("nombre del candidato numero: "+i);
			x=lectura.next();
			Elecciones [i][0]=x;
			nombre [i]=x;
		}
			
		for (i=1;i<n;i=i+1){
		    System.out.println("municipio numero: "+i);
		    f=lectura.next();
			Elecciones [0][i]=f;
			municipio[i]=f;
			}
			
		

		for(i=1;i<n;i=i+1){
			 for(j=1;j<n;j=j+1){
				 System.out.println("numero de votos del candidato : "+nombre[i]+" en el municipio "+municipio[j]);
				 Votos=lectura.nextInt();
				 votos= String.valueOf(Votos);
				 Elecciones[i][j]=votos;
				 
			 }
		 }
		
		for (i=0;i<n;i=i+1){
			for(j=0;j<n;j=j+1){
			  System.out.print(Elecciones [i][j] + "\t"+"\t");
			}
			System.out.println("");
		}
		
		
		for(i=1;i<n;i=i+1){
			tot=0;
			for(j=1;j<n;j=j+1){
				
				total = Integer.parseInt(Elecciones[i][j]);
				tot=tot+total;
				TOTAL=TOTAL+total;
				}
			System.out.println("El candidato :"+nombre[i]+" tiene "+tot+" votos en total");
			Tot[i]=tot;
		}
		
		for(i=1;i<=n;i+=1){
			for(j=i+1;j<n;j=j+1){
				
					if(Tot[i]==Tot[j]){
					mayor=1;
					System.out.println("Los candidatos "+nombre[i]+" y "+nombre[j]+"  tienen la misma votacion");
				
				}
			}
		}
		     
			Mayor=0;
		    for (z=1;z<=n;z=z+1){
		    	   
				    if (Tot[z]>Mayor){
					    Mayor=Tot[z];
					    y=z;
					}
				    else{
				    	Mayor=Mayor;
				    }
        	 }
		 
			 System.out.println("\n      LOS CANDIDATOS \n   ");
			 System.out.println("El candidato con mayor votacion es :"+nombre[y]+" y tiene " + Mayor + " votos");
			 System.out.println("El numero total de votos "+ TOTAL);
			 
			 Porcentaje=(Mayor*100)/TOTAL;
			 if (Porcentaje>50){
			 System.out.println("El candidato: "+nombre[y]+ " es el ganador de las elecciones");
			 }
			 else{
				 System.out.println("El orden de la votacion es \n ");
				 for(i=1;i<=n;i++){
					 Fal[i]=Tot[i]; 
				 }
				 for (j=1;j<n;j=j+1){ 
				 mayor=Fal[1];
				 
		          for (i=1;i<=n;i++){
		        	  if (Fal[i]>=mayor){
		        		  mayor=Fal[i];
		        	      h=i;
		        	  }
		        	          	  	        	  
		          }
		          orden[j]=nombre[h];
		          Vot[j]=Fal[h];
	        	  
	        	  System.out.println(orden[j]+" con los siguientes votos: "+Vot[j]);
	        	  
	        	  Fal[h]=0;

				 } 
				 System.out.println("\n LOS DOS PRIMEROS SERAN QUIENES PODRAN COMPETIR DE NUEVO POR SER GANADORES");
				}
			
		
    }
}