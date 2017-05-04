package com.cjw.demo.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.common.params.SolrParams;

import java.io.IOException;

/**
 * Created by Javen on 2017/4/27.
 */
public class SolrUtil {
    private CloudSolrClient client;

    public void init() {
        CloudSolrClient.Builder server = new CloudSolrClient.Builder();
        server.withZkHost("192.168.0.1:3066");
        client = server.build();
    }

    public void query() {
        String param = "";
        SolrParams solrParams = new SolrQuery();
        try {
            client.query(solrParams);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void destroyMethod() {
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
