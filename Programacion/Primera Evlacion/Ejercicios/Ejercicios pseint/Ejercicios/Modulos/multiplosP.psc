//Imprimir y contar los n�meros m�ltiplos de 3
//desde 1 hasta un n�mero que introduzca por teclado

SubProceso multiplosSP(numSP)
	
	Definir cont Como Entero;
	Definir aux Como Entero;
	
	cont = 0;
	Para aux = 3 Hasta numSP Con Paso 1
		
		Si aux mod 3 = 0 Entonces
			
		FinSI
		cont = cont + 1;
	FinPara
	
	
	
	
	
	
FinSubProceso


Proceso multiplosP
	

Definir num Como Entero;
Escribir "Introduzca un n�mero:" ;
Leer num;

multiplosSP(num);	
FinProceso
	