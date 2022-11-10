SubProceso Menor100 (NumSP)
	Escribir "Introduzca menor que 10";
	Leer NumSP;
	// Repetir
	Repetir 
		Escribir "Introduzca menor que 10";
		Leer NumSP;
	Hasta Que NumSP < 10;
FinSubProceso

Proceso Menor100SP
	Definir NumP Como Entero;
	Escribir "Introduzca menor que 10";
	Leer NumP;
	Menor100(NumP);
FinProceso

	