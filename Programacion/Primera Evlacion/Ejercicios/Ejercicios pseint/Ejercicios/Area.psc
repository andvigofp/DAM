SubProceso resultado <- areatriangulo (bases, areas)
		Definir resultado Como Entero;
			resultado = (bases*areas)/2
	
FinSubProceso


Proceso Area
	Definir base Como Entero;
	Definir alt Como Entero;
	Escribir "Base de Triangulo "
	Leer base;
	Escribir "Altura de Triangulo "
	Leer alt;
	Escribir "El area de triangulo es ", areatriangulo(base, alt);
FinProceso