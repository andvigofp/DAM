// Escribir un Pseudocódigo que encuentre y despliegue los números primos entre uno y cien. 
// Un número primo es divisible entre el mismo y la unidad por lo tanto un numero primo no puede ser par excepto el dos (2).

SubProceso numerosPrimos
	Definir primo Como Entero;
	Definir cont Como Entero;
	Definir divisores Como Entero;
	Definir res Como Entero;
	
	primo= 1;
	
	// Compruebo los divisores
	Para primo = 1 Hasta 100
		divisores = 0;
		cont = 1;
		
		Mientras cont <= primo Hacer
			Si primo mod cont = 0 Entonces
				divisores = divisisores + 1;
			FinSi
			cont = cont +1;
		FinMientras
		
		Si divisiors <=2 Entonces
			Escribir "El número ", primo, " es primo";
		FinSi
	FinPara
	
FinSubProceso

Proceso ModuloPrimo
	numerosPrimos();
FinProceso
