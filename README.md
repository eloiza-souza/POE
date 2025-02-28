# Programação Orientada a Eventos

## O que é Programação Orientada a Eventos? 🤔
A Programação Orientada a Eventos (POE) é um **paradigma de programação** onde o fluxo do programa é determinado por eventos, como cliques de mouse, pressionamento de teclas, timers ou mensagens de sistemas.

## Para que serve ❔
Em aplicações do lado do servidor, já foi bastante comum implementações síncronas onde deve-se esperar o total processamento de uma rotina para termos uma resposta. Com a evolução das aplicações e arquiteturas, o assincronismo provou ser bastante proveitoso, pois o processamento de E/S é normalmente executado por meio de eventos e callbacks, portanto enquanto é aguardado o retorno de uma consulta ou algo similar, ainda poderíamos processar outras rotinas.

O objetivo é tentar trabalhar em um modelo não bloqueante.

## Conceitos Fundamentais 📒

1) **Eventos**: São ações ou ocorrências que podem ser detectadas pelo programa. Exemplos incluem:
- Um clique em um botão.
- A chegada de uma mensagem em um sistema de mensagens.
- Uma alteração em um arquivo ou banco de dados.

2) **Listeners** (Ouvintes): São objetos ou métodos que "ouvem" os eventos e executam uma ação quando o evento ocorre. Eles são registrados para escutar eventos específicos.


3) **Disparadores de Eventos** (Event Emitters): São os componentes que geram ou disparam os eventos.

   Por exemplo, um botão em uma interface gráfica pode disparar um evento de clique.


4) **Callback**: É o código que será executado quando o evento ocorrer. Geralmente, é uma função ou método que é passado como argumento para o listener.


5) **Loop de Eventos**: É um mecanismo que monitora continuamente os eventos e os despacha para os listeners apropriados.

## Definição de Eventos
Um evento é uma notificação que algo importante aconteceu no sistema. Eventos são representações de **fatos passados** e são **imutáveis**, ou seja, uma vez que um evento é gerado, ele não pode ser alterado. Eventos frequentemente carregam informações sobre a mudança de estado que ocorreu, permitindo que outros componentes do sistema reajam a essa mudança.

Exemplo de Evento:

- **Evento**: “Ordem Criada” — Representa o fato de que uma nova ordem foi criada no sistema.
- **Dados**: ID da Ordem, Data de Criação, Cliente, etc.

### Diferentes Tipos de Eventos
Na programação orientada a eventos, podemos encontrar vários tipos de eventos. Algumas categorias incluem:

- **Eventos de entrada**: Incluem ações como cliques do mouse, toques na tela, rolagem e pressionamento de teclas.
- **Eventos de mudança**: Esses eventos ocorrem quando há uma alteração no estado de um elemento, como a modificação de um campo de formulário.
- **Eventos de tempo**: Os eventos com base no tempo incluem timers e cronômetros, que disparam ações após um período definido.

### Como Funciona a Programação Orientada a Eventos?
A implementação prática de programação orientada a eventos geralmente envolve quatro passos principais:

- **Registro do Evento**: O primeiro passo é registrar um evento no sistema. Isso é feito associando um evento a um manipulador que irá contar o que fazer quando o evento ocorrer.
- **Escuta do Evento**: Uma vez que os eventos estão registrados, a aplicação passa a “escutar” por esses eventos, aguardando que eles ocorram.
- **Disparo do Evento**: Quando um evento ocorre, o sistema dispara o evento, o que pode ser feito em resposta a uma ação do usuário ou outra condição programada.
- **Manipulação do Evento**: O manipulador do evento é chamado, e a lógica escrita nele é executada com base na natureza do evento.

## Definição de Mensagens
Mensagens, por outro lado, são **pacotes de dados** que podem servir para vários propósitos, como comandos ou respostas a ações específicas. Ao contrário dos eventos, as mensagens podem ser **mutáveis** e podem exigir uma resposta. As mensagens são usadas para comunicação direta entre componentes, como solicitações para realizar uma tarefa ou consultas sobre o estado do sistema.

Exemplo de Mensagem:

