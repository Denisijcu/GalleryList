package com.denisijcu.gallerylist.data

//noinspection SuspiciousImport


// Generate dummy data
fun getDummyPaintings(): List<Painting> {
    val paintings: MutableList<Painting> = ArrayList()
    paintings.add(
        Painting(
            0,
            "The Last Supper",
            "Leonardo da Vince",
            "The Last Supper, one of Leonardo da Vinci's most renowned masterpieces, is a captivating portrayal of the biblical scene depicting Jesus Christ's last meal with his apostles before his crucifixion. Painted between 1495 and 1498 on the wall of the refectory of the Convent of Santa Maria delle Grazie in Milan, Italy, this iconic artwork showcases da Vinci's exceptional talent and innovative techniques. The painting's composition, with Christ at the center and the apostles grouped around him in animated conversation, captures the emotional intensity and psychological depth of the moment. Da Vinci's meticulous attention to detail, from the expressions of the figures to the architectural elements in the background, imbues the scene with realism and drama, making it a timeless masterpiece that continues to captivate and inspire viewers centuries later.",
            0,
            review =
            Review(user = "John", content = "This is a beautiful painting",id=0)
        )
    )
    paintings.add(
        Painting(
            1,
            "Mona Lisa",
            "Leonardo da Vinci",
            "\"Mona Lisa,\" also known as \"La Gioconda,\" is arguably the most famous portrait ever created, crafted by the Italian Renaissance master Leonardo da Vinci around 1503-1506. Housed in the Louvre Museum in Paris, France, this enigmatic artwork depicts a serene and mysterious woman with an enigmatic smile that has fascinated viewers for centuries. Da Vinci's meticulous attention to detail, from the subtle play of light and shadow to the intricate rendering of textures, demonstrates his unparalleled mastery of the sfumato technique. The portrait's captivating aura lies not only in its technical brilliance but also in the elusive expression of the sitter, inviting endless speculation and interpretation. Mona Lisa's timeless allure continues to captivate art enthusiasts worldwide, solidifying its status as an enduring symbol of beauty, mystery, and artistic genius.",
            0,
            review = Review(user = "Jane", content = "This is a beautiful painting", id=1)


        )
    )
    paintings.add(
        Painting(
            2,
            "David",
            "Miguel Angelo",
            "\"David,\" sculpted by Michelangelo between 1501 and 1504, stands as a monumental symbol of Renaissance art and human perfection. Carved from a single block of marble, this awe-inspiring sculpture portrays the biblical hero David in a moment of contemplation and determination before his legendary battle with Goliath. Michelangelo's meticulous attention to anatomical detail, combined with his mastery of form and proportion, imbues the figure with a sense of strength, grace, and idealized beauty. Standing at over 17 feet tall, \"David\" exudes a powerful presence that captivates viewers with its sheer magnificence and emotional resonance. The sculpture's monumental scale and timeless elegance epitomize the artistic achievements of the Italian Renaissance, showcasing Michelangelo's unparalleled talent as a sculptor and reaffirming \"David\" as one of the most iconic works of art in history.",
            0,
            review = Review(user = "Mary", content = "This is a beautiful painting", id=2)

        )
    )
    paintings.add(
        Painting(
            3,
            "The Sistine Madonna ",
            "Raphael",
            " The Sistine Madonna.\n" +
                    "Raphael's emotional masterpiece. \n" +
                    "The Sistine Madonna is one of Raphael's most famous works. The painting takes its name from the church of San Sisto in Piacenza and Raphael painted it as the altarpiece for that church in 1513-1514. The two saints that feature in the painting, St Sixtus and St Barbara are the patron saints of the Benedictine San Sisto church, hence their inclusion in Raphael's magnificent masterpiece. The piece was bought in 1754 by King Augustus III of Saxony for his collection in Dresden. In Germany, the painting was very influential, sparking debate on the questions of art and religion.  ",
            0,
            review = Review(user = "Tom", content = "This is a beautiful painting", id=3)

        )
    )
    paintings.add(
        Painting(
            4,
            "Leonardo da Vinci today",
            "AI",
            "Leonardo da Vinci, a polymath of the Italian Renaissance, is celebrated as one of the most ingenious figures in history. Born on April 15, 1452, in Vinci, Italy, he demonstrated exceptional talent in various fields, including painting, sculpting, architecture, science, engineering, anatomy, and invention. Da Vinci's artistic masterpieces, such as the \"Mona Lisa\" and \"The Last Supper,\" showcase his profound understanding of human anatomy, perspective, and naturalistic depiction. Beyond art, his scientific inquiries and sketches anticipated many modern discoveries, ranging from anatomy to flight. Da Vinci's insatiable curiosity and visionary creativity continue to inspire generations, making him a timeless icon of human intellect and creativity.",
            0,
            review = Review(user = "Gust", content = "This is a beautiful painting", id=4)

        )
    )

    paintings.add(
        Painting(
            5,
            "Miguel Angelo today",
            "AI",
            "Michelangelo Buonarroti, commonly known as Michelangelo, was a towering figure of the Italian Renaissance, born on March 6, 1475, in Caprese, Italy. Renowned for his extraordinary talent in sculpture, painting, and architecture, Michelangelo left an indelible mark on the art world. His masterpieces include the iconic statue of \"David,\" a symbol of human strength and beauty, and the awe-inspiring frescoes of the Sistine Chapel ceiling in Vatican City, depicting scenes from the Book of Genesis. Michelangelo's architectural achievements include the magnificent dome of St. Peter's Basilica in Rome. His work exemplifies a profound understanding of human anatomy, emotional depth, and unparalleled skill in capturing the essence of his subjects. Michelangelo's legacy as one of the greatest artists of all time continues to inspire and captivate admirers worldwide.",
            0,
            review = Review(user = "John", content = "This is a beautiful painting", id=5)

        )
    )
    paintings.add(
        Painting(
            6,
            "Rapahel today",
            "AI",
            "Raphael, born Raffaello Sanzio da Urbino on April 6, 1483, in Urbino, Italy, was a leading figure of the Italian High Renaissance. Renowned for his exceptional talent in painting and his harmonious compositions, Raphael's work epitomized the ideals of beauty, grace, and balance. He gained recognition for his mastery of techniques such as sfumato, chiaroscuro, and perspective, which he employed to create lifelike and emotionally resonant portrayals of his subjects. Among his most celebrated works are the \"Madonnas,\" including the \"Sistine Madonna,\" \"The School of Athens,\" and \"The Transfiguration.\" Raphael's untimely death at the age of 37 in 1520 cut short a prolific career, but his contributions to art continue to influence generations of artists, earning him a lasting legacy as one of the greatest painters of the Renaissance period.",
            0,
            review = Review(user = "John", content = "This is a beautiful painting", id=6)

        )
    )
    return paintings
}
