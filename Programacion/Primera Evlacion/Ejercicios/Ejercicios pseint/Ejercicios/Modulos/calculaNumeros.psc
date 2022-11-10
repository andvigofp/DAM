//Introducir 2 números por teclado. Imprimir 
//los números que hay entre ambos, contar cuántos hay y cuántos son pares.
//Calcular el producto de los impares

SubProceso calculanumerosSP(num1SP,num2SP) 

	
	Definir aux Como Entero;
	Definir contador Como Entero;
	Definir contador2 Como Entero;
	Definir sumapares Como Entero;
	Definir Productoimpares Como Entero;
	

	
	Para aux=num1SP hasta num2SP con paso 1 Hacer
		Escribir "Escibir un número "
		leer num1SP;
		contador = aux +1
		contador2 = num2SP -num1SP
		Si contador %2 =0
			sumapares=sumapares+1	
		
		SiNo
			Si contador %2 =0
				
				producto=sumaimpares	
			FinSi
			FinSI
	FinPara
	Escribir "hay: ", contador2;
	Escribir "Pares son: ", sumapares;
	escribir "El producto es ", sumaimpares;
FinSubProceso
	
Proceso calculaNumeros
	Definir num1 Como Entero;
	Leer num1;
	Definir num2 Como Entero;
	Leer num1;
	calculanumerosSP(num1,num2)
FinProceso
