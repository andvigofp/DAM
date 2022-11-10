// Escribir un Pseudocódigo que encuentre y despliegue los números primos entre uno y cien. 
// Un número primo es divisible entre el mismo y la unidad por lo tanto un numero primo no puede ser par excepto el dos (2).

SubProceso CalcularPrimo(numCP)
	Definir cont Como Entero;

	Para auxA = 1 Hasta numCP Con Paso 1
		cont = 0;
		
		Para auxB = 1 Hasta auxA Con Paso 1
			Si auxA mod auxB = 0
				cont = cont + 1;
			FinSi
			
			Si cont > 2
				auxB = auxA;
			FinSi
		FinPara
		
		Si cont = 2
			Escribir "El número ", auxA, " es primo";
		FinSi
	FinPara
	
FinSubProceso

Proceso ModuloPrimo
	Definir num Como Entero;
	num = 100;
	CalcularPrimo(num);
FinProceso
