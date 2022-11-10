//Escribir un Psecódigo que calcule el factorial de un número
Algoritmo factorial
	Definir N Como Entero;
	Definir aux Como Entero;
	Definir multi Como Entero;
	
	
	Escribir "Introduzca un número:";
	Leer N;

	multi <- 1;
	Para aux <- 1 Hasta N Con Paso 1 
		multi <- aux * multi;
	FinPara 
	
	Escribir " Multiplicación de N ",N, " es ", multi;
FinAlgoritmo



