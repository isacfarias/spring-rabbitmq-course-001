# spring-rabbitmq-course-001

Learn how to develop Queues, Exchanges, Routings and Listeners with Rabbit MQ using Java and Spring!<br/>

https://southsystem.udemy.com/course/learn-rabbitmq-asynchronous-messaging-with-java-and-spring

## Configurando a fila no rabbitMQ

Na pagina de adiminatração de rabbitMQ vamos criar nossa filas conforme os passos abaixo:</br>
1- Crie uma exchange no tipo topico exemplo: test.exchange.topic (pense que o cachorro é seu e voce dá o nome que você desejar)</br>
2- Crie uma fila (Queue) de um nome que fique facil de assimilar, afinal é um aprendizado, exemplo: test.routing.topic (novamente o cachorro é seu, faz o que desejar)</br>
3- Hora de fazer o bindig, vamos no menu exchange, selecionamos nossa fila "test.exchange.topic" fazemos isso clicando nela, agora vamos para o binding no passo 4</br>
4- Ainda com a exchange "test.exchange.topic", no grupo "Add binding from this exchange" vamos preencher com o nome da nossa fila test.exchange.topic, e adicionar o "Routing key:</br>
para ele vamos dar o nome "topic.routing.key" e clicar em Bind.</br>

Pronto agora se quiser testar é só enviar uma menssage, para isso vamos informar a routing key que cadastramos "topic.routing.key", no campo payload vai o conteudo da nossa mensagem,</br>
agora é só clicar em Publish message e a magia acontece.</br>

agora para ver a mensagem é só ir na fila cadastrada "test.routing.topic", na opção get Messages e o conteudo do payload vai ser exibido.</br>


