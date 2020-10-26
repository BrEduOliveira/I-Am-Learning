const input = document.getElementById('novaTarefa');
const botao = document.getElementById('botaoAdicionar');
const lista = document.getElementById('lista');

botao.onclick = adicionarItem;

for(let i = 0; i < lista.children.length; i++) {
  const botao = lista.children[i].querySelector('button.deletar');
  botao.onclick = deletarItem;
}

function adicionarItem() {
  const itemNovo = itemLista();
  lista.appendChild(itemNovo);
  input.value = "";
}

function itemLista(){
  const listItem = document.createElement('li');
  const label = document.createElement('label');
  const botao = document.createElement('button');

  label.innerText = input.value;

  botao.innerText = 'Apagar';
  botao.onclick = deletarItem;

  listItem.appendChild(label);
  listItem.appendChild(botao);

  return listItem;
}

function deletarItem() {
  const itemLista = this.parentNode;
  lista.removeChild(itemLista);
}
