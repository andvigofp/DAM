//Escribir un Pseudoc�digo permita adivinar un n�mero. La aplicaci�n genera un n�mero aleatorio del 1 al 100. 
//A continuaci�n va pidiendo n�meros y va respondiendo si el n�mero a adivinar es mayor o menor que el introducido,
//adem�s de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el 
//n�mero (adem�s te dice en cu�ntos intentos lo has acertado), si se llega al l�mite de intentos te muestra el n�mero que 
//hab�a generado.
SubProceso AdivinarNumero ()	
	Definir num Como Entero;
	Definir solucion Como Entero;
	Definir numIntentos Como Entero;
	solucion=Aleatorio(1,100);
	Escribir solucion
	numIntentos<-1;
	Hacer
		Escribir "Ingrese un n�mero entre 1 y 100: ";
		Leer num;
		Si num > solucion
			Escribir "El n�mero introducido es mayor que la soluci�n"
		SiNo
			Si num<solucion
				Escribir "El n�mero introducido es menor que la soluci�n"
			SiNo
				Escribir "Ha acertado la soluci�n!!!"
			FinSi
		FinSi
		Escribir "Le quedan ", 10-numIntentos, " intentos para adivinar"
		numIntentos=numIntentos+1;
	Hasta Que num=solucion o numIntentos>10
	
	Si num=solucion
		Escribir "Lo has adivinado en ", numIntentos-1, " intentos"
	SiNo
		Escribir "El n�mero a adivinar era ", solucion;
	FinSi
Fin SubProceso

Proceso AdivinarNumeros
	AdivinarNumero();
FinProceso