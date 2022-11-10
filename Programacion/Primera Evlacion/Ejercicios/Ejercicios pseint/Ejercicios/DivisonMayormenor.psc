Subproceso restar <- DividirMayormenor (num1SP,num2Sp)
	Si num2>num1 Entonces
		restar=num2/num1
	SiNo
		restar=num1/num2
	FinSi
FinSubProceso
Proceso DivisonMayor
	Definir num1 Como entero;
	Definir num2 Como Entero;
	Escribir "Ingrese el número 1: ";
	Leer num1;
	Escribir "Ingrese el número 2: ";
	Leer num2;
	Escribir "La division es ", DividirMayormenor(num1,num2)
FinProceso

	