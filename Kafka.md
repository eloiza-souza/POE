# Kafka

O **Apache Kafka** é uma plataforma de streaming distribuída de código aberto projetada para lidar com grandes volumes de dados em tempo real. Ele é amplamente utilizado para construir pipelines de dados, sistemas de mensagens e aplicações que exigem processamento de eventos em tempo real.

É uma plataforma distribuída de transmissão de eventos que faz a troca em tempo real de big data contínuo e usa protocolo binário sobre TCP para transmissão de dados.

O Kafka pode enviar milhões de mensagens por segundo, pois usa E/S de disco sequencial para permitir uma troca de alto throughput. A E/S de disco sequencial é um sistema de armazenamento que armazena e acessa dados do espaço de memória adjacente e é mais rápido do que o acesso aleatório ao disco.

Usa design baseado em partições para processamento de transmissões em tempo real e de alto throughput. Ele usa o modelo pull. Os produtores publicam mensagens em tópicos e partições que os consumidores assinam.

## Principais Conceitos do Kafka:
### Tópicos (*Topics*):

Um tópico é uma categoria ou nome para onde as **mensagens são enviadas**.

As mensagens são gravadas em tópicos e podem ser consumidas por consumidores.

Os tópicos são particionados para permitir escalabilidade.

### Produtores (*Producers*):

São responsáveis por **enviar mensagens** para os tópicos no Kafka.

Um produtor pode escolher para qual partição de um tópico enviar a mensagem.

### Consumidores (*Consumers*):

São responsáveis por **ler mensagens** de um ou mais tópicos.

Os consumidores podem ser organizados em grupos de consumidores (*consumer groups*) para dividir a carga de trabalho.
- **Partições** *Partitions*):

Cada tópico é dividido em uma ou mais partições.
As partições permitem que os dados sejam distribuídos em vários servidores, aumentando a escalabilidade e a tolerância a falhas.

- **Offsets**:

Cada mensagem em uma partição recebe um identificador único chamado *offset*.

Os consumidores usam o offset para rastrear quais mensagens já foram processadas.

- **Brokers**:

Um broker é um servidor Kafka que armazena dados e serve como intermediário entre produtores e consumidores.

Um cluster Kafka pode ter vários brokers para garantir alta disponibilidade e escalabilidade.

- **Zookeeper**:

O Kafka usa o Zookeeper para gerenciar o cluster, como rastrear os brokers ativos e manter informações sobre os tópicos e partições.

(Nota: Nas versões mais recentes, o Kafka está migrando para um modelo sem Zookeeper.)

## Como o Kafka Funciona:
### Produção de Dados:

Um produtor envia mensagens para um tópico específico.

As mensagens são distribuídas entre as partições do tópico.

### Armazenamento:

As mensagens são armazenadas de forma ordenada e replicadas entre os brokers para **garantir durabilidade**.

### Consumo de Dados:

Os consumidores leem as mensagens de um tópico, usando o offset para rastrear o progresso.

## Benefícios do Kafka:

- **Alta Performance**: Projetado para lidar com grandes volumes de dados com baixa latência.
- **Escalabilidade**: Pode ser escalado horizontalmente adicionando mais brokers ao cluster.
- **Durabilidade**: As mensagens são replicadas entre os brokers para evitar perda de dados.
- **Flexibilidade**: Suporta diferentes padrões de consumo, como fila (queue) e publicação/assinatura (pub/sub).

## Consumo de mensagens
Os consumidores do Kafka são proativos na leitura e rastreamento de informações. À medida que as mensagens são adicionadas aos arquivos de log físicos, os consumidores do Kafka acompanham a última mensagem que leram e atualizam adequadamente o rastreador de posição. Um rastreador de posição é um contador que aumenta após a leitura de uma mensagem. Com Kafka, o produtor não está ciente da recuperação de mensagens pelos consumidores.

## Prioridade da mensagem
O Apache Kafka não oferece filas prioritárias. A ferramenta trata todas as mensagens da mesma forma ao distribuí-las em suas respectivas partições.

## Ordenação de mensagens
O Kafka usa tópicos e partições para enfileirar mensagens. Quando um produtor envia uma mensagem, ela entra em um tópico e uma partição específicos. Como o Kafka não permite trocas diretas entre produtores e consumidores, o consumidor extrai mensagens da partição em uma ordem diferente.

## Exclusão de mensagens
O Apache Kafka anexa a mensagem a um arquivo de log, que permanece até que seu período de retenção expire. Dessa forma, os consumidores podem reprocessar os dados transmitidos a qualquer momento dentro do período estipulado.

## Exemplo de Uso:
Imagine um sistema de e-commerce:

- **Produtores**: Serviços que enviam eventos, como "pedido criado" ou "pagamento processado".
- **Tópicos**: "Pedidos" e "Pagamentos".
- **Consumidores**: Serviços que processam esses eventos, como um sistema de faturamento ou um sistema de envio de notificações.

## Casos de Uso do Kafka:
- **Pipelines de Dados**: Transferir dados entre sistemas de forma confiável.
- **Processamento de Eventos em Tempo Real**: Monitoramento de logs, métricas ou transações.
- **Sistemas de Mensagens**: Comunicação entre microserviços.
- **Análise de Dados**: Coleta e processamento de dados para análise em tempo real.