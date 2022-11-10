//Leer desde el teclado una serie de números hasta obtener uno inferior a 100
SubProceso NumMenor100Mientras ()
	Definir Num Como Entero;
	Escribir "Introduzca un número menor que 100: ";
	Leer Num;	
	Mientras (Num>=100)
		Escribir "Introduzca un número menor que 100: ";
		Leer Num;	
	FinMientras
Fin SubProceso

SubProceso NumMenor100Repetir ()
	Repetir
		Escribir "Introduzca un número menor que 100: ";
		Leer Num;		
	Hasta Que (Num<100)
Fin SubProceso

Proceso Menor100
	NumMenor100Repetir();
FinProceso