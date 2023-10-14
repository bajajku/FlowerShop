package sheridan.bajajku.flowershop.data.local

import sheridan.bajajku.flowershop.domain.Flower


val fakeFlowerList: List<Flower> = listOf(
    Flower("aster",
        "Asters",
        2.99,
        "The name Aster comes from the Ancient Greek word meaning star, referring to the shape of the flower head.",
        "aster.jpeg"),
    Flower( "carnation",
        "Carnations",
        1.99,
        "Carnations require well-drained, neutral to slightly alkaline soil, and full sun. Examples include Gina Porto, Helen and Red Rocket",
        "carnation.jpeg"),
    Flower("daffodil",
        "Daffodils",
        1.99,
        "Daffodil is a common English name, sometimes used for all varieties, and commonly used by the American Daffodil Society",
        "daffodil.jpeg"),
    Flower( "rose",
        "Roses",
        4.99,
        "A rose is a woody perennial within the family Rosaceae. They form a group of erect shrubs, and climbing or trailing plants.",
        "rose.jpeg"),
    Flower("orchid",
        "Orchids",
        10.99,
        "The orchid family is a diverse and widespread family in the order Asparagales. It is one of the largest families of flowering plants.",
        "orchid.jpeg"),
)