public class Main {
    public static void main(String[] args) {
        Patricia arv = new Patricia();
        String[] palavras = {
                "abacaxi", "abelha", "abobora", "academia", "acucar", "adeus", "agulha", "alface", "algodao", "alho",
                "alpiste", "amarelo", "amizade", "amor", "anjo", "aniversario", "aparelho", "arara", "arvore", "azul",
                "bacia", "bambu", "banana", "bandeira", "bacias", "barco", "batata", "beijo", "bicicleta", "bolo", "borboleta",
                "braco", "brinquedo", "cachorro", "cafe", "cadeira", "caju", "camisa", "caminhao", "campo", "caneta",
                "cantar", "carro", "casa", "casaco", "castelo", "cebola", "celular", "cenoura", "cidade", "cinema",
                "circo", "coelho", "comida", "computador", "coracao", "computado","corda", "corpo", "coruja", "crianca", "cristal",
                "dado", "dentro", "deus", "dia", "dinheiro", "dormir", "doce", "dragao", "duende", "elefante",
                "espada", "espelho", "estrela", "faca", "fada", "familia", "farinha", "fazenda", "festa", "fogo",
                "folha", "fonte", "formiga", "fruta", "galinha", "gato", "geleia", "gelo", "girafa", "golfinho",
                "grama", "guitarra", "helicoptero", "hospital", "hotel", "igreja", "ilha", "imaginacao", "indio", "inseto",
                "instrumento", "inverno", "janela", "jardim", "joia", "jornal", "juiz", "kiwi", "labirinto", "lago",
                "lapis", "laranja", "leao", "leite", "lenda", "limao", "linha", "liquido", "livro", "lua",
                "macaco", "macarrao", "maca", "madeira", "mae", "mala", "mamadeira", "mamute", "manga", "mao",
                "mapa", "mar", "mesa", "milho", "minhoca", "mochila", "montanha", "morango", "moto", "museu",
                "musica", "nadar", "navio", "neve", "noite", "nuvem", "oculos", "olho", "onda", "orelha",
                "ouro", "ovo", "padaria", "pais", "pao", "papel", "passaro", "pastel", "pato", "peixe",
                "pena", "pera", "perfume", "piano", "porta", "praia", "prato", "presente", "professor", "pudim",
                "quadro", "queijo", "rabisco", "radio", "raiz", "rato", "rede", "relogio", "rio", "roda",
                "rolo", "rosa", "roupa", "rua", "sabao", "saco", "sagui", "sal", "sapato", "semaforo",
                "serpente", "sol", "sono", "sorvete", "tigre", "tesoura", "telefone", "tempo", "terra", "tesouro",
                "teto", "tomate", "torre", "trabalho", "trem", "triangulo", "tubarao", "tunel", "uva", "vacina",
                "vaca", "vela", "vento", "verde", "vermelho", "vestido", "viagem", "violao", "volta", "xicara",
                "zebra", "zumbi"
        };

        for (String palavra : palavras)
            arv.inserir(palavra);

        System.out.println("Exibição por níveis:");
        arv.exibirPorNivel();

        System.out.println("\nPalavras armazenadas: ");
        arv.exibir();
    }
}