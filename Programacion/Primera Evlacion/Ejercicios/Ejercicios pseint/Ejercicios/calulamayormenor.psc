
SubProceso resultado <- calulamayormenor(num1SP, num2SP, num3SP)
	Definir resultado Como Entero;
	Si num1SP>num2SP y num1SP>num3SP Entonces
		resultado=num1SP
	SiNO 
		SI num2SP>num1SP y num2SP>num3SP Entonces
			resultado=num2SP
		SINO	
			Si num3SP>num1SP y num3SP>num2SP Entonces
				resultado=num3SP
				
			FinSi
		FinSi
	FinSi
FinSubProceso
Proceso mayormenor
	Definir nun1 Como Entero;
	Definir num2 Como entero;
	Definir num3 Como Entero;
	Leer num1;
	Leer num2;
	Leer num3; 
	Escribir "El numero mayor es ",calulamayormenor(num1, num2, num3);
FinProceso