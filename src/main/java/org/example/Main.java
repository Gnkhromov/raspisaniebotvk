package org.example;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.messages.*;
import com.vk.api.sdk.queries.messages.MessagesGetLongPollHistoryQuery;
import org.jsoup.Jsoup;
public class Main {
    public static void main(String[] args) throws ClientException, ApiException, InterruptedException {
        TransportClient transportClient = new HttpTransportClient();
        VkApiClient vk = new VkApiClient(transportClient);
        Random rand = new Random();
        GroupActor actor = new GroupActor(217404554, "vk1.a.cYN-DlWvnytX0RKg2M3JqCSFJ_oBJa1BqyKvNb3sBLlATi0MnvE95YB-GaOjqhJfSoEsiBRnFqy8QYEiQo6lbNem9r12pAC-Fa3Il0WHtMYyyL8cH4kul0tVokebWuD3evpeXYvKkm9BD89PYun1ZnX4V4u9MB_RRyujL2U_XmoNANpSxNOxs7SXlCXs2WufNPp2QJzOIEyiBUE-vORs-A");
        Integer ts = vk.messages().getLongPollServer(actor).execute().getTs();
        while (true) {
            MessagesGetLongPollHistoryQuery historyQuery = vk.messages().getLongPollHistory(actor).ts(ts);
            List<Message> messages = historyQuery.execute().getMessages().getItems();
            if (!messages.isEmpty()) {
                messages.forEach(message -> {
                    System.out.println(message.toString());
                    try {
                        if (message.getText().equals("216")) {
                            //Подтяжка расписания
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=216").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            //Вывод расписания
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();

                        } else if (message.getText().equals("121")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=121").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        } else if (message.getText().equals("122")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=122").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("123")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=123").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("124")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=124").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("125")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=125").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }else if (message.getText().equals("126")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=126").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("127")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=127").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("21")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=21").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("22")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=22").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("211")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=211").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("212")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=212").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("213")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=213").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("214")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=214").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("215")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=215").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("11")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=11").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("12")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=12").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("301")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=301").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("302")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=302").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("303")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=303").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("304")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=304").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("305")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=305").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("306")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=306").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("01")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=01").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("02")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=02").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("491")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=491").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("492")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=492").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("493")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=493").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("494")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=494").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("495")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=495").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equals("496")) {
                            var doc = Jsoup.connect("https://raspkit.ru/?gr=496").get();
                            var zag = doc.select("title");
                            var d1 = doc.select("#weekd1");
                            var d2 = doc.select("#weekd2");
                            var d3 = doc.select("#weekd3");
                            var d4 = doc.select("#weekd4");
                            var d5 = doc.select("#weekd5");
                            var d6 = doc.select("#weekd6");
                            vk.messages().send(actor).message(zag.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d1.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d2.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d3.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d4.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d5.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                            vk.messages().send(actor).message(d6.text()).userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equalsIgnoreCase("замены"))
                        {
                            vk.messages().send(actor).message("http://service.spbcoit.ru:3080/replacements/view.html").userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                        else if (message.getText().equalsIgnoreCase("начать"))
                        {
                            vk.messages().send(actor).message("Введите номер группы, чтобы получить расписание; введите замены, чтобы получить замены").userId(message.getFromId()).randomId(rand.nextInt(1000000)).execute();
                        }
                    } catch (ApiException | ClientException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
            ts = vk.messages().getLongPollServer(actor).execute().getTs();
            //Чтобы не спамило
            Thread.sleep(1000);
        }
    }
}