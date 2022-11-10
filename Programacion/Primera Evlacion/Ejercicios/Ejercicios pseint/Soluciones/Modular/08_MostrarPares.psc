SubProceso Mostrarpares(iSP)
	Para iSP=1 Hasta 10
		Si iSP mod 2=0
			Escribir i;
		FinSi
	FinPara
	FinSubProceso
	
	Proceso MostrarNPares
		Mostrarpares(i)
		FinProceso
		