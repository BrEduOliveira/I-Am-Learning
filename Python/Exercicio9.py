tupla = ('Bucks','Raptors','76ers','Celtics','Pacers','Nets','Magic','Pistons','Hornests','Heat')

print("Os 5 primeiros:\n")
for i in tupla[:5]:
    print(f'{tupla.index(i)+1}º {i}')

print("\nOs 4 Ultimos:\n")
for i in tupla[5:9]:
    print(f'{tupla.index(i)+1}º {i}')

print("\nColocando em ordem:\n")
tupla_1 = sorted(tupla)
for i in tupla_1:
    print(f'{tupla_1.index(i)+1}º {i}')

print("\nPosição dos Celtics:\n")
print(tupla.index('Celtics')-1)