package com.example.estadosapp

object EstadoData {
    fun getEstados(): List<Estado> {
        return listOf(
            Estado("Acre", R.drawable.acre, "Rio Branco", "894,470", "Norte"),
            Estado("Alagoas", R.drawable.alagoas, "Maceió", "3,351,543", "Nordeste"),
            Estado("Amapá", R.drawable.amapa, "Macapá", "861,773", "Norte"),
            Estado("Amazonas", R.drawable.amazonas, "Manaus", "4,144,597", "Norte"),
            Estado("Bahia", R.drawable.bahia, "Salvador", "14,930,634", "Nordeste"),
            Estado("Ceará", R.drawable.ceara, "Fortaleza", "9,240,580", "Nordeste"),
            Estado("Distrito Federal", R.drawable.distrito_federal, "Brasília", "3,055,149", "Centro-Oeste"),
            Estado("Espírito Santo", R.drawable.espirito_santo, "Vitória", "4,064,052", "Sudeste"),
            Estado("Goiás", R.drawable.goias, "Goiânia", "7,206,589", "Centro-Oeste"),
            Estado("Maranhão", R.drawable.maranhao, "São Luís", "7,153,262", "Nordeste"),
            Estado("Mato Grosso", R.drawable.mato_grosso, "Cuiabá", "3,567,234", "Centro-Oeste"),
            Estado("Mato Grosso do Sul", R.drawable.mato_grosso_do_sul, "Campo Grande", "2,809,394", "Centro-Oeste"),
            Estado("Minas Gerais", R.drawable.minas_gerais, "Belo Horizonte", "21,292,666", "Sudeste"),
            Estado("Pará", R.drawable.para, "Belém", "8,690,745", "Norte"),
            Estado("Paraíba", R.drawable.paraiba, "João Pessoa", "4,039,277", "Nordeste"),
            Estado("Paraná", R.drawable.parana, "Curitiba", "11,516,840", "Sul"),
            Estado("Pernambuco", R.drawable.pernambuco, "Recife", "9,616,621", "Nordeste"),
            Estado("Piauí", R.drawable.piaui, "Teresina", "3,289,290", "Nordeste"),
            Estado("Rio de Janeiro", R.drawable.rio_de_janeiro, "Rio de Janeiro", "17,366,189", "Sudeste"),
            Estado("Rio Grande do Norte", R.drawable.rio_grande_do_norte, "Natal", "3,534,165", "Nordeste"),
            Estado("Rio Grande do Sul", R.drawable.rio_grande_do_sul, "Porto Alegre", "11,466,630", "Sul"),
            Estado("Rondônia", R.drawable.rondonia, "Porto Velho", "1,815,278", "Norte"),
            Estado("Roraima", R.drawable.roraima, "Boa Vista", "631,181", "Norte"),
            Estado("Santa Catarina", R.drawable.santa_catarina, "Florianópolis", "7,338,473", "Sul"),
            Estado("São Paulo", R.drawable.sao_paulo, "São Paulo", "46,289,333", "Sudeste"),
            Estado("Sergipe", R.drawable.sergipe, "Aracaju", "2,338,474", "Nordeste"),
            Estado("Tocantins", R.drawable.tocantins, "Palmas", "1,607,363", "Norte")
        )
    }
}
