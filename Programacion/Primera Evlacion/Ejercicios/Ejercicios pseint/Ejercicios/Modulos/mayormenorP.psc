//Algoritmo que imprima el mayor y el n�mero de una
//serie  de n�meros introdcidos por teclado(-1 para salir)

SubProceso mayormenorSP()
	Definir nummayor Como Entero;
	Definir nummenor Como Entero;
	Definir num Como Entero;
	
	
	nummayor=0
	nummenor=9999
	Mientras num <> -1 Hacer
		Escribir "Introduzca un n�mero"
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
