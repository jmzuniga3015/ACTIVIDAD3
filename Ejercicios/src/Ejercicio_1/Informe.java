/**
 * Un vendedor minorista en línea requiere un informe de las ventas del día. 
 * Para ello cuenta con tres arreglos de n elementos cada uno: A, B y C.
 * El primero almacena el código de los productos vendidos en el día, El segundo almacena
el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto.
 Requiere un aplicativo que le calcule rápidamente los siguientes datos:
 Total productos vendidos en el día.
 Total ingresos por ventas del día.
 El producto más vendido.
 El producto más costoso vendido.
  */
 

package Ejercicio_1;

import java.util.Scanner;


public class Informe {
    // declaro las variables estaticas ya que el menu o metodo principal que ejecuta el codigo
    // es estatico por lo tanto las variables y metodos deben ser estaticos para poder usarlos
    static String primerVector[]= new String[20];
    static double segundoVector[]= new double[20];
    static int tercerVector[]= new int[20];
    static String op="si";
    static int suma=0;
    static int i, cont=0;;
    public static void main(String[] args) {
        capturarDatos();
        mostrar();
        
    }
    //pido los datos al usuario para llenar el vector
   public static void capturarDatos(){
      Scanner scanner = new Scanner(System.in);
     do{
         System.out.println("digite el codigo del producto: ");
         primerVector[i]=scanner.nextLine();
         System.out.println("digite el el valor de venta del producto: ");
         segundoVector[i]=scanner.nextDouble();
         System.out.println("digite la cantidad de productos: ");
         tercerVector[i]=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Desea ingresar otro producto? si/no");
         op=scanner.nextLine();
         if(op.toUpperCase().equals("NO")){
             op="NO";
         }
          i++;
    }while(op!="NO");  
   }
   
   //calculo el total de los productos vendidos
   public static int productoVendido(){
       for(i=0; i<20; i++){
           suma+=tercerVector[i];
       }
       return suma;
   }
   //sumo las ventas total del dia
    public static long ingresoDiario(){
        for(i=0; i<20; i++){
           suma+=segundoVector[i];
       }
        return suma;
    }
    //calculo el mas vendido
    public static int productoMasVendido(){
        int mayor = tercerVector[0];
        int posMayor=0;
    for(int i = 1; i < 20; ++i)
    {
        if(tercerVector[i] > mayor)
        {
            mayor = tercerVector[i];
            posMayor = i;
        }
    }
    return mayor;
    }
    //calculo el producto mas costoso
    public static long productoCostoso(){
            int mayor = (int) segundoVector[0];
      
    for(int i = 1; i < 20; ++i)
    {
        if(segundoVector[i] > mayor)
        {
            mayor = (int) segundoVector[i];
            cont++;
        }
    }  
    return mayor;
    }
    //muestro los resultados
    public static void mostrar(){
        System.out.println("Total productos vendidos en el día:"+productoVendido() );
        System.out.println("Total ingresos por ventas del día:"+ingresoDiario() );
        System.out.println("El producto más vendido:"+"codigo del producto"
                + ": "+primerVector[cont]+" valor de la venta: "+segundoVector[cont]
                +" cantidad de productos: "+productoMasVendido() );
        System.out.println("El producto más costoso vendido:" + productoCostoso());

    }
}
