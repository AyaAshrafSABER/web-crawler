package com.wipro.digital.crawler.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.wipro.digital.crawler.WebCrawler;
import com.wipro.digital.crawler.impl.JsoupWebCrawler;

public class WebCrawlerTest
{
	@Test
	public void test_process_page_when_url_is_passed_then_return_list_of_all_urls()
	{
		WebCrawler webCrawler = new JsoupWebCrawler();

		List<String> urls = webCrawler.processPage("http://wiprodigital.com");

		Assert.assertNotNull(urls);

	}

	@Test
	public void test_process_page_when_invalid_url_is_passed_then_return_empty_list()
	{
		WebCrawler webCrawler = new JsoupWebCrawler();

		List<String> urls = webCrawler.processPage(null);

		Assert.assertEquals(0, urls.size());

	}
}
