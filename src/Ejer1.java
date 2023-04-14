import java.util.Scanner;

public class Ejer1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int numero=0;
        Scanner lectura = new Scanner(System.in);
        //TODO Abro el bucle Do.
        //? Que pasa si el usuario pone otro número
    do{
        //Abro el menú 
        System.out.println("1-Es Suma/Resta/Multiplicación/División/Resto ");
        System.out.println("2-Es un Cambio de Signo ");
        System.out.println("3-Es una Media Aritmetica ");
        System.out.println("4-Es averiguar la hipotenusa de un triangulo ");
        System.out.println("5-Es pasar dias, horas, minutos y segundos a segundos ");
        System.out.println("6-Es un orden numerico creciente ");
        System.out.println("7-Es saber si es un numero par o impar ");
        System.out.println("8-Pasar horas a semanas, dias y horas ");
        System.out.println("9-Saber si es un Año bisiesto o no lo es");
        System.out.println("10-Averiguar tu indice de masa muscular y saber en que peso estas ");
        System.out.println("11-Averiguar el factorial de un numero ");

        System.out.print("Introduzca el numero que quiera dependiendo de la operacion que quiera realizar ");
        numero = lectura.nextInt();
        System.out.println();

        //? Puede usarse otro bucle en vez del while
        //TODO Abro el Switch.
        switch( numero )        
        {
                //TODO Este es el caso en el que se saldria salir del programa
                case 0:
                System.out.print("SALDRAS DEL PROGRAMA"+"\n");
                break;
            //TODO Muy importante la definición de la variables en cada programa
            case 1:
            //El caso de las operaciones matematicas
            int num1=0;
            int num2=0;
            System.out.print("Introduzca el primer numero para realizar las operaciones matematicas ");
            //Pide el primer numero
        num1 = lectura.nextInt();
        System.out.print("Introduzca el primer numero para realizar las operaciones matematicas ");
             //Pide el Segundo numero
        num2 = lectura.nextInt();
             //Realiza todas las operaciones
        int suma= Funciones.suma(num1, num2);
        int resta=Funciones.resta(num1, num2);
        int mult=Funciones.mult(num1,num2);
        int div= Funciones.div(num1,num2);
        int resto=Funciones.resto(num1,num2);

            //Muestra todos los resultados
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la multiplicación es "+mult);
        System.out.println("El resultado de la división es "+div);
        System.out.println("El resultado del resto es "+resto);
            break;
        //?Funcionaria si usas un número negativo
            case 2:
            int neg=0;
        //El ordenador pide el numero que se la dara la vuelta
        System.out.print("Introduzca el numero al que se le dara la vuelta ");
        neg = lectura.nextInt();
        int opuesto=Funciones.nega(neg);
        //El ordenador realiza la operacion de darle la vuelta a el numero 
        System.out.println("El opuesto sera: "+ opuesto +"\n");
        break;

            //?Hbaria alguna orden que hiciera la media directamente.
        case 3:
                double numero1=0;
             //El ordenador pide el primer numero
            System.out.print("Escriba el primer numero de la media aritmetica " );
                numero1 = lectura.nextDouble();
            double numero2=0;
            //El ordenador pide el segundo numero
             System.out.print("Escriba el segundo numero de la media aritmetica " );
                 numero2 = lectura.nextDouble();
            double numero3=0;
            //El ordenador pide el tercer numero 
            System.out.print("Escriba el tercer numero de la media aritmetica " );
                numero3 = lectura.nextDouble();
            double med=Funciones.med(numero1,numero2,numero3);
           //El ordenador muestra el resultado
                System.out.println("El resultado de la media aritmetica "+med+"\n");
            break;

            //?Habria otra maner de hacer la hipotenusa con una cuenta directa
                case 4:
                double cat1=0;;
        //El ordenador pide el primer cateto
            System.out.print("Escriba el valor del cateto 1 " );
            cat1= lectura.nextDouble();
            double cat2=0;
        //El ordenador pide el segundo cateto
                 System.out.print("Escriba el valor del cateto 2 " );
                    cat2= lectura.nextDouble();
         //El ordenador realiza la operacion
                Double res=Funciones.hip(cat1,cat2);
        //El ordenador muestra el resultado
            System.out.println("La hipotenusa del triangulo vale "+res+"\n");

            break;
            //TODO Importante la definicion de constantes en este metodo que e usado.
        case 5:
                //Establezco la variables fijas 
                int di=0;
                      //El ordenador pide los dia que pasara a segundos
                System.out.print("Escriba los dias que quiera pasar a segundos " );
                di= lectura.nextInt();
                int ho=0;
                    //El ordenador pide las horas que pasara a segundos
                System.out.print("Escriba las horas que quiera pasar a segundos " );
                ho= lectura.nextInt();
                int mi=0;
                 //El ordenador pide los minutos que pasara a segundos
                System.out.print("Escriba los minutos que quiera pasar a segundos " );
                mi= lectura.nextInt();
                 //El ordenador pide los segundos que añadir
                System.out.print("Escriba los segundos que quiera añadir " );
                int se=0;
                se= lectura.nextInt();
                //El ordenador realiza las operaciones
                int resul=Funciones.se(di, ho, mi, se);
                System.out.println("Los dias,horas,minutos y segundos son "+ resul +" segundos"+"\n");
                break;
            //?Se podria hacer de otra manera mas simplificada 
                case 6:
                int nu1=0;
                System.out.print("Introduzca el primer numero para ordenarlo en orden creciente ");
                     //Pide el primer numero
                nu1 = lectura.nextInt();
                int nu2=0;
                System.out.print("Introduzca el primer numero para ordenarlo en orden creciente ");
                     //Pide el segundo numero
                nu2 = lectura.nextInt();
                int nu3=0;
                System.out.print("Introduzca el primer numero para ordenarlo en orden creciente ");
                     //Pide el tercer numero
                nu3 = lectura.nextInt();
                     //El ordenador empieza a emparejar dependiendo del resultado
                String resi=Funciones.orden(nu1, nu2, nu3);
                System.out.println(resi);
                break;
                //?Se podria hacer de manera directa el averiguar si es par o no.
                case 7:
                System.out.print("Escriba el numero que quiera que averigue si es par o impar " );
                 //Pide el primer numero
                int par=0;
                par= lectura.nextInt();
                //El ordenador empieza a emparejar dependiendo del resultado
               String po=Funciones.p(par);
               System.out.println(po);
                break;
                case 8:
                    System.out.print("Escriba el numero de horas que quiera pasar a semanas, dias, horas ");
                      //Pide el primer numero
                    int hor=0;
                   //El ordenador empieza a emparejar dependiendo del resultado
                    hor= lectura.nextInt();
                   String ui=Funciones.o(hor);
                   System.out.println(ui);
                    break;
                //TODO Importante buscar los diferentes casos en lo que se el año bisiesto
                 case 9:
                    System.out.print("Escriba el año del que quiera saber si es bisiesto " );
                    int ano=0;
                      //Pide el primer numero
                    ano=lectura.nextInt();
                      //El ordenador empieza a emparejar dependiendo del resultado
                    String yu=Funciones.i(ano);
                    System.out.println(yu);
                    
                break;
                //?Habra alguna orden que haga mas simple el IMD
                case 10:
                    System.out.print("Escriba su altura en metros " );
                    //Pide el primer dato
                    double alt=0.0;
                    alt=lectura.nextDouble();
                    System.out.print("Escriba su peso en kilogramos ");
                    //Pide el segundo dato
                    double kilo=0.0;
                    kilo=lectura.nextDouble();
                     //El ordenador ejecuta la operación
                    double ind=kilo/(alt*alt);
                     //El ordenador empieza a emparejar dependiendo del resultado
                    String tu=Funciones.t(ind);
                    System.out.println(tu);
                    break;
                    //TODO Importante haberse informado antes de lo que es un factorial.
                        case 11:
                    System.out.print("Escriba el numero del que quiera que se haga el factorial " );
                    int fac=0, numx=0;
                        //El ordenador pide el numero que factorizara
                    numx=lectura.nextInt();
                    fac= numx;
                    String pq=Funciones.r(numx, fac);
                    System.out.println(pq);
                    break;
                    default: 
                    //Caso en el cual se llegara al error
                    System.out.print("ERROR DEL PROGRAMA INTRODUZCA UN NUMERO DEL 1 AL 11"+"\n");//! Aquí el programa reconoce un error y pide que le des otro numero

                    }  //Cierre del bucle do y comienza el While  
                }while(numero !=0); 
                lectura.close();    

        
}
}

