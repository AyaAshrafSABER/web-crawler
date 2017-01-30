package com.wipro.digital.crawler.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
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
	private static final String HREF = "href";
	private static final String A_HREF = "a[href]";
	private static final String WIPRODIGITAL_COM = "wiprodigital.com";
	private static final Logger logger = Logger.getLogger(JsoupWebCrawler.class);

	/**
	 * This method processes finds all the URL on the page for the given URL.It
	 * only provides a list of URL's for the given domain and not for external
	 * domains in the page. It stores the output to a file.
	 */
	public List<String> processPage(String url)
	{
		logger.info("URL passed to the web crawler is " + url);

		List<String> urls = new ArrayList<String>();

		try
		{
			Document document = Jsoup.connect(url).get();

			// Get all links on the web page
			Elements elements = document.select(A_HREF);

			for (Element link : elements)
			{
				String href = link.attr(HREF);

				if (href.contains(WIPRODIGITAL_COM) && !urls.contains(href))
				{
					urls.add(href);
				}
			}

			logger.info("List of URL returned by web crawler " + urls);

		}
		catch (IOException ioException)
		{
			logger.error("IOExcepion occured while processing web page url " + url + "Exception is " + ioException);
		}
		catch (Exception exception)
		{
			logger.error("Some excepion occured while processing web page url " + url + "Exception is " + exception);
		}
		return urls;

	}

}
