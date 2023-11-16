function captMensagem() {
    let nomeContato = document.getElementById("nome_form").value;
    let emailContato = document.getElementById("email_form").value;
    let mensContato = document.getElementById("msg_form").value;

    let msgContato = {nome: nomeContato, email: emailContato, mensagem: mensContato}

    inserirMensagem(msgContato)
}