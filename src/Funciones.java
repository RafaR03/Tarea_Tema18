
public class Funciones{

   /**
    * La función `suma` toma dos enteros como entrada y devuelve la suma de los dos enteros
    * 
    * @param x El primer número a sumar.
    * @param y El número de filas en la matriz.
    * @return La suma de los dos números.
    */
    public static int suma(int x,int y) {

        return x + y;
    }
   /**
    * Esta función toma dos números enteros como parámetros y devuelve la diferencia entre ellos
    * 
    * @param r primer número
    * @param j El número de veces que el usuario ha adivinado el número.
    * @return El resultado de la operación.
    */
    public static int resta(int r,int j){
        int resta=0;
            resta= r - j;
        return resta;
    }
   /**
    * Esta función toma dos enteros como entrada y devuelve el producto de los dos enteros
    * 
    * @param k el numero del primer numero
    * @param p el numero del primer numero
    * @return El producto de los dos números.
    */
    public static int mult(int k,int p){
        return k*p;
    }
  /**
   * Esta función toma dos enteros como entrada y devuelve el cociente de los dos enteros
   * 
   * @param x el dividendo
   * @param q el numero a dividir por
   * @return El valor de la variable div.
   */
    public static int div( int x,int q){
        return x/q;
    }
/**
 * La función resto() toma dos enteros como entrada y devuelve el resto del primer entero dividido por
 * el segundo entero
 * 
 * @param e el numero a dividir
 * @param t el número de veces que se ejecutará el programa
 * @return El resto de la división de los dos números.
 */
    // Un método que devuelve el resto de la división de dos enteros.
    public static int resto(int e,int t){
        return e%t;
    }
/**
 * Toma un entero como argumento y devuelve el negativo de ese entero
 * 
 * @param r El número a ser negado.
 * @return El opuesto del número ingresado.
 */
    public static int nega(int r){
        return -r;
    }
/**
 * Esta función toma tres números como entrada y devuelve el promedio de los tres números
 * 
 * @param r el primer numero
 * @param j el primer numero
 * @param k el número de racimos
 * @return El promedio de los tres números.
 */
    public static double med(Double r,Double j, Double k){
        return (r+j+k)/3;
    }
/**
 * Toma dos números, los eleva al cuadrado, los suma y luego devuelve la raíz cuadrada de la suma
 * 
 * @param t la longitud del primer lado del triangulo
 * @param u la longitud del primer lado del triangulo
 * @return La raíz cuadrada de la suma de los cuadrados de los dos lados del triángulo.
 */
    public static Double hip(double t, double u){
        double catA=(t*t);
        double catB=(u*u);
        Math.sqrt(catA+catB);
        double res=Math.sqrt(catA+catB);
        return res;
    }
/**
 * La función `se` toma cuatro enteros como entrada y devuelve el número de segundos que han
 * transcurrido desde la medianoche
 * 
 * @param j días
 * @param k horas
 * @param p el numero de segundos en un minuto
 * @param y segundos
 * @return La suma de los segundos del tiempo.
 */
    public static int se(int j,int k,int p,int y){
        final int c1=86400, c2=3600, c3=60;
        int seg1=(j*c1);
                int seg2=(k*c2);
                int seg3=(p*c3);
                int resul= (seg1+seg2+seg3+y);
        return resul;
    
    }
 /**
  * Toma tres enteros como entrada y devuelve una cadena que contiene los tres enteros en orden
  * ascendente
  * 
  * @param nu1 el primer numero
  * @param nu2 2
  * @param nu3 3
  * @return El método está devolviendo una cadena.
  */
    public static String orden(int nu1,int nu2,int nu3) {

        String resi="";

        if((nu1<nu2)&&(nu1<nu3)){
            resi+="El mas pequeño es "+nu1+" ";
            if(nu2<nu3){
            resi+="El siguiente mas pequeño es "+nu2+" ";
            resi=resi+"El mas grande es "+nu3+"\n";
            }
            else{
                resi+="El siguiente mas pequeño es "+nu3+" ";
                resi+="El mas grande es "+nu2+"\n";
            }
        }
        else if((nu2<nu1)&&(nu2<nu3)){
            resi+="El mas pequeño es "+nu2+" ";
            if(nu1<nu3){
                resi+="El siguiente mas pequeño es "+nu1+" ";
                resi+="El mas grande es "+nu3+"\n";
                }
                else{
                    resi+="El siguiente mas pequeño es "+nu3+"";
                    resi+="El mas grande es "+nu1+"\n";
                }

        }else{

            resi+="El mas pequeño es "+nu3+" ";
            if(nu1<nu2){
                resi+="El siguiente mas pequeño es "+nu1+" ";
                resi+="El mas grande es "+nu2+"\n";   
            }
            else{
                resi+="El siguiente mas pequeño es "+nu2+" ";
                resi+="El mas grande es "+nu1+"\n";

            }
        }

        return resi;

    }
/**
 * Toma un número entero como parámetro y devuelve una cadena que dice si el número es par o impar
 * 
 * @param par El número a comprobar si es par o impar.
 * @return El método está devolviendo una cadena.
 */
    public static String p(int par){
        String po="";
        if(par % 2 ==0){
            po="El numero es par\n";
        }else{
            po="El numero es impar\n";
        }
        return po;
    }
/**
 * Si el número de horas es mayor o igual a 168, entonces el número de semanas es el número de horas
 * dividido por 168, el número de días es el resto del número de horas dividido por 168 dividido por
 * 24, y el número de horas es el resto del número de horas dividido por 168 dividido por 24 dividido
 * por 24. Si el número de horas es menor que 168, entonces el número de días es el número de horas
 * dividido por 24, y el número de horas es el resto del número de horas dividido por 24. Si el número
 * de horas es menor que 24, entonces el número de horas es el número de horas
 * 
 * @param hor el numero de horas
 * @return El método está devolviendo una cadena.
 */
    public static String o(int hor){
        String ui="";
        if (hor>=168){
            int sem= hor/168;
            int re= hor%168;
            int d= re/24;
            int h=re%24;
            ui+="Las horas son "+sem +"semanas "+d +" dias "+h +" horas\n";
        } else if(hor<168){
            int i= hor/24;
            int hh= hor%24;
            ui+="Las horas son "+i +" dias "+hh +" horas\n";
        }else if(hor<24){
            ui+="El numero que ha introducido son "+ hor +" horas\n";
        }
        return ui;
    }
/**
 * Devuelve una cadena que dice "El año que escribiste es un año bisiesto" si el año es un año
 * bisiesto, y "El año que escribiste no es un año bisiesto" si no lo es.
 * 
 * @param ano año
 * @return El método está devolviendo una cadena.
 */
    public static String i(int ano){
        String yu="";
        if((ano %400==0)&&(ano%100==0)){
            if(ano %4==0){
            yu+="El Año que ha escrito es bisiesto"+"\n";
            }   
        }
        else if((ano %100==0)&&(ano%4==0)){
            yu+="El Año que ha escrito no es bisiesto "+"\n" ;
        }
     else if(ano %4==0){
        yu+="El Año que ha escrito es bisiesto "+"\n";
    }
    else{
        yu+="El Año no es bisiesto "+"\n";
    }
    return yu;
    }
/**
 * Toma un doble como argumento y devuelve un String
 * 
 * @param ind el índice de la masa corporal
 * @return El método está devolviendo una cadena.
 */
    public static String t(double ind){
        String tu="";
        if(ind<18.5){
            tu+="Su indice de masa muscular es bajo peso"+"\n";
        }else if(ind<=24.9){
            tu="Su indice de masa muscular es normopeso"+"\n";
        }else if(ind<=26.9){
            tu="Su indice de masa muscular es Sobrepeso Grado I"+"\n";
        }else if(ind<=29.9){
            tu="Su indice de masa muscular es Sobrepeso Grado II"+"\n";
        }else if(ind<=34.9){
            tu="Su indice de masa muscular es Obesidad de tipo I"+"\n";
        }else if(ind<=39.9){
            tu="Su indice de masa muscular es Obesidad de tipo II"+"\n";
        }else if(ind<=49.9){
            tu="Su indice de masa muscular es Obesidad de tipo III(mórbida)"+"\n";
        }else if(ind>50){
            tu="Su indice de masa muscular es Obesidad de tipo IV(Extrema)"+"\n";
        }
        return tu;
    }
/**
 *     Cadena estática pública r (int numx, int fac) {
 *         Cadena pq="";
 *         for(int i=numx-1; i>0; i--){
 *             fac=fac*i;
 * 
 *          }
 *          pq="El Factorial Valdría "+ fac +"\n";
 *          volver pq;
 *     }
 * 
 * @param numx El número que ingresa el usuario.
 * @param fac es el factorial
 * @return El factorial del número ingresado.
 */
    public static String r(int numx,int fac){
        String pq="";
        for(int i= numx-1; i>0; i--){
            fac=fac*i;

         }
         pq="El Factorial valdría "+ fac +"\n";
         return pq;
    }
    
}