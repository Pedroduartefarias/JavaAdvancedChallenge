# JavaAdvancedChallenge

## Nomes dos integrantes
#### Pedro Duarte Farias: Responsavel pela criação dos pacotes e da classe controller 
#### Marcelo Fortes: Responsavel por criar a documentação e ajudar a construir a classe controller
#### Leonardo Dourado: Responsavel por criar o banco de dados e o application.properties
#### Gabriel Caverzan: Responsavel por criar os diagramas de entidade e relacionamento e as validações beans 
#### Felipe: Responsavel por criar a classe model, o repository e o validator
<br>

## Instruções de como rodar a aplicação
#### Para rodar a aplicação é necessario ter o jdbc 11 instalado na maquina e no programa e ter o java 17 instalado
#### dar run no codigo e realizar os testes no postman com o seguinte json para adicionar um novo usuario
{
    <br>"nome": "João da Silva",<br>
    "idade": 30,<br>
    "genero": "Masculino",<br>
    "estado": "SP",<br>
    "comprou": sim<br>
}
#### GET /userdata/list para puxar a lista de todos os usuarios
#### GET /userdata/{id} para puxar usuarios por ID
#### PUT /userdata/update/{id} para modificar um usuario por ID
{
    <br>"nome": "Maria Oliveira",<br>
    "idade": 25,<br>
    "genero": "Feminino",<br>
    "estado": "SP",<br>
    "comprou": true<br>
}
#### DELETE /userdata/delete/{id} para deletar um usuario por ID
#### Os dados são apenas exemplos podem ser alterados por qualquer nome, qualquer idade, qualquer genero, qualquer estado brasileiro usando as siglas do  respectivo estado como sp, rj, mg etc, e se a pessoa comprou pode ser usado sim ou não
<br>

## Imagens dos diagramas
![image](https://github.com/Pedroduartefarias/JavaAdvancedChallenge/assets/125598806/dd05abaf-1fcd-4b30-8600-48b7afa43634) <br>

![image](https://github.com/Pedroduartefarias/JavaAdvancedChallenge/assets/125598806/43ea972e-f7e1-4e98-8e17-9ceaf039f2c9)

<br>

## Link do Video pitch
https://youtu.be/lUahXy806d0?si=xQI5JhbNQ0Z6B9N8

<br>

## Listagem dos endpoints
 Endpoint para adicionar um novo usuário
    @PostMapping("/add")
    public UserData addUser(@RequestBody UserData userData) {
        return userDataRepository.save(userData);
    }

    Endpoint para listar todos os usuários
    @GetMapping("/list")
    public List<UserData> getAllUsers() {
        return userDataRepository.findAll();
    }

    Endpoint para buscar um usuário pelo ID
    @GetMapping("/{id}")
    public UserData getUserById(@PathVariable Long id) {
        return userDataRepository.findById(id).orElse(null);
    }

    Endpoint para atualizar um usuário existente
    @PutMapping("/update/{id}")
    public UserData updateUser(@PathVariable Long id, @RequestBody UserData userData) {
        if(userDataRepository.existsById(id)) {
            userData.setId(id);
            return userDataRepository.save(userData);
        }
        return null;
    }

    Endpoint para excluir um usuário pelo ID
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userDataRepository.deleteById(id);
    }

<br>
* O codigo fonte esta no master



