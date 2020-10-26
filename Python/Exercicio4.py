num = int(input('Digite um numero: '))

if num % 2 == 0:
    if num >= 0:
        print(f'O numero é um par positivo')
    else:
        print(f'O numero é um par negativo')
else:
    if num >= 0:
        print(f'O numero é impar positivo')
    else:
        print(f'O numero é impar negativo')