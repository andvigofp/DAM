//Escribir un Psec�digo que calcule el factorial de un n�mero
Algoritmo factorial
	Definir N Como Entero;
	Definir aux Como Entero;
	Definir multi Como Entero;
	
	
	Escribir "Introduzca un n�mero:";
	Leer N;

	multi <- 1;
	Para aux <- 1 Hasta N Con Paso 1 
		multi <- aux * multi;
	FinPara 
	
	Escribir " Multiplicaci�n de N ",N, " es ", multi;
FinAlgoritmo



