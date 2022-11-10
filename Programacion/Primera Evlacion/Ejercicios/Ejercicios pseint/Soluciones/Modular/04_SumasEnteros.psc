SubProceso SumaEnteros (NSP)
	
	Definir aux Como Entero;
	Definir suma Como Entero;
	
	// REPETIR INCREMENTAL
	aux <- 0;
	suma <- 0;
	Repetir
		suma <- suma + aux;
		aux <- aux + 1;
	Hasta Que aux > NSP;
	
	Escribir suma;
	
FinSubProceso

Proceso EnteroP
	Definir NP Como Entero;
	Escribir "Introduzca un número:";
	Leer NP;
	SumaEnteros(NP);
FinProceso
