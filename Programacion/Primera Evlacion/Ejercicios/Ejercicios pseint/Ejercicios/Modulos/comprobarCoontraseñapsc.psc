SubProceso res <- ComprobarContrasenha ()
	Definir Contraseņa Como Entero;
	Definir Password Como Entero;
	
	Hacer 
		
	Hasta Que 
Fin SubProceso

Proceso Compropassword
	Si ComprobarContraseņa()
		Escribir "La contraseņa es correcta"
	FinSi
	
FinProceso
	