import java.util.Scanner;
public class Ahorcado {
public static void main    /* Comentario*/  (String[] args) {
Integer a;
Integer b;
Integer opcion;
Integer resultado;
do{
System.out.println("Ingrese su operación /n 1 para sumar /n 2 para
restar /n 3 para multiplicar /n 4 para dividir");
opcion = teclado.next();
}while(opcion < 1 && opcion > 4)
System.out.println("Ingrese el primer numero");
a = teclado.next();
System.out.println("Ingrese el segundo numero");
b = teclado.next();
switch(opcion){
case 1:
resultado = sumar(a,b);
break;
case 2:
resultado = resta(a,b);
break;
case 3:
resultado = multiplicar(a, b);
break;
default:
resultado = dividir(a, b);
break;
System.out.println("El resultado es " + resultado.toString());
}
}

private Integer sumar (Integer x, Integer y){
    Integer suma = x + y;
    return suma;
}

private Integer restar (Integer x, Integer y){
    Integer resta = x - y;
    return resta;
}

private Integer multiplicar (Integer x, Integer y){
    Integer resultado = x * y;
    return resultado;
}
private Integer division (Integer x, Integer y){
    Integer resultado = x / y;
    return resultado;
}
}