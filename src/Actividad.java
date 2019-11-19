
import java.util.Scanner;


//Ejercicio de FOR 


//Variables 
public class Actividad {
    int numero1;
    int numero2;
    

//Constructor
public Actividad() {
    this.numero1 = 0;
    this.numero2 = 0;
} 
        
//Metodo Mostrar resultado de 1 a 100
public void Actividad1(){
    //Bucle
    for (int i = 0;i<= 100; i++){
    
    if (i%1==0){
        System.out.println(i);
    
    }
    
    }

}


//Metodo Mostrar los 30 numeros naturales
public void Actividad2(){

    for (int i = 0;i <=30; i++){
    
    if (i%1==0){
        System.out.println(i);
    }
    
    }


}
 //Metodo Mostrar los numeros impares
public void Actividad3(){

    for (int i = 0;i <=30; i++){
    
        if (i % 2 ==0)
      ;
        else
      System.out.println(i + " es IMPAR ");
    
    }


}



//Scanner
Scanner Datos = new Scanner (System.in);
Scanner Datos1 = new Scanner (System.in);
Scanner Datos2 = new Scanner (System.in);
Scanner Datos3 = new Scanner (System.in);
Scanner Datos4 = new Scanner (System.in);
//Metodo para introducir datos para la Actividad4
  public void introducir1(){
         System.out.println("Introduce el primer numero");        
         this.numero1 = Datos.nextInt();
         System.out.println("Introduce el Segundo numero");        
         this.numero2 = Datos.nextInt();

  
  }


//Metodo Mostar si los numeros son iguales o no 
public void Actividad4(){
    
    if (numero1 == numero2)
      System.out.println(numero1 +" "+numero2+" "+"Son iguales");
    
    else System.out.println("no son iguales");

}

//Metodo para introducir datos para la Actividad5
  public void introducir2(){
         System.out.println("Introduce el primer numero");        
         this.numero1 = Datos1.nextInt();
         System.out.println("Introduce el Segundo numero");        
         this.numero2 = Datos1.nextInt();

  
  }

//Metodo Mostar si los numeros son iguales y si no muestrame el rango
public void Actividad5(){
      
    if (numero1 == numero2){
      System.out.println(numero1 +" "+numero2+" "+"Son iguales");
    
    }else if( numero2 > numero1 ) {
        for (int i = numero1;i < numero2; i++){
        System.out.println(i);} 
    
    }else{
             for (int i = numero2;i < numero1; i++){
                    System.out.println(i);}   
                
                
                }
}

//Metodo para introducir Datos
  public void introducir3(){
         System.out.println("Introduce el numero");        
         this.numero1 = Datos2.nextInt();
  }
//Metodo Actividad6 Para decir si es Impar o par el numero
  public void Actividad6() {
  
    if (numero1 % 2 ==0)
      System.out.println(numero1 + " es PAR ");
        else
      System.out.println(numero1 + " es IMPAR ");
      


}
//Ejercicio de Switch
  
 //Metodo para introducir Datos
  public void introducir4(){
         System.out.println("Introduce el numero del mes");        
         this.numero1 = Datos3.nextInt();
  } 
 //Metodo para decir que me es correspodiente numero
public void ActividadSw1(){
    switch (numero1) {
          case 1:
              System.out.println("Enero");
              break;
              case 2:
              System.out.println("Febrero");
              break;
              case 3:
              System.out.println("Marzo");
              break;
              case 4:
              System.out.println("Abril");
              break;
              case 5:
              System.out.println("Mayo");
              break;
              case 6:
              System.out.println("Junio");
              break;
              case 7:
              System.out.println("Julio");
              break;
              case 8:
              System.out.println("Agosto");
              break;
              case 9:
              System.out.println("Septiembre");
              break;
              case 10:
              System.out.println("Octubre");
              break;
              case 11:
              System.out.println("Noviembre");
              break;
              case 12:
              System.out.println("Diciembre");
              break;
          default:
              throw new AssertionError();
      }

}

 //Metodo para introducir Datos
    public void introducir5(){
         System.out.println("Introduce el numero");        
         this.numero1 = Datos4.nextInt();
  } 
 //Metodo para decir que me es correspodiente numero
public void ActividadSw2(){
    switch (numero1) {
          case 1:
              System.out.println("Enero");
              break;
              case 2:
              System.out.println("Febrero");
              break;
              case 3:
              System.out.println("Marzo");
              break;
              case 4:
              System.out.println("Abril");
              break;
              case 5:
              System.out.println("Mayo");
              break;
              case 6:
              System.out.println("Junio");
              break;
              case 7:
              System.out.println("Julio");
              break;
              case 8:
              System.out.println("Agosto");
              break;
              case 9:
              System.out.println("Septiembre");
              break;
              case 10:
              System.out.println("Octubre");
              break;
              case 11:
              System.out.println("Noviembre");
              break;
              case 12:
              System.out.println("Diciembre");
              break;
          default:
              throw new AssertionError();
      }
    
    

}
        









}



    
    
    

