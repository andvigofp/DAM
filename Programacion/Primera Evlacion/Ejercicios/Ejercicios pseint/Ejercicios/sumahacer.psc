Algoritmo sumarepetir
	Definir N Como entero;
	Definir aux Como Entero;
	Definir suma como Entero;
	
	Escribir "Introduzca un número:";
	Leer N;
	
	aux<-N;
	suma<-0;
	
	
	//Repetir
	Repetir
		suma <- suma + aux;
		aux <- aux-1;
	Hasta que aux = 0;
	Escribir "La suma es ", suma;
	
	//Repetir Incremental 3
	Repetir
		suma <- suma + aux;
		aux <- aux + 1;
	Hasta que aux > N;
	Escribir "La suma es ", suma;
	
FinAlgoritmo
