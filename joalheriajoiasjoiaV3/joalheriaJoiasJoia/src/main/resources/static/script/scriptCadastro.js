document.addEventListener("DOMContentLoaded", () => {
    // Corrigindo o método getElementsByName para pegar o formulário correto
    const form = document.getElementById("cadastroCliente");  // Usando getElementById

    form.addEventListener("submit", async (event) => {
        event.preventDefault();  // Corrigindo o erro de método - deve ser 'preventDefault', não 'preventdefault'

        const nomeCliente = document.getElementById("nomeCliente").value;
        const cpf = document.getElementById("cpf").value;
        const telefone = document.getElementById("telefone").value;
        const email = document.getElementById("email").value;
        const dataNascimento = document.getElementById("dataNascimento").value;

        try {
            const response = await fetch("http://localhost:8080/cadastrocliente", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    nomeCliente,
                    cpf,
                    telefone,
                    email,
                    dataNascimento
                }),
            });

            if (response.ok) {
                alert("Cliente cadastrado com sucesso!");
            } else {
                alert("Erro ao cadastrar o cliente");
            }
        } catch (error) {
            console.error("Erro ao cadastrar o cliente:", error);
        }

    });
});
