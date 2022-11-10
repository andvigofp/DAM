SubProceso sumamedia (NSP)
	Definir media Como Entero;
	Definir suma Como Entero;
	
	media <- 0;
	suma <- 0;
	Repetir
		suma <- suma + media;
		media <- media + 1;
		
Hasta Que media < NSP;
Escribir suma;
	
FinSubProceso

Proceso EnteroP
	Definir NP Como Entero;
	Escribir "Introduzca un número:";
	Leer NP;
	Definir NP Como Entero;
	Escribir "Introduzca un número:";
	Leer NP;
	Sumamedia(NP);
FinProceso
