package com.ilham.kuliner

object MenuMakananData {
    private val data = arrayOf(
        arrayOf(
            "Rendang",
            "Rendang is a traditional Indonesian dish, especially from the West Sumatra region. Rendang is a meat dish that is cooked with Indonesian spices such as lemongrass, galangal, red chili pepper, shallots, garlic, candlenut, and roasted peanuts, as well as coconut milk.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Rendang_daging_sapi_asli_Padang.JPG/375px-Rendang_daging_sapi_asli_Padang.JPG"
        ),
        arrayOf(
            "Tongseng",
            "Tongseng is a traditional Indonesian dish that originated from the Central Java region. Tongseng is a spicy soup-like dish made with meat, vegetables, and a blend of Indonesian spices. The most common meat used for tongseng is beef or mutton, but it can also be made with chicken.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Tongseng.jpg/330px-Tongseng.jpg"
        ),
        arrayOf(
            "Bakso",
            "Bakso is a popular Indonesian meatball dish made from ground beef or a mixture of beef and tapioca flour. The mixture is usually seasoned with garlic, shallots, salt, and pepper before being formed into small meatballs. Bakso meatballs are then boiled or steamed, and served in a bowl of flavorful broth made from beef bones, onions, garlic, and various spices.",
            "https://img.kurio.network/rE9S29CrLtZ_dW5BiVsp7RufHZw=/1200x1200/filters:quality(80)/https://kurio-img.kurioapps.com/21/11/15/2cbee642-ecd0-4f1f-9d0b-23acb574fe59.jpe"
        ),
        arrayOf(
            "Sate",
            "Sate or satay is a popular Indonesian dish made of skewered and grilled meat, usually served with a flavorful peanut sauce. Sate can be made from various types of meat such as chicken, beef, mutton, pork, or even goat. The meat is usually marinated with a mixture of spices and seasonings such as turmeric, coriander, cumin, and lemongrass before being skewered and grilled over hot charcoal.",
            "https://kbu-cdn.com/dk/wp-content/uploads/sate-ayam.jpg"
            ),
        arrayOf(
            "Gulai",
            "Gulai is a type of Indonesian curry dish that is popular in various parts of Indonesia, especially in Sumatra, West Java, and South Sulawesi. Gulai is made from a variety of ingredients such as meat, poultry, fish, vegetables, and sometimes tofu, cooked in a rich and spicy curry sauce.",
            "https://www.masakapahariini.com/wp-content/uploads/2018/04/resep-gulai-kambing-sederhana.jpg"
            ),
        arrayOf(
            "Pempek",
            "Pempek is a popular traditional Indonesian snack that originated from Palembang, South Sumatra. Pempek is made from a mixture of ground fish, usually mackerel or tenggiri, mixed with tapioca starch, garlic, salt, and water. The mixture is then formed into various shapes such as balls, cylinders, or flat cakes, and boiled or deep-fried until cooked.",
            "https://resepkoki.id/wp-content/uploads/2021/05/Resep-Pempek-Ayam-1.jpg"
            ),
        arrayOf(
            "Kerak Telor",
            "Kerak telor is a traditional Indonesian dish, popular in Jakarta and Betawi culture. It is a type of omelet made with a mixture of glutinous rice, eggs, and spices, cooked over a charcoal stove. The ingredients for kerak telor typically include sticky rice, eggs, dried shrimp, shallots, garlic, grated coconut, and a mixture of spices such as coriander, pepper, and turmeric.",
            "https://kbu-cdn.com/dk/wp-content/uploads/kerak-telor.jpg",
            ),
        arrayOf(
            "Gudeg",
            "Gudeg is a traditional Indonesian dish that originated from Yogyakarta, a city in Central Java. It is made from young jackfruit that has been cooked in coconut milk and palm sugar, along with various spices and seasonings such as bay leaves, galangal, garlic, and coriander. Gudeg has a sweet and savory flavor and a soft, tender texture.",
            "https://sumedang.jabarekspres.com/wp-content/uploads/2022/12/WhatsApp-Image-2022-12-29-at-13.17.11.jpeg"
            ),
        arrayOf(
            "Mie Aceh",
            "Mie Aceh is a spicy noodle dish that originated from the Aceh province in Indonesia. It is made with thin yellow noodles that are stir-fried with a variety of spices, seafood or meat, and vegetables.",
            "https://asset.kompas.com/crops/7tBNI9-TCa-oOq8tQTahf0ua1fg=/0x0:968x645/750x500/data/photo/2021/01/27/6010ce2cc1805.jpg"
            ),
        arrayOf(
            "Garang Asem",
            "Garang Asem is a traditional Indonesian soup dish that is typically sour and spicy in flavor. The dish is commonly found in the Central Java and East Java regions of Indonesia.",
            "https://rasabunda.com/wp-content/uploads/2021/05/Garang-asem-ayam.jpg"
            )
    )

    val listData: ArrayList<MenuMakanan>
        get() {
            val list = arrayListOf<MenuMakanan>()
            for (aData in data) {
                val hero = MenuMakanan()
                hero.namamakanan = aData[0]
                hero.descripsi = aData[1]
                hero.cover = aData[2]

                list.add(hero)
            }
            return list
        }
}