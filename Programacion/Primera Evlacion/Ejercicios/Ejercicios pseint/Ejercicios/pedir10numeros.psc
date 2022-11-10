//pedir 10 números al usuario, y mostar cuántos de ellos han sido mayores de cero
Algoritmo Contarpositivos
	Definir N Como Entero;
	Definir contador Como Entero;
	Definir aux Como Entero;
	contador = 0;
	
	
	Para aux <- 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Introduzca un número:";
		Leer N;
		
		Si N > 0 Entonces
			contador = contador+1
			FinSI
	FinPara
	Escribir "Introduzca un número mayor a 0 son:", contador ;
	
FinAlgoritmo
