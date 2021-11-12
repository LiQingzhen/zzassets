package com.zzassets.assets.mapper;

import com.zzassets.assets.domain.AssetsAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetsAccountsMapper {

    List<AssetsAccount> list(AssetsAccount account);

}
