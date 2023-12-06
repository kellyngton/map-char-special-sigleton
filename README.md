# map-char-special-sigleton
Utils para converter uma necessidade de um depara específico e mapeado de caracteres. 


/**
 * **ReplaceSpecialCharsUtil**
 * 
 * A classe `ReplaceSpecialCharsUtil` é uma implementação Java projetada para substituir caracteres especiais em strings.
 * O código realiza essa substituição com base em um mapa predefinido de caracteres especiais, seguindo padrões de design e boas práticas de codificação.
 *
 * ## Funcionalidades Principais
 * - **Substituição de Caracteres Especiais:**
 *   O método `replaceSpecialChars` itera sobre cada caractere na string de entrada, identifica seu código Unicode e efetua a substituição conforme o mapa predefinido.
 * - **Padrão Singleton:**
 *   A classe incorpora o padrão Singleton, garantindo que apenas uma instância seja criada e acessível por meio do método `getInstance()`.
 * - **Constantes Imutáveis:**
 *   O mapa de caracteres especiais (`SPECIAL_CHARACTERS_MAP`) é declarado como uma constante imutável, prevenindo modificações após a inicialização.
 * - **Utilização de `replaceAll`:**
 *   A substituição de caracteres é realizada com o método `replaceAll`, assegurando uma substituição global na string.
 *
 * ## Nomes Descritivos e Métodos Auxiliares
 * - **Nomes Descritivos:**
 *   Todos os métodos e atributos foram renomeados conforme as convenções de nomenclatura Java, proporcionando clareza e legibilidade.
 * - **Métodos Auxiliares:**
 *   Foram introduzidos métodos como `getFormatUnicodeChar` e `getReplacementUnicode` para modularização e melhor legibilidade do código.
 *
 * ## Melhorias Futuras
 * - **Verificação de Threads:**
 *   Uma nota foi adicionada para verificar o uso de threads, sugerindo sincronização de métodos ou a utilização de estruturas thread-safe.
 *
 * ## Mapa de Caracteres Especiais
 * - **Atualização Necessária:**
 *   Recomenda-se manter o mapa de caracteres especiais atualizado conforme necessário.
 *
 * ---
 *
 * **Tecnologias Utilizadas:** Java, Padrão Singleton, Map, Boas Práticas de Codificação.
 */

