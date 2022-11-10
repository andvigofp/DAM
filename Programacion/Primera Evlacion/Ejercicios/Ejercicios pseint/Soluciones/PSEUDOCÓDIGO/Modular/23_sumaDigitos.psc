// Dado un número determinar la suma de sus dígitos
SubProceso sumarDigitos (n)
	Definir resto, suma Como Numero;
	suma = 0;
	Mientras n<>0 Hacer
		resto = trunc(n - trunc(n/10) * 10);
		suma = suma + resto;
		n = n/10;
	FinMientras
	Escribir suma;
FinSubProceso

Proceso sumaDigitos
	Definir num Como Numero;
	Escribir "Introduzca el número";
	Leer num
	sumarDigitos(num);
FinProceso
