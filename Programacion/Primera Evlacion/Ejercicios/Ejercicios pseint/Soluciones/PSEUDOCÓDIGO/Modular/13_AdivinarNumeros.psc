//Escribir un Pseudocódigo permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. 
//A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
//además de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el 
//número (además te dice en cuántos intentos lo has acertado), si se llega al límite de intentos te muestra el número que 
//había generado.
SubProceso AdivinarNumero ()	
	Definir num Como Entero;
	Definir solucion Como Entero;
	Definir numIntentos Como Entero;
	solucion=Aleatorio(1,100);
	Escribir solucion
	numIntentos<-1;
	Hacer
		Escribir "Ingrese un número entre 1 y 100: ";
		Leer num;
		Si num > solucion
			Escribir "El número introducido es mayor que la solución"
		SiNo
			Si num<solucion
				Escribir "El número introducido es menor que la solución"
			SiNo
				Escribir "Ha acertado la solución!!!"
			FinSi
		FinSi
		Escribir "Le quedan ", 10-numIntentos, " intentos para adivinar"
		numIntentos=numIntentos+1;
	Hasta Que num=solucion o numIntentos>10
	
	Si num=solucion
		Escribir "Lo has adivinado en ", numIntentos-1, " intentos"
	SiNo
		Escribir "El número a adivinar era ", solucion;
	FinSi
Fin SubProceso

Proceso AdivinarNumeros
	AdivinarNumero();
FinProceso