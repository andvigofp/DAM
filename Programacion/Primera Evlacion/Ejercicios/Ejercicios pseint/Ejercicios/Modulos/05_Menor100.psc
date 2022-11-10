SubProceso Menor100 (NumSP)
	Escribir "Introduzca menor que 10";
	Leer NumSP;
	// Mientras
	Mientras NumSP >= 10 Hacer
		Escribir "Introduzca menor que 10";
		Leer NumSP;
	FinMientras
FinSubProceso

Proceso Menor100SP
	Definir NumP Como Entero;
	Escribir "Introduzca menor que 10";
	Leer NumP;
	Menor100(NumP);
FinProceso

	