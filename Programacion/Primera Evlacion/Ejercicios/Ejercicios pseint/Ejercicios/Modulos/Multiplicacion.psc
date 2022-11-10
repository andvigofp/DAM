//Elabora el ordiograma y escribe un Pseudocódigo del Algoritmo 
//que calcule las tablas de multiplicar
SubProceso CalcularMultiplicacion ()	
	Definir n Como Entero;
	Definir x Como Entero;
	

	Para n=1 Hasta 10
		Escribir "Tabla del: ", n;
		Para x=1 Hasta 10
			Escribir n, "*", x, "=", n*x;
	
		FinPara
		Escribir "--------------"
		FinPara
	
	
	
	
Fin SubProceso

Proceso Multiplicacion
	
	CalcularMultiplicacion();
FinProceso