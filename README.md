# rolldice

Trabalho da disciplina Serviços em Nuvem e Projeto de Bloco do Instituto Infnet. Este trabalho consiste em fazer um jogo rpg, em que cada funcionalidade do jogo é realizado através de um micro-serviço.

O projeto rolldice é pra ser usado em conjunto com configServer, eurekaServer e batalha.

rolldice tem como objetivo rolar os dados e devolver o resultado para a api que o chamou.

Para utilizá-lo, será necessário um ambiente java (com a versão 11 do java) para subir a aplicação, ter o MySql instalado e passar os parâmetros dos dados, tais como tipo do dado e quantidade de vezes que o dado deverá ser rolado. Ex:

http://localhost:8484/api/rolldices?type=10&amount=1

type = tipo do dado, se é um dado de 4 faces, 6 faces, 10 faces, etc
amount = a quantidade de vezes que o dado deverá ser lancado

É necessário que os serviços configServer e eurekaServer estejam iniciados antes deste servço.
