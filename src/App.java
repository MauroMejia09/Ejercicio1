public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, nuevamente yo, haciendo pruebas!");
          
        //**Variables de numeros**
        int numero1 = 10; //Numeros enteros
        float numero2 = 20.12345678910111213f; //Como yo lo entiendo, numeros enteros y se permiten decimales, sin embargo tiene un limite de decimales, es decir, no permite muchos decimales, por eso se usa double
        double numero3 = 10.12345678910111213; //Numeros decimales, en este caso, permite muchos decimales, es decir, es mas preciso que float
        System.out.println("Int: " + numero1);
        System.out.println("Float: " + numero2);
        System.out.println("Double: " + numero3);

        //**Variables de texto**
        String NombreconSaltos = "Juanes\tPerez";
        String NombreconSaltos2 = "Gabriel\tMauricio";
        System.out.println(NombreconSaltos);
        System.out.println(NombreconSaltos2);
            //Todo esto simplemente es texto, algo sencillo, los \t son tipos de caracteres especiales que permiten dar un salto de linea, o tabular el texto, en este caso es tabularlo.


        //Operaciones matematicas basicas
       int a = 10;
       double b = 3.5;
       var resultado = a / b;
       System.out.println("Resultado: " + resultado);

       //Jerarquia de operaciones matematicas
         int resultado2 = (10 + 5) * 2;
                            //Primero se resuelve lo que esta dentro de los parentesis, y luego realiza la multiplicacion.
                            //Esta jerarquia es algo matematico
        System.out.println("Resultado Jerarquia: " + resultado2);


        //Autoincrementables
        int numeropersona1 = 30;
        ++numeropersona1;
        System.out.println("Incremento de numero: " + numeropersona1);


    }
}
