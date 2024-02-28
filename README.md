# Ativadade02_EstruturaDados
## Descrição da atividade

Desenvolva os algoritmos de ordenação, incluindo Bubble Sort, Insertion Sort, Selection Sort, Merge
Sort, Quick Sort e Heap Sort, para efetuar a ordenação de três vetores, cada um contendo um milhão
de números não repetidos, originados de um arquivo .txt. Os vetores a serem ordenados são: um vetor
já ordenado, um vetor invertido e um vetor aleatório.
Além da implementação dos algoritmos de ordenação, é imperativo que os mesmos realizem testes de
desempenho, fornecendo métricas essenciais, como a quantidade de comparações efetuadas, o
número de trocas realizadas e o tempo total de execução em segundos.
Antes de apresentar os resultados obtidos, faça uma descrição detalhada das especificações de sua
máquina. Inclua informações pertinentes ao hardware, como processador, quantidade de RAM e tipo de
armazenamento, além de detalhes sobre o sistema operacional em uso. Essas informações são cruciais
para uma análise comparativa, permitindo observar como as diferenças de hardware e sistemas
operacionais podem influenciar no desempenho dos algoritmos de ordenação.
A entrega dos resultados deve ser organizada e clara, incluindo tabelas ou gráficos para ilustrar os
dados coletados. Este exercício visa proporcionar uma compreensão mais profunda não apenas sobre a
implementação dos algoritmos de ordenação, mas também sobre o impacto das características do
hardware e do sistema operacional nos resultados obtidos.

### ● Características do computador:

- Marca: Lenovo

- Modelo: 82MFS00100

● Processador:
- Modelo: Ryzen 5-5500U
- Cores / Threads: HexaCore / 12 Threads
- Cache: 3MB L2 / 8MB L3
- Clock: 2.1GHZ (4.0GHZ Max Turbo)

● RAM:
- 8GB
- 4GB soldado DDR4-3200 + 4GB SO-DIMM DDR4-3200
- Expansível até 20GB (4GB soldado + 16GB SO-DIMM DDR4-3200)

● Armazenamento:

- SSD de 256 GB PCIe NVMe M.2
- Máxima expansão de armazenamento: "1x Slot 2.5"" HDD até 1TB + 1x Slot M.2 2242 SSD até 512GB ou M.2 2280 SSD até 1TB"

● Placa de vídeo:
- Integrada AMD Radeon Graphics

● Sistema Operacional:
-Windows 11

● Tela:
- 15.6"
- Full HD (1920 x 1080) Antirreflexo
- Formato de Tela: 16:9 widescreen
- Brilho da Tela: 250 nits
- Tipo de Painel: TN

- Abertura de Tela: 180 graus

● Conectividade:
- Wi-Fi: WiFi 2x2 AC
- Bluetooth: Bluetooth 5.0
- Audio (porta combo para headset/headphone): 1
- USB (3.2) Gen 1: 1
- USB (2.0): 1
- Leitor de Cartões: Leitor de Cartões 4 em 1 (SD, SDHC, SDXC, MMC)
- Saída HDMI ( 1.4b): 1

● Câmera:
- HD-720p com Privacidade

● Microfone:
- Microfone tipo Dual Array
Audio (alto-falantes):
- Alto-falantes (2 x 1.5W)

● Teclado e Touchpad:
- PTP Touchpad: 1
- Teclado Padrão Brasileiro: 1
- Teclado numérico: 1

● Energia:
- Bateria: 2 células 38Wh
- Bateria Removível: Não
- Adaptador AC: 65W

● Softwares:
- Lenovo Vantage, Lenovo App Explorer, Lenovo ID


## ● Codigo Java:

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        public class Atividade_02 {
        public static void main(String[] args) {
    
        int[] vetorOrdenado = lerVetor("vetor_ordenado.txt");
        int[] vetorInvertido = lerVetor("vetor_invertido.txt");
        int[] vetorAleatorio = lerVetor("vetor_aleatorio.txt");
        
        System.out.println("================================================================================");
        System.out.println("          ALGORITMOS DE ORDENAÇÃO COM 1 MILHÃO DE NÚMEROS TESTES                ");
        System.out.println("================================================================================\n");

        System.out.println("--------------------------------------------------------------------------------");
        bubbleSort(vetorAleatorio.clone(), "Vetor Aleatório");
        System.out.println("--------------------------------------------------------------------------------");
        bubbleSort(vetorInvertido.clone(), "Vetor Invertido");
        System.out.println("--------------------------------------------------------------------------------");
        bubbleSort(vetorOrdenado.clone(), "Vetor Ordenado");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("--------------------------------------------------------------------------------");
        insertionSort(vetorAleatorio.clone(), "Vetor Aleatório");
        System.out.println("--------------------------------------------------------------------------------");
        insertionSort(vetorInvertido.clone(), "Vetor Invertido");
        System.out.println("--------------------------------------------------------------------------------");
        insertionSort(vetorOrdenado.clone(), "Vetor Ordenado");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("--------------------------------------------------------------------------------");
        selectionSort(vetorAleatorio.clone(), "Vetor Aleatório");
        System.out.println("--------------------------------------------------------------------------------");
        selectionSort(vetorInvertido.clone(), "Vetor Invertido");
        System.out.println("--------------------------------------------------------------------------------");
        selectionSort(vetorOrdenado.clone(), "Vetor Ordenado");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("--------------------------------------------------------------------------------");
        mergeSort(vetorAleatorio.clone(), "Vetor Aleatório");
        System.out.println("--------------------------------------------------------------------------------");
        mergeSort(vetorInvertido.clone(), "Vetor Invertido");
        System.out.println("--------------------------------------------------------------------------------");
        mergeSort(vetorOrdenado.clone(), "Vetor Ordenado");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("--------------------------------------------------------------------------------");
        quickSort(vetorAleatorio.clone(), "Vetor Aleatório");
        System.out.println("--------------------------------------------------------------------------------");
        quickSort(vetorInvertido.clone(), "Vetor Invertido");
        System.out.println("--------------------------------------------------------------------------------");
        quickSort(vetorOrdenado.clone(), "Vetor Ordenado");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("--------------------------------------------------------------------------------");
        heapSort(vetorAleatorio.clone(), "Vetor Aleatório");
        System.out.println("--------------------------------------------------------------------------------");
        heapSort(vetorInvertido.clone(), "Vetor Invertido");
        System.out.println("--------------------------------------------------------------------------------");
        heapSort(vetorOrdenado.clone(), "Vetor Ordenado");
        System.out.println("--------------------------------------------------------------------------------\n");

    }

    public static int[] lerVetor(String nomeArquivo) {
        try {// bloco try e catch para capitura execoes caso tenha
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            int tamanho = 0;
            while (reader.readLine() != null) {
                tamanho++;
            }
            reader.close();

            int[] vetor = new int[tamanho];
            reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha;// será usada para armazenar cada linha lida do arquivo
            int i = 0;// vai servi para rastrea posicao do vetor
            while ((linha = reader.readLine()) != null) {// o readLine serve para retorna null quando todas as linhas
                // forem lidas
                vetor[i++] = Integer.parseInt(linha);// aqui eu incremento o i e converto o numero que estao no arquivo
                // para inteiro
            }
            reader.close();
            return vetor;
        } catch (IOException e) {// aqui eu mostro a exeção caso aconteca alguma coisa
            e.printStackTrace();
            return null;
        }
    }

    public static void bubbleSort(int[] vetor, String nomeVetor) {
        int n = vetor.length;
        long comparacoes = 0;
        long trocas = 0;
        long inicio = System.nanoTime();// vai servi para calcular o tempo em nanossegundo para depois convertermos para segundos

        for (int j = 1; j <= n; j++) {
            for (int i = n - 1; i >= j; i--) {
                comparacoes++;
                if (vetor[i] < vetor[i - 1]) {
                    trocas++;
                    int temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                }
            }
        }

        long fim = System.nanoTime();
        double tempoExecucao = (fim - inicio) / 1e9; // 1e9 equivale a 1 x 10 elevado a 9  que dividido na formula vai da um resultado em segundos

        System.out
                .println(nomeVetor + " Bubble Sort: \nComparações: " + comparacoes + "\nTrocas: " + trocas + "\nTempo: "
                        + tempoExecucao + " segundos");
    }

    public static void insertionSort(int[] vetor, String nomeVetor) {
        int n = vetor.length;
        long comparacoes = 0;
        long trocas = 0;
        long inicio = System.nanoTime();

        for (int i = 1; i < n; i++) {
            int eleito = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > eleito) {
                comparacoes++;
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = eleito;
            trocas++;
        }

        long fim = System.nanoTime();
        double tempoExecucao = (fim - inicio) / 1e9;

        System.out.println(
                nomeVetor + " Insertion Sort: \nComparações: " + trocas + "\nTrocas: " + comparacoes + "\nTempo: "
                        + tempoExecucao + " segundos");
    }

    public static void selectionSort(int[] vetor, String nomeVetor) {
        int n = vetor.length;
        long comparacoes = 0;
        long trocas = 0;
        long inicio = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            int menorIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (vetor[j] < vetor[menorIndex]) {
                    menorIndex = j;
                }
            }
            if (menorIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[menorIndex];
                vetor[menorIndex] = temp;
                trocas++;
            }
        }

        long fim = System.nanoTime();
        double tempoExecucao = (fim - inicio) / 1e9;

        System.out.println(nomeVetor + " - Selection Sort: ");
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
        System.out.println("Tempo: " + tempoExecucao + " segundos");
    }

    public static void mergeSort(int[] vetor, String nomeVetor) {
        int n = vetor.length;
        long[] comparacoes = new long[1];
        long[] trocas = new long[1];
        long inicio = System.nanoTime();

        mergeSortRecursivo(vetor, 0, n - 1, comparacoes, trocas);

        long fim = System.nanoTime();
        double tempoExecucao = (fim - inicio) / 1e9;

        System.out.println(
                nomeVetor + " Merge Sort: \nComparações: " + comparacoes[0] + "\nTrocas: " + trocas[0] + "\nTempo: "
                        + tempoExecucao + " segundos");
    }

    private static void mergeSortRecursivo(int[] vetor, int inicio, int fim, long[] comparacoes, long[] trocas) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortRecursivo(vetor, inicio, meio, comparacoes, trocas);
            mergeSortRecursivo(vetor, meio + 1, fim, comparacoes, trocas);
            merge(vetor, inicio, meio, fim, comparacoes, trocas);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim, long[] comparacoes, long[] trocas) {
        int[] temp = new int[vetor.length];
        for (int i = inicio; i <= fim; i++) {
            temp[i] = vetor[i];
        }

        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        while (i <= meio && j <= fim) {
            comparacoes[0]++;
            if (temp[i] <= temp[j]) {
                vetor[k++] = temp[i++];
            } else {
                vetor[k++] = temp[j++];
            }
            trocas[0]++;
        }

        while (i <= meio) {
            vetor[k++] = temp[i++];
            trocas[0]++;
        }
    }

    public static void quickSort(int[] vetor, String nomeVetor) {
        long[] comparacoes = new long[1]; // Array para armazenar o número de comparações
        long[] trocas = new long[1]; // Array para armazenar o número de trocas
        long inicio = System.nanoTime();

        quickSortRecursivo(vetor, 0, vetor.length - 1, comparacoes, trocas);

        long fim = System.nanoTime();
        double tempoExecucao = (fim - inicio) / 1e9;

        System.out.println(
                nomeVetor + " Quick Sort: \nComparações: " + comparacoes[0] + "\nTrocas: " + trocas[0] + "\nTempo: "
                        + tempoExecucao + " segundos");
    }

    private static void quickSortRecursivo(int[] vetor, int inicio, int fim, long[] comparacoes, long[] trocas) {
        if (inicio < fim) {
            int q = particao(vetor, inicio, fim, comparacoes, trocas);
            quickSortRecursivo(vetor, inicio, q, comparacoes, trocas);
            quickSortRecursivo(vetor, q + 1, fim, comparacoes, trocas);
        }
    }

    private static int particao(int[] vetor, int inicio, int fim, long[] comparacoes, long[] trocas) {
        int pivo = vetor[(inicio + fim) / 2];
        int i = inicio - 1;
        int j = fim + 1;

        while (true) {
            do {
                i++;
                comparacoes[0]++;
            } while (vetor[i] < pivo);

            do {
                j--;
                comparacoes[0]++;
            } while (vetor[j] > pivo);

            if (i < j) {
                trocas[0]++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            } else {
                return j;
            }
        }
    }

    public static void heapSort(int[] vetor, String nomeVetor) {
        long[] comparacoes = new long[1];
        long[] trocas = new long[1];
        long inicio = System.nanoTime();

        int n = vetor.length - 1;

        for (int i = n / 2; i >= 1; i--) {
            heapFica(vetor, i, n, comparacoes, trocas);
        }

        for (int i = n; i >= 2; i--) {
            int temp = vetor[1];
            vetor[1] = vetor[i];
            vetor[i] = temp;
            trocas[0]++;
            heapFica(vetor, 1, i - 1, comparacoes, trocas);
        }

        long fim = System.nanoTime();
        double tempoExecucao = (fim - inicio) / 1e9;

        System.out.println(
                nomeVetor + " Heap Sort: \nComparações: " + comparacoes[0] + "\nTrocas: " + trocas[0] + "\nTempo: "
                        + tempoExecucao + " segundos");
    }

    public static void heapFica(int[] vetor, int i, int fim, long[] comparacoes, long[] trocas) {
        int maior = i;
        int esquerda = 2 * i;
        int direita = 2 * i + 1;

        if (esquerda <= fim && vetor[esquerda] > vetor[maior]) {
            maior = esquerda;
        }

        comparacoes[0]++;

        if (direita <= fim && vetor[direita] > vetor[maior]) {
            maior = direita;
        }

        comparacoes[0]++;

        if (maior != i) {
            int temp = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = temp;
            trocas[0]++;
            heapFica(vetor, maior, fim, comparacoes, trocas);
        }
    }
    
}

## ● Tabelas 

![Captura de tela 2024-02-27 235245](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/42d719a8-3c4c-40e7-a80c-a88236fcdc80)


![Captura de tela 2024-02-27 235301](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/4d434645-043a-4124-9868-659a45401bdc)

![Captura de tela 2024-02-27 235311](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/f661af59-007c-4ef6-92b4-470336b7bd14)


## ● Codigo sendo Executado


![Captura de tela 2024-02-27 235601](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/337eb028-8670-4a87-ab89-c28255569a7f)

![Captura de tela 2024-02-27 235628](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/7795d70c-a14b-4bb5-a1bd-b4e2d8d94513)

![Captura de tela 2024-02-27 235651](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/c00a4fc3-cec0-4450-bf60-ada16eaef5fc)

![Captura de tela 2024-02-27 235704](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/0bd79bb3-e612-4e13-8b52-5160720de35b)

## ● Codigo para criação dos números em txt feito em python



### Gerar números ordenados
   
    with open('vetor_ordenado.txt', 'w') as f:
    for i in range(1, 1000001):
        f.write(str(i) + '\n')

### Gerar números invertidos

    with open('vetor_invertido.txt', 'w') as f:
    for i in range(1000000, 0, -1):
        f.write(str(i) + '\n')

### Gerar números aleatórios

    with open('vetor_aleatorio.txt', 'w') as f:
    for _ in range(1000000):
        f.write(str(random.randint(1, 1000000)) + '\n')
   

   
    
    



