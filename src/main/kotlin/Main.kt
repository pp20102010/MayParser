package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get();
    val quotes = doc.select(".sc-2aegk7-2")
    for (quote in quotes) {
        println(quote.text())
    }
}