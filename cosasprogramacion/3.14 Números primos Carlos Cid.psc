Proceso ContarPrimos
    Definir n, contadorPrimos, i, j Como Entero
    Definir esPrimo Como Logico
    Escribir "Introduce un número n: "
    Leer n
    contadorPrimos = 0
    Para i = 1 Hasta n Con Paso 1
        esPrimo = Verdadero
        Si i <= 1 Entonces
            esPrimo = Falso
        Sino
            Para j = 2 Hasta i - 1 Con Paso 1
                Si i % j = 0 Entonces
                    esPrimo = Falso
                FinSi
            FinPara
        FinSi
        Si esPrimo Entonces
            contadorPrimos = contadorPrimos + 1
        FinSi
    FinPara
    Escribir "Hay ", contadorPrimos, " números primos entre 1 y ", n
FinProceso