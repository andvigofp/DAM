Algoritmo ContarPositivos
	Definir Num Como Entero;
	Definir aux Como Entero;
	Definir total Como Entero;
	// PARA
	total <- 0;	
	Para aux <- 1 Hasta 10
		Escribir "Introduzca un n�mero:";
		Leer Num;
		Si Num > 0
			total <- total + 1;
		FinSi
	FinPara
	
	
	// MIENTRAS DECREMENTAL
	aux <- 10;
	total <- 0;
	Mientras aux > 0
		Escribir "Introduzca n�mero";
		Leer Num;
		Si Num > 0
			total <- total + 1;
		FinSi
		aux <- aux - 1;
	FinMientras
	Escribir "Se han introducido ", total, " n�meros positivos."
FinAlgoritmo
