SubProceso SumaEnteros (NSP)
	
	
	
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
	Definir auxP Como Entero;
	Definir sumaP Como Entero;
	
	Escribir "Introduzca un n�mero:";
	Leer NP;
	SumaEnteros(NP);
FinProceso
