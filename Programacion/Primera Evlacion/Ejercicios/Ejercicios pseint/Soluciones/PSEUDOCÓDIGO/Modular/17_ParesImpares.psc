// Dados 10 n�meros enteros que se ingresan por teclado, 
// calcular cu�ntos de ellos son pares, cu�nto suman los pares, 
// el promedio de los impares y la suma total
SubProceso SumasParesImpares
	Definir suma, sumaPares, sumaImpares, contImpares, contPares, aux, num Como Entero;
	sumaPares = 0;
	sumaImpares = 0;
	contImpares = 0;
	contPares = 0;
	suma = 0;
	
	Para aux = 1 Hasta 10 Hacer
		Escribir "Introduzca un n�mero";
		Leer num;
		suma = suma + num;
		Si num mod 2 = 0 Entonces
			sumaPares = sumaPares + num;
			contPares = contPares + 1;
		SiNo
			sumaImpares = sumaImpares + num;
			contImpares = contImpares + 1;	
		FinSi
	FinPara
	
	Escribir "La media de los n�meros impares es: ", sumaImpares/contImpares;
	Escribir "La suma de los n�meros pares es: ", sumaPares;
	Escribir "Se han introducido ", contPares, " n�meros pares.";
	Escribir "La suma total es: ", suma;
	
FinSubProceso
Proceso ParesImpares
	SumasParesImpares();
FinProceso