- **Mensagem**: “Processar Ordem” — Um comando enviado a um serviço para iniciar o processamento de uma ordem.
- **Dados**: ID da Ordem, Prioridade, etc.

## Diferenças entre Eventos e Mensagens
As diferenças entre eventos e mensagens podem parecer sutis, mas elas têm implicações significativas no design do sistema.

- **Propósito**:

  - Evento: Notifica outros componentes sobre algo que aconteceu.
  - Mensagem: Comunica uma solicitação ou responde a uma consulta.
  
- **Imutabilidade**:

   - Evento: Imutável; uma vez gerado, não pode ser alterado.
   - Mensagem: Pode ser mutável dependendo do uso.

- **Resposta**:

   - Evento: Não espera uma resposta direta; simplesmente notifica.
   - Mensagem: Pode esperar ou não uma resposta, dependendo do tipo de comunicação.

## Modelos de Comunicação em Arquiteturas Orientadas a Eventos

### **Comunicação Assíncrona**
A comunicação assíncrona é um elemento central da EDA. Em sistemas assíncronos, os componentes do sistema não esperam respostas imediatas. Em vez disso, eles enviam eventos para um intermediário (como um barramento de eventos) e continuam sua execução, enquanto os consumidores processam os eventos conforme sua disponibilidade.

- Benefícios da Comunicação Assíncrona:

   - **Escalabilidade**: Componentes podem ser dimensionados independentemente.
   - **Resiliência**: Componentes podem falhar sem afetar o sistema como um todo.
   -**Flexibilidade**: Facilita a integração de novos serviços sem alterar os emissores de eventos.

### Comunicação Síncrona
Embora a EDA privilegie a comunicação assíncrona, a comunicação síncrona também pode ser usada em casos onde a consistência imediata é necessária. Na comunicação síncrona, o emissor espera uma resposta do consumidor antes de continuar sua execução.

Exemplos Práticos:

- **Assíncrono**: Um sistema de processamento de pagamentos onde os pedidos são enfileirados e processados conforme a disponibilidade do serviço de pagamento.
- **Síncrono**: Uma consulta de saldo bancário, onde o cliente precisa da resposta imediata do servidor.

## Mensageria 
**Mensageria** é o termo utilizado para descrever o processo de **troca de mensagens** entre sistemas, aplicações ou serviços. É uma forma de comunicação **assíncrona**, onde as mensagens são enviadas de um sistema para outro sem a necessidade de ambos estarem disponíveis ao mesmo tempo. Esse conceito é amplamente utilizado em arquiteturas distribuídas, como microserviços, para garantir a comunicação eficiente e desacoplada entre diferentes componentes.

A mensageria geralmente é implementada utilizando **filas de mensagens** ou tópicos de publicação/assinatura. Algumas ferramentas populares de mensageria incluem:

- [**RabbitMQ**](RabbitMQ): Um broker de mensagens que utiliza o protocolo AMQP.
- [**Apache Kafka**](Kafka.md): Uma plataforma de streaming distribuída que suporta publicação/assinatura e processamento de mensagens.
- **Amazon SQS** (Simple Queue Service): Serviço de fila de mensagens da AWS.
- **Azure Service Bus**: Serviço de mensageria da Microsoft Azure.

Exemplos de uso de mensageria:

- **Processamento assíncrono**: Um sistema pode enviar uma mensagem para uma fila para ser processada posteriormente por outro serviço.
- **Integração de sistemas**: Diferentes sistemas podem se comunicar trocando mensagens, mesmo que sejam implementados em linguagens ou plataformas diferentes.
- **Escalabilidade**: Mensageria permite que sistemas sejam escalados horizontalmente, processando mensagens em paralelo.

## Fontes
https://zup.com.br/blog/programacao-orientada-a-eventos
https://ai.stackspot.com/home
https://medium.com/@danielrafaelramos/arquitetura-orientada-a-eventos-e-mensagens-8ed9d578041c
https://rextopleads.com/blog/tecnologia/ciencia-da-computacao/programacao-orientada-a-eventos-um-guia-completo
Livro: Use a Cabeça Java