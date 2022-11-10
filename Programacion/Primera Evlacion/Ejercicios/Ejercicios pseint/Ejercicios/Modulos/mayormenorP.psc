//Algoritmo que imprima el mayor y el número de una
//serie  de números introdcidos por teclado(-1 para salir)

SubProceso mayormenorSP()
	Definir nummayor Como Entero;
	Definir nummenor Como Entero;
	Definir num Como Entero;
	
	
	nummayor=0
	nummenor=9999
	Mientras num <> -1 Hacer
		Escribir "Introduzca un número"
		leer num;
		
		Si num <> -1 Entonces
			Si num > nummayor Entonces
				nummayor=num;	
			
			
		SiNo
			Si num < nummenor Entonces
				nummenorr=num;	
				
			FinSi
			
		FinSi
	FinSi
		
	FinMientras
	Escribir "El mayor es: ", nummayor, " y el menor: ", nummenor;
FinSubProceso

Proceso mayormenorP
	
mayormenorSP()	
	
FinProceso
