telefonos = [316848078,312679341,301938214,342023545]


def ordenamiento_burbuja(arr):
    n = len(arr)

    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

ordenamiento_burbuja(telefonos)
print("Burbuja:", telefonos)



def ordenamiento_insercion(arr):
  
    for i in range(1, len(arr)):
        clave = arr[i] 
        j = i - 1
        while j >= 0 and clave < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1

        arr[j + 1] = clave
        
        

        
ordenamiento_insercion(telefonos)
print("inserccion:", telefonos)




def rapido(arr):
    if len(arr) <= 1:
        return arr
    else:
        puntero = arr[0]
        menores = [x for x in arr[1:] if x <= puntero]
        mayores = [x for x in arr[1:] if x > puntero]
        return rapido(menores) + [puntero] + rapido(mayores)



rapido(telefonos)
print("rapido:", telefonos)
            
            


def seleccion(arr):
    n = len(arr)
    
    for i in range(n):
        indice_minimo = i
        for j in range(i + 1, n):
            if arr[j] < arr[indice_minimo]:
                indice_minimo = j

        arr[i], arr[indice_minimo] = arr[indice_minimo], arr[i]   
        
        
        
seleccion(telefonos)
print("seleccion:", telefonos)    




def conteo(arr):
    maximo = max(arr)
    minimo = min(arr)
    rango = maximo - minimo + 1

    contador = [0] * rango
    salida = [0] * len(arr)

    for num in arr:
        contador[num - minimo] += 1

    for i in range(1, rango):
        contador[i] += contador[i - 1]

    for i in range(len(arr) - 1, -1, -1):
        salida[contador[arr[i] - minimo] - 1] = arr[i]
        contador[arr[i] - minimo] -= 1

    arr[:] = salida

conteo(telefonos)
print("conteo:", telefonos)
            