package com.zzassets.assets.service;

import com.zzassets.assets.domain.AssetsAccount;

import java.util.List;

public interface IAssetsAccountsService {

    List<AssetsAccount> list(AssetsAccount account);
}
