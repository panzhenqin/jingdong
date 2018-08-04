package com.itheima.controller;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Controller;

@Controller
public class JingdController {

    public void Ssdf() throws SolrServerException {
        String url = "http://localhost:8080/solr/product";
        SolrServer solrServer = new HttpSolrServer(url);

        SolrQuery solrQuery = new SolrQuery();


        QueryResponse response = solrServer.query(solrQuery);
        SolrDocumentList results = response.getResults();
        long numFound = results.getNumFound();
    }
}
