//Imprimir y contar los números múltiplos de 3 desde 1 hasta un número que introduzcamos por teclado
SubProceso contarMultiplos(num)
	Definir aux, contMult Como Entero;
	aux = 1;
	contMult = 0;
	Mientras aux <= num Hacer
		Si aux mod 3 = 0 Entonces
			Escribir aux;
			contMult = contMult + 1;
		FinSi
		aux = aux + 1;
	FinMientras
	Escribir "Se han encontrado ", contMult, " múltiplos de 3.";
FinSubProceso

Proceso multiplos3
	Escribir "Introduzca un número";
	Leer num;
	contarMultiplos(num);
FinProceso
