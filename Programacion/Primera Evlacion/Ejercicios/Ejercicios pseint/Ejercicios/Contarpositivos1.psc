//pedir 10 n�meros al usuario, y mostar cu�ntos de ellos han sido mayores de cero
Algoritmo Contarpositivos1
	Definir N Como Entero;
	Definir contador Como Entero;
	Definir aux Como Entero;
	contador <- 0;
	
	
	Para aux <- 1 Hasta 10 
		Escribir "Introduzca un n�mero:";
		Leer N;
		
		Si N > 0 Entonces
			contador <- contador + 1
		FinSI
	FinPara
	Escribir "Introduzca un n�mero mayor a 0 son:", contador ;
	
	//Mientras Decremental
	aux <- 10;
	Mientras aux > 0
		Escribir "Introduzca un n�mero:";
		Leer N;
		Si N > 0 Entonces
			contador <- contador + 1
		FinSI
		aux <- aux -1;
	FinMientras
	Escribir "Introduzca un n�mero mayor a 0 son:", contador, "n�meros positivos"  
FinAlgoritmo
