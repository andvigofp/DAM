//Elabora el ordinograma y escribe un Pseudoc�digo de un algoritmo 
//que permita adivinar  un n�mero. La aplicaci�n genera un n�mero aleatorio del 1 al 100
//A continuaci�n va pidiendo n�meros y va respondiendo si el n�mero a adivinar
//es mayor o menor que el introducido, adem�s de los intentos que te quedan
//(tienes 10 intentos para acertarlo). El programa termina cuando se acierta el
//n�mero (adem�s te dice en cu�ntos intentos lo has acertado), si se llega al
//l�mite de intentos te muestra el n�mero que hab�a generado
SubProceso adibinar ()	
	Definir n Como Entero;
	Definir solucion Como Entero;
	Definir numeroIntentos Como Entero;
	
	
	
	solucion= Aleatorio(1,10)
	Escribir "Escribe un n�mero "	
	Leer n;
	
	
	Hacer
		Escribir "Numero de intento "
		Si no
		
		FinSi
		
	Hasta Que n=solucion o numeroIntentos>10

Fin SubProceso

Proceso advininaraletorio
	adibinar();
FinProceso
