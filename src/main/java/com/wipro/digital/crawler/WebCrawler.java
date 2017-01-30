package com.wipro.digital.crawler;

import java.util.List;

/**
 * @author nitinprabhu
 */
public interface WebCrawler
{
	List<String> processPage(String url);
}
