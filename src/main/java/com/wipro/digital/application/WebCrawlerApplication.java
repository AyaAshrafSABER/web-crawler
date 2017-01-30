package com.wipro.digital.application;

import java.io.IOException;
import java.util.List;

import com.wipro.digital.crawler.WebCrawler;
import com.wipro.digital.crawler.impl.JsoupWebCrawler;

/**
 * Main class for executing the Jsoup web crawler
 * @author nitinprabhu
 */
public class WebCrawlerApplication
{
	public static void main(String args[]) throws IOException
	{
		WebCrawler webCrawler = new JsoupWebCrawler();

		List<String> urls = webCrawler.processPage("http://wiprodigital.com");

	}
}
