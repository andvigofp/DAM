// Algoritmo que imprima el mayor y el menor n�mero de una serie de n�meros introducidos por teclado(-1 para salir)
SubProceso mayorMenorSerie
	Definir numMayor, numMenor, num Como Entero;
	numMayor = 0;
	numMenor = 99999;
	
	Mientras num <> -1 Hacer
		Escribir "Introduzca n�mero";
		Leer num;
		Si num <> -1 Entonces
			Si num > numMayor Entonces
				numMayor = num;
			SiNo
				Si num < numMenor Entonces
					numMenor = num;
				FinSi
			FinSi
		FinSi
	FinMientras
	Escribir "El mayor es: ", numMayor, " y el menor: ", numMenor;
FinSubProceso

Proceso mayorMenor
	mayorMenorSerie();
FinProceso
