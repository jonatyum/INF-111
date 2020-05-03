package pruebas;

import java.util.Scanner;
/***********Dado un lote llevar el ultimo digito de cada
			numero dado al siguiente numero,
			y del ultimo numero a el primero*****************/
/*Ejemplo
Entrada:
	3
	123 456 789
Salida:
	453, 786, 129
*/
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//Se Lee el N
		int y = 0,x,cx=0;	//Varialbles que nos serviran en el proceso
		// y : guardamos el ultimo digito
		// x : el numero del lote que leeremos N veces
		// cx: una copia de x para no perder el primer dato del lote
		for (int i = 0; i < n; i++) { // un for habitual para leer y procesar los N datos del lote
			x = sc.nextInt();	//cada dato del lote se guarda en x
			if(i != 0) {	// Solo se procesara dentro del IF si no es la primera vez
				
				int c = x % 10;	// Sacamos el ultimo digito para el siguiente dato del lote
				x = x / 10;	// Eliminamos su ultimo digito para reemplazarlo
				x = x * 10; // Multiplicamos por 10 para agregar un espacio a la derecha del numero
				x = x + y;	// Adicionamos el ultimo digito del dato anterior del lote 
				y = c; // Actualizamos el ultimo digito para la siguiente iteracion
				System.out.print(x+", "); // Imprimimos el nuevo valor de x
				
			}
			else {	// Unicamente cuando sea el primer dato del lote
				cx = x;	//guardamos una copia de x
				y = x % 10;	//en y obtenemos el ultimo digito
			}
		}
		// Como el primer dato del lote no fue procesado lo hacemos al final
		cx = cx / 10;	//Eliminamos el ultimo digito de la copia del primer dato
		cx = cx * 10;	//Multiplicamos por 10 para adicionar un espacion a la derecha del numero
		cx = cx + y;	//Agregamos el digito del ultimo dato del lote
		System.out.print(cx);	//Imprimimos el primer dato modificado del lote al ultimo
	}

}
