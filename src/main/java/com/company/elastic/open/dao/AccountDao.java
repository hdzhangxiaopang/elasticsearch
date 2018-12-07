package com.company.elastic.open.dao;

import com.company.elastic.open.entity.Account;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountDao extends ElasticsearchRepository<Account,Long> {
}
