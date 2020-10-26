tipo = input('Digte o tipo da carne: ')
qtd = int(input('Digite a quantidade de carne (kg): '))
pag = input('Qual a forma de pagamento? ')


if tipo == 'File Duplo' and pag == 'Cartao Tabajara':
    if  qtd <= 5:
        preco = 4.90 * qtd
        desc = preco * 0.95
        preco_final = preco - desc
    else:
        preco = 5.80 * qtd
        desc = preco * 0.05
        preco_final = preco - desc
elif tipo == 'Alcatra' and pag == 'Cartao Tabajara':
    if  qtd <= 5:
        preco = 5.90 * qtd
        desc = preco * 0.05
        preco_final = preco - desc
    else:
        preco = 6.80 * qtd
        desc = preco * 0.05
        preco_final = preco - desc
elif tipo == 'Picanha' and pag == 'Cartao Tabajara':
    if  qtd <= 5:
        preco = 6.90 * qtd
        desc = preco * 0.05
        preco_final = preco - desc
    else:
        preco = 7.80 * qtd
        desc = preco * 0.05
        preco_final = preco - desc
elif tipo == 'File Duplo' and pag != 'Cartao Tabajara':
    if  qtd <= 5:
        preco = 4.90 * qtd
        desc = 0
        preco_final = preco - desc
    else:
        preco = 5.80 * qtd
        desc = 0
        preco_final = preco - desc
elif tipo == 'Alcatra' and pag != 'Cartao Tabajara':
    if  qtd <= 5:
        preco = 5.90 * qtd
        desc = 0
        preco_final = preco - desc
    else:
        preco = 6.80 * qtd
        desc = 0
        preco_final = preco - desc
elif tipo == 'Picanha' and pag != 'Cartao Tabajara':
    if  qtd <= 5:
        preco = 6.90 * qtd
        desc = 0
        preco_final = preco - desc
    else:
        preco = 7.80 * qtd
        desc = 0
        preco_final = preco - desc
else:
    print("Valor inválido!")
    
    
print(f'Tipo da carne: {tipo}')
print(f'Quantidade: {qtd} kg(s)')
print(f'Total: {preco}')
print(f'Forma de pagamento: {pag}')
print(f'Valor de desconto: {desc}')
print(f'Preço a pagar: {preco_final}')
