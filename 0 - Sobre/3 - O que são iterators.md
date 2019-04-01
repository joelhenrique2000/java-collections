## O que são os iterators?

Um iterator é basicamente um objeto que possui a capacidade de percorrer os elementos de um container de maneira otimizada. Também pode fazer referência ao design pattern iterator, que também consiste na criação de um objeto especializado na leitura de elementos dentro de um conjunto, ao invés de percorrê-los de maneira manual. Tratando-se d JCF, podemos afirmar que os containers a serem percorridos com o auxílio dos iterators são as diferentes estruturas de dados expostas pelo JCF.

Todas as coleções no JCF possuem suporte a iterators. Isso acontece porque a interface Collection extende a interface Iterable. A interface Iterable estabelece justamente os métodos para criação e utilização dos iterators.