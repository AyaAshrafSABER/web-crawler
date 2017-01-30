package com.wipro.digital.application;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

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

		FileUtils.writeLines(new File("crawleroutputurllist.txt"), "UTF-8", urls);

	}
}
