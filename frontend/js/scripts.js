document.addEventListener('DOMContentLoaded', () => {
    const institutionContainer = document.getElementById('intitution-container');
    const institutionForm = document.getElementById('institution-form');

    // Função para listar todos os clientes
    const listarInstituicoes = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/clientes');
            const institutions = await response.json();
            institutionContainer.innerHTML = '';
            institution.forEach(institution => {
                const institutionElement = document.createElement('div');
                institutionElement.innerHTML = `
                    <p>${institution.nome} (${institution.email})</p>
                    <button onclick="deletarCliente(${institution.id})">Deletar</button>
                `;
                institutionContainer.appendChild(institutionElement);
            });
        } catch (error) {
            institution.error('Erro ao listar instituições:', error);
        }
    };

    // Função para adicionar um novo cliente
    institutionForm.addEventListener('submit', async (event) => {
        event.preventDefault();
        const formData = new FormData(institutionForm);
        const institution = {
            nome: formData.get('nome'),
            email: formData.get('email')
        };
        try {
            const response = await fetch('http://localhost:8080/api/instituicoes', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(institution)
            });
            if (response.ok) {
                listarInstituicoes();
                institutionForm.reset();
            } else {
                console.error('Erro ao adicionar Instituição');
            }
        } catch (error) {
            console.error('Erro ao adicionar instituição:', error);
        }
    });

    // Função para deletar um cliente
    window.deletarInstituição = async (id) => {
        try {
            const response = await fetch(`http://localhost:8080/api/clientes/${id}`, {
                method: 'DELETE'
            });
            if (response.ok) {
                listarInstituicoes();
            } else {
                console.error('Erro ao deletar cliente');
            }
        } catch (error) {
            console.error('Erro ao deletar cliente:', error);
        }
    };

    // Inicializar a listagem de clientes
    listarClientes();
});
