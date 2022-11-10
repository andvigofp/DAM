Algoritmo SumaEnteros
	Definir N Como Entero;
	Definir aux Como Entero;
	Definir suma Como Entero;
	
	Escribir "Introduzca un número:";
	Leer N;
	
	
	aux <- N;
	suma <- 0;
	
	Mientras aux > 0 Hacer
		suma <- suma + aux;
		aux <- aux-1;
	FinMientras
	
	Escribir suma;
FinAlgoritmo
