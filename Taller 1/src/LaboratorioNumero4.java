
public class LaboratorioNumero4 {
	public static void main(String[]args){
		java.util.Scanner lectura=new java.util.Scanner(System.in);
		System.out.println("\t SEGUIMIENTO DE VENTAS ");
		System.out.println("Numero de productos a registrar");
		int N=lectura.nextInt();
		int n=N+1;
		int i,j,afirmacion;
		String p,c,d,pu,cp;
		String [][] Datos=new String [n][5];
		String [] producto=new String [n];
		String [] codigo=new String [n];
		int[]Codigo=new int [n];
		String [] descripcion=new String [n];
		String [] precio=new String [n];
		int[]Precio=new int [n];
		String [] codigoP=new String [n];
		int[]CodigoP=new int [n];
					
		for (i=1;i<n;i=i+1){

			System.out.println("nombre del Producto: "+i);
			 Datos [0][0]="Nombre";
			p=lectura.next();
			Datos [i][0]=p;
			producto [i]=p;
		}
			
		for (i=1;i<n;i=i+1){
		    System.out.println("numero de codigo de : "+producto[i]);
		    Datos [0][1]="Codigo";
		    c=lectura.next();
		    Datos [i][1]=c;
			codigo [i]=c;
			Codigo[i]=Integer.parseInt(c);
			}
		for (i=1;i<n;i=i+1){
		    System.out.println("Descripcion de: "+producto[i]);
		    Datos [0][2]="Descripcion";
		    d=lectura.next();
		    Datos [i][2]=d;
			descripcion [i]=d;
			}
		for (i=1;i<n;i=i+1){
		    System.out.println("Precio Unitario de: "+producto[i]);
		    Datos [0][3]="Precio Unitario";
		    pu=lectura.next();
		    Datos [i][3]=pu;
			precio [i]=pu;
			Precio[i]=Integer.parseInt(pu);
			}
		for (i=1;i<n;i=i+1){
		    System.out.println("Codigo Promocional de: "+producto[i]);
		    Datos [0][4]="Codigo Promocional";
		    cp=lectura.next();
		    Datos [i][4]=cp;
			codigoP[i]=cp;
			CodigoP[i]=Integer.parseInt(cp);
			}
		for(i=0;i<=n-1;i++){
			for(j=0;j<=4;j++){
				System.out.print(Datos[i][j]+"\t \t \t");
			}
			System.out.println(" ");
		}
		
		System.out.print("Cantidad de ventas: ");
		
		int m=lectura.nextInt();
		String Vendedores[]=new String[m];		
		int TOTAL[]=new int[m];		
		String Ventas[][]=new String[m][10];
		int contador=0,cont=0,cantidad,TT,total=0;
		String nombre,apellido,identificacion,cod,fecha,dia,mes,año,hora;
		String Nombre[]=new String[n];
		for(i=0;i<m;i++){
			System.out.print("Digite el día en el que se realiza la venta: ");
		     dia=lectura.next();
		     Ventas[i][6]=dia;
		     System.out.print("Digite el mes en el que se realiza la venta: ");
		     mes=lectura.next();
		     Ventas[i][7]=mes;
		     System.out.print("Digite el año en el que se realiza la venta: ");
		     año=lectura.next();
		     Ventas[i][8]=año;
		     System.out.print("Digite la hora en la que se realiza la venta: ");
		     hora=lectura.next();
		     Ventas[i][9]=hora;
		     System.out.print("El nombre del vendedor: ");
			 nombre=lectura.next();
			 Ventas[i][1]=nombre;
			 System.out.print("El apellido del vendedor: ");
			 apellido=lectura.next();
			 Ventas[i][2]=apellido;
			 System.out.print("La identificacion del vendedor: ");
			 identificacion=lectura.next();
			 Ventas[i][3]=identificacion;
			 System.out.print("Ingresa el codigo del producto: ");
			 cod=lectura.next();
			 Ventas[i][0]=cod;
			 System.out.print("Ingresa la cantidad vendida del producto: ");
			 cantidad=lectura.nextInt();
			 String Cantidad=String.valueOf(cantidad);
			 Ventas[i][4]=Cantidad;
			 System.out.print("Forma de pago: digite 1 si es con tarjeta debito y 2 si es con tarjeta a credito: ");
			 TT=lectura.nextInt();
			 String TTe=String.valueOf(TT);
			 Ventas[i][5]=TTe;
		
			 
		}
		for(i=0;i<m;i++){
			for(j=0;j<=9;j++){
			System.out.print(Ventas[i][j]+"\t");
		 }
			System.out.println(" ");
		}	
		
		
		for(i=0;i<m;i++){
			for(j=i+1;j<m;j++){
				if (Ventas[i][1]==Ventas[j][1]){
		        total=Integer.parseInt(Ventas[j][4]);
		        		
				}
			}
		}
			
		
		
		
		
		
		
		
		
		
	}
}
