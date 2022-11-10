Algoritmo sumapara
	Definir N Como Entero;
	Definir aux Como Entero;
	Definir suma Como Entero;
	
	Escribir "Introduzca un número:";
	Leer N;
	
	
	aux <- N;
	suma <- 0;
	
	Para aux <- 1 Hasta N Con Paso 1 Hacer
			suma <- suma + aux;
		FinPara 
	
	Escribir suma;
	
FinAlgoritmo
