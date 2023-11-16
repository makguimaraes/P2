function funcaoLogin() {
    let loginUsr = document.getElementById("login_form").value;
    let senhaUsr = document.getElementById("senha_form").value;

    let dadosLogin = {email: loginUsr, senha: senhaUsr};

    if (validarUsuario(dadosLogin)) {
        window.location.href = "./msg_recebidas.html";
    } else {
        alert("Falha na validação do usuário. Verifique suas credenciais.");
    }

    document.getElementById('loginForm').reset();
}