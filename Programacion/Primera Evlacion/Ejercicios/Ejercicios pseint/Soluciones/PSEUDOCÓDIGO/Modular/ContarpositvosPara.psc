SubProceso Contarpositivos()
	// PARA
	total <- 0;	
	Para aux <- 1 Hasta 10
		Escribir "Introduzca un número:";
		Leer Num;
		Si Num > 0
			total <- total + 1;
		FinSi
	FinPara	
FinSubProceso

Proceso ContarpositvosP
	
	Contarpositivos()	
FinProceso
	