//Ordinograma y Psedoc�digo que encuentre y despliegue los n�meros primos entre uno y cien,
//Un n�mero primo es divisible entre el mismo y la unidad por lo tanto un numero primo no
//puede ser par excepto el dos (2)
SubProceso numerosPrimos
Definir primo Como Entero;
Definir cont Como Entero;
Definir divisores Como Entero;
Definir res Como Entero;

primo = 1;

Para primo = 1 Hasta 100 
	divisores = 0;
	cont = 1;
	
	// Compruebo los divisores
		Mientras cont <= primo Hacer	
			Si cont<>1 y cont <> primo y cont mod primo = 0 entonces
				divisores = divisores +1;
			FinSi
			cont = cont +1;					
		FinMientras
		
		Si divisores=0 entonces
			Escribir primo
		FinSi;
	FinPara
FinSubProceso

Proceso numeroPrimo
	numerosPrimos();
FinProceso
