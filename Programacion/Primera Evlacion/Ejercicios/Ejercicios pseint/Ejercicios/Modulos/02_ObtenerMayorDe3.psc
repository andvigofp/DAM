//Escribir Pseudoc�digo que lea de entrada 3 n�meros y que indique cu�l es el mayor de ellos.
SubProceso ObtenerMayor (num1, num2, num3)
	Si num1>num2 y num1>num3 Entonces
		Escribir "El mayor es: ", num1;
	SiNo
		Si num2>num1 y num2>num3 Entonces
			Escribir "El mayor es: ", num2;
		SiNo
			Escribir "El mayor es: ", num3;
		FinSi
	FinSi
Fin SubProceso

Proceso MayorNumero
	Definir N1 Como Entero;
	Definir N2 Como Entero;
	Definir N3 Como Entero;
	Escribir "Ingrese el n�mero 1: ";
	Leer N1;
	Escribir "Ingrese el n�mero 2: ";
	Leer N2;
	Escribir "Ingrese el n�mero 3: ";
	Leer N3;
	ObtenerMayor(N1, N2, N3);
FinProceso