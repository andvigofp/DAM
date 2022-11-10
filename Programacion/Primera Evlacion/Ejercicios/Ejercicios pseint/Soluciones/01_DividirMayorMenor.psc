Algoritmo DividirMayorMenor
	//Escribir Pseudocódigo que dados 2 valores de entrada 
	//imprima siempre la división del mayor entre el menor. 
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir res Como Entero;
	
	Escribir "Ingrese el número 1: ";
	Leer num1;
	Escribir "Ingrese el número 2: ";
	Leer num2;

//	Si num2>num1 Entonces
//		res=num2/num1;
//	SiNo
//		res=num1/num2;
//	FinSi
//	Escribir "La división es ", res;
	
	Si num2>num1 Entonces
		Escribir "La división es ", num2/num1;
	SiNo
		Escribir "La división es ", num1/num2;
	FinSi

FinAlgoritmo
