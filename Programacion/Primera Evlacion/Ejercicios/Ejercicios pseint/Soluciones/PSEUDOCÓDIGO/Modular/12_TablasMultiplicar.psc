//Escribir un Pseudoc�digo que calcule las tablas de multiplicar
SubProceso MostrarTablasMultiplicar()
	Definir i Como Entero;
	Definir j Como Entero;
	Para i=1 Hasta 10
		Escribir "Tabla del ", i;
		Para j=1 Hasta 10
			Escribir i, "*", j, "=", i*j;
		FinPara
		Escribir "_____________"
	FinPara
Fin SubProceso

Proceso TablasMultiplicar
	MostrarTablasMultiplicar();
FinProceso