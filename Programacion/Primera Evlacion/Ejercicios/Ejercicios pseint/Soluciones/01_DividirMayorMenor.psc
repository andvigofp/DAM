Algoritmo DividirMayorMenor
	//Escribir Pseudoc�digo que dados 2 valores de entrada 
	//imprima siempre la divisi�n del mayor entre el menor.�
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir res Como Entero;
	
	Escribir "Ingrese el n�mero 1: ";
	Leer num1;
	Escribir "Ingrese el n�mero 2: ";
	Leer num2;

//	Si num2>num1 Entonces
//		res=num2/num1;
//	SiNo
//		res=num1/num2;
//	FinSi
//	Escribir "La divisi�n es ", res;
	
	Si num2>num1 Entonces
		Escribir "La divisi�n es ", num2/num1;
	SiNo
		Escribir "La divisi�n es ", num1/num2;
	FinSi

FinAlgoritmo
