//Diseñar el algoritmo (ordinograma y pseudocódigo) correspondiente a un programa
//que exprese en horas, minutos y segundos un tiempo expresado en segundos.
SubProceso convertirHoras(seg)
	Definir horas, minutos Como Numero;
	horas = trunc(seg / 3600);
	seg = seg mod 3600;
	minutos = trunc(seg / 60);
	seg = seg mod 60;
	Escribir "Horas: ", horas, ", minutos: ", minutos, ", segundos: ", seg;	
FinSubProceso
Proceso SegundosHoras
	Escribir "Introduzca los segundos";
	Leer seg;
	convertirHoras(seg);
FinProceso
