//Dados 10 n�meros enteros que se ingresan por teclado,
//calcular cu�ntos de ellos son pares, cu�nto suman ellos
//y el promedio de los impares


SubProceso numerodados()
	
	Definir aux Como Entero;
	Definir num Como Entero;
	Definir sumaimpares Como Entero;
	Definir sumaenteros Como Entero;
	Definir pares Como Entero;
	Definir impares Como Entero;
	
	
	sumaimpares= 0
	sumapares= 0
	pares =0
	imapres =0
	Para aux=1 hasta 10 con paso 1 Hacer
		Escribir "Escibir un n�mero "
		leer num;
		
		Si num mod 2 == 0 Entonces
			sumapares = sumapares + num
			pares = pares + 1
			
		SiNo
			sumaimpares = sumaimpares + num
			impares = impares + 1
			
		FinSi
		
	FinPara
	Escribir "La suma de los n�meros pares es ",sumapares
	Escribir "N�meros pares ", pares;
	Escribir "El promedio de n�meros impares es:",sumaimpares/impares;
FinSubProceso
	
Proceso dados10
	
	
	numerodados()
FinProceso
