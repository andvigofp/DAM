//Escribir un Pseudoc�digo que calcule el factorial de un n�mero
Algoritmo Factorial
	Definir Num Como Entero;
	Definir aux Como Entero;
	Escribir "Ingrese el n�mero: ";
	Leer Num;
	aux <- Num-1;
	facto <- Num;
	Hacer
		facto <- facto * aux;
		aux <- aux -1;
	Hasta Que aux = 1
	Escribir "El factorial de ", Num, " es: ", facto;
FinAlgoritmo
