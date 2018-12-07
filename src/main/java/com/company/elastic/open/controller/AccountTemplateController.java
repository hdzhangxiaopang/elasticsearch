package com.company.elastic.open.controller;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/account/template")
public class AccountTemplateController {

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @GetMapping("/all")
    public List<Map<String, Object>> searchAll() {
        Client client = elasticsearchTemplate.getClient();
        SearchRequestBuilder srb = client.prepareSearch("bank").setTypes("_doc");
        SearchResponse sr = srb.setQuery(QueryBuilders.matchAllQuery()).execute().actionGet();
        SearchHits hits = sr.getHits();
        List<Map<String, Object>> list = new ArrayList<>();
        for (SearchHit hit : hits) {
            Map<String, Object> source = hit.getSourceAsMap();
            list.add(source);
        }
        return list;
    }
}
