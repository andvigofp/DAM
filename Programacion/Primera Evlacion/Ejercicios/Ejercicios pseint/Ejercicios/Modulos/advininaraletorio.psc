//Elabora el ordinograma y escribe un Pseudocódigo de un algoritmo 
//que permita adivinar  un número. La aplicación genera un número aleatorio del 1 al 100
//A continuación va pidiendo números y va respondiendo si el número a adivinar
//es mayor o menor que el introducido, además de los intentos que te quedan
//(tienes 10 intentos para acertarlo). El programa termina cuando se acierta el
//número (además te dice en cuántos intentos lo has acertado), si se llega al
//límite de intentos te muestra el número que había generado
SubProceso adibinar ()	
	Definir n Como Entero;
	Definir solucion Como Entero;
	Definir numeroIntentos Como Entero;
	
	
	
	solucion= Aleatorio(1,10)
	Escribir "Escribe un número "	
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
