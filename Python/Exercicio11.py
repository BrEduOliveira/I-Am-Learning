def conta_vogais(str):
    vogais = ['a','e','i','o','u']
    if str.lower() in vogais:
        print("True")
        vogais.count('a','e','i','o','u')
    else:
        print("False")
palavra = 'Text'
conta_vogais(palavra)