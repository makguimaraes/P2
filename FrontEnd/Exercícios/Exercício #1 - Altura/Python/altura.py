genero_altura = {'F': [], 'M': []}
alturas = []

for i in range(5):

    gender = input('Informe o gênero da pessoa (F ou M): ')

    height = float(input('Informe a altura da pessoa (em metros): '))

    if gender == 'F' or gender == 'f':
        genero_altura['F'].append(height)
        alturas.append(height)
    elif gender == 'M' or gender == 'm':
        genero_altura['M'].append(height)
        alturas.append(height)
    else:
        print('Opção inválida!')

# Maior altura:

maior_altura = max(alturas)

print('\nMaior altura:', maior_altura)

# Menor altura:

menor_altura = min(alturas)

print('Menor altura:', menor_altura)

# Média de altura dos homens:

soma_alturas_m = sum(genero_altura['M'])
numero_m = len(genero_altura['M'])

try:
    media_altura_m = soma_alturas_m / numero_m
    print("Média de altura masculina: {:.2f}".format(media_altura_m))
except:
    print('Média de altura masculinha: não aplicável.')

# O número de mulheres:

numero_f = len(genero_altura['F'])

print('Quantidade de mulheres:', numero_f)
