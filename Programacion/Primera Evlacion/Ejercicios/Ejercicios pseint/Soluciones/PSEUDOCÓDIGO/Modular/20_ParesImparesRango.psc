// Introducir 2 n�meros por teclado. Imprimir los n�meros que hay entre ambos, contar cu�ntos hay y cu�ntos son pares. 
// Calcular el producto de los impares
SubProceso ParesImparesRango (num1, num2)
	Definir prodImpares, contPares, aux, cont Como Entero;
	prodImpares = 1;
	cont = 0;
	contPares = 0;
	
	Para aux = num1 + 1 Hasta num2 - 1 Hacer
		cont = cont + 1;
		Si aux mod 2 = 0 Entonces
			contPares = contPares + 1;
		SiNo
			prodImpares = prodImpares * aux;
		FinSi
		Escribir aux;
	FinPara
	
	Escribir "El producto de los n�meros impares es: ", prodImpares;
	Escribir "Se han encontrado ", contPares, " n�meros PARES en ese rango.";
	Escribir "Se han encontrado ", cont, " n�meros en ese rango.";
FinSubProceso

Proceso ParesImpares
	Escribir "Introduzca n�mero 1";
	Leer num1;
	Escribir "Introduzca n�mero 2";
	Leer num2;
	ParesImparesRango(num1, num2);
FinProceso
