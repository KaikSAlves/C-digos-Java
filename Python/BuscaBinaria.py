import tkinter as tk
from tkinter import messagebox, simpledialog
root = tk.Tk()
root.withdraw()

def ordenarVetor(vetor):
    n = len(vetor)

    for i in range(n - 1):
        for j in range(n - i - 1):
            if (vetor[j] > vetor[j + 1]) :
                vetor[j], vetor[j + 1] = vetor[j + 1], vetor[j]

def buscaBinaria(vetor, elemento):
    tamanhoVetor = len(vetor)
    meio = int(tamanhoVetor / 2)
    inicio = 0
    final = tamanhoVetor - 1

    while(meio > 0):
        meio = int((final + inicio) / 2)
        if(vetor[meio] == elemento):
            return meio
        else:
            if(vetor[meio] > elemento):
                final = meio
            elif(vetor[meio] < elemento):
                inicio = meio + 1
    return -1


resposta = messagebox.askyesno("App", "[yes] Para cadastrar um vetor, [no] Para usar um vetor ja cadastrado")

if resposta:
    v = []
    tamanhoVetor = int(input("tamanho: "))
    for i in range(tamanhoVetor):
        v.append(int(input(f"valor {i}:")))

vetorString = str(v)
print(f"Seu vetor: {vetorString}")

ordenarVetor(v)

print(f"vetor ordenado: {str(v)}")

numeroParaBusca = int(input("Numero para busca binaria: "))

indiceEncontrado = buscaBinaria( v , numeroParaBusca)

print(f"O numer desejado se encontra no indice: {indiceEncontrado} do vetor: {str(v)}")
root.destroy()