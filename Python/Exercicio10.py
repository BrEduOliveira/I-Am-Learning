tupla = (3,0,9,78)
cont = 0
pares = []

for i in tupla:
    if i == 9:
        cont += 1
        
for j in tupla:
    if j % 2 == 0:
        pares.append(i)

for k in tupla:
    if k == 3:
        print()
print(f'Qtd de numeros 9: {cont}')
print(f'Numeros pares:\n')
print(pares)