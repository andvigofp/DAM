//Escribir Pseudoc�digo que dados 2 valores de entrada 
//imprima siempre la divisi�n del mayor entre el menor.�
SubProceso res <- DividirMayorMenor (num1, num2)
	Si num2>num1 Entonces
		res=num2/num1;
	SiNo
		res=num1/num2;
	FinSi
Fin SubProceso

Proceso DivisionMayor
	Definir N1 Como Entero;
	Definir N2 Como Entero;
	Escribir "Ingrese el n�mero 1: ";
	Leer N1;
	Escribir "Ingrese el n�mero 2: ";
	Leer N2;
	Escribir "La divisi�n es ", DividirMayorMenor(N1,N2);
FinProceso