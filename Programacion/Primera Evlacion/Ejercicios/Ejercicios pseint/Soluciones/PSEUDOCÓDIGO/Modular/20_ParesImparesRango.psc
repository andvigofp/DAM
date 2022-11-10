// Introducir 2 números por teclado. Imprimir los números que hay entre ambos, contar cuántos hay y cuántos son pares. 
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
	
	Escribir "El producto de los números impares es: ", prodImpares;
	Escribir "Se han encontrado ", contPares, " números PARES en ese rango.";
	Escribir "Se han encontrado ", cont, " números en ese rango.";
FinSubProceso

Proceso ParesImpares
	Escribir "Introduzca número 1";
	Leer num1;
	Escribir "Introduzca número 2";
	Leer num2;
	ParesImparesRango(num1, num2);
FinProceso
