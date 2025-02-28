# Diferença entre Listeners e Observers 🔍

## Descrição do programa
Este repositório explora a diferença entre os conceitos de **Listeners** e **Observers** no contexto da programação orientada a eventos. Ambos são padrões de design amplamente utilizados para lidar com eventos e mudanças de estado em sistemas, mas possuem diferenças importantes em sua aplicação e funcionamento.

## Explicação do funcionamento

### Listeners
- **Definição**: Um Listener é uma interface ou classe que "escuta" eventos específicos em um sistema. Ele é registrado em um objeto fonte (source) e é notificado quando um evento ocorre.
- **Uso comum**: Amplamente utilizado em frameworks de interface gráfica, como o Swing, para capturar eventos como cliques de botão, movimentação do mouse, etc.

 ### Observers
 - **Definição**: Um Observer é um padrão de design que permite que múltiplos objetos (os observadores) sejam notificados sobre mudanças de estado em outro objeto (o sujeito ou observable).
 - **Uso comum**: Utilizado em sistemas onde é necessário manter consistência entre objetos dependentes, como em arquiteturas MVC (Model-View-Controller).

 ## Diferenças principais
 | **Aspecto**         | **Listeners**                              | **Observers**                              |
 |---------------------|-------------------------------------------|-------------------------------------------|
 | **Paradigma**       | Baseado em eventos                        | Baseado em mudanças de estado             |
 | **Relação**         | Um para um ou um para muitos              | Um para muitos                            |
 | **Registro**        | Registrado diretamente no objeto fonte    | Registrado no sujeito (observable)        |
 | **Notificação**     | Notifica apenas eventos específicos       | Notifica mudanças de estado               |

 