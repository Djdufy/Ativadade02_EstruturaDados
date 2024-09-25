# Algoritmos de ordenação em java
## Descrição do projeto

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

## ● Tabela comparativas

![Captura de tela 2024-02-27 235245](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/42d719a8-3c4c-40e7-a80c-a88236fcdc80)


![Captura de tela 2024-02-27 235301](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/4d434645-043a-4124-9868-659a45401bdc)

![Captura de tela 2024-02-27 235311](https://github.com/Djdufy/Ativadade02_EstruturaDados/assets/103465904/f661af59-007c-4ef6-92b4-470336b7bd14)


## ● Resultado de saida


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
   

   
    
    



