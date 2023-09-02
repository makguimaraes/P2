let genero_altura = {'F': [], 'M': []};
let alturas = [];

for (let i = 0; i < 15; i++) {
    let gender = prompt('Informe o gênero da pessoa (F ou M): ');
    let height = Number(prompt('Informe a altura da pessoa (em m): '));

    if (gender === 'F' || gender === 'f') {
        genero_altura['F'].push(height);
        alturas.push(height);
    } else if (gender === 'M' || gender === 'm') {
        genero_altura['M'].push(height);
        alturas.push(height);
    } else {
        console.log('Opção inválida!');
    }
}

let maior_altura = Math.max(...alturas);
console.log('Maior altura', maior_altura);

let menor_altura = Math.min(...alturas);
console.log('Menor altura', menor_altura);

let soma_alturas_m = genero_altura['M'].reduce((acumulador, elementoAtual) => {
    return acumulador + elementoAtual;
}, 0);

let numero_m = genero_altura['M'].length;

try {
    let media_altura_m = soma_alturas_m / numero_m;
    console.log('Média de altura masculina: ', media_altura_m.toFixed(2));
} catch (erro) {
    console.log('Média de altura masculina: não aplicável.');
}

let numero_f = genero_altura['F'].length;
console.log('Quantidade de mulheres:', numero_f);
