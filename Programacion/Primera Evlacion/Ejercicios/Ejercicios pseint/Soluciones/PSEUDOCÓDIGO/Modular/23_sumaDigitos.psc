// Dado un n�mero determinar la suma de sus d�gitos
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
	Escribir "Introduzca el n�mero";
	Leer num
	sumarDigitos(num);
FinProceso
