package com.wipro.digital.crawler.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.wipro.digital.crawler.WebCrawler;

/**
 * This class provides web crawler implementation using Jsoup library
 * @author nitinprabhu
 */
public class JsoupWebCrawler implements WebCrawler
{

	public List<String> processPage(String url)
	{

		List<String> urls = new ArrayList<String>();

		Document document;
		try
		{
			document = Jsoup.connect(url).get();
			// Get all links on the web page
			Elements elements = document.select("a[href]");

			for (Element link : elements)
			{
				String href = link.attr("href");

				if (href.contains("wiprodigital.com") && !urls.contains(href))
				{
					urls.add(href);
				}
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return urls;

	}

}
