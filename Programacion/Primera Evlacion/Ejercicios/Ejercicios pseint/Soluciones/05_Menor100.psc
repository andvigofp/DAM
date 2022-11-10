//Leer desde el teclado una serie de números hasta obtener uno inferior a 100
Algoritmo Menor10
	Definir Num Como Entero;
	
	// MIENTRAS
	//Num <- 11;
	Escribir "Introduzca menor que 10";
	Leer Num;
	
	Mientras Num >= 10 Hacer
		Escribir "Introduzca menor que 10";
		Leer Num;
	FinMientras
	
	// Repetir
	Repetir 
		Escribir "Introduzca menor que 10";
		Leer Num;
	Hasta Que Num < 10;
FinAlgoritmo
