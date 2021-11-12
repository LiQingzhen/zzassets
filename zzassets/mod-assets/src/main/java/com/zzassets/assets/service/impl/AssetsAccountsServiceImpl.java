package com.zzassets.assets.service.impl;

import com.zzassets.assets.domain.AssetsAccount;
import com.zzassets.assets.mapper.AssetsAccountsMapper;
import com.zzassets.assets.service.IAssetsAccountsService;
import com.zzassets.common.core.domain.entity.SysDictData;
import com.zzassets.system.mapper.SysDictDataMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsAccountsServiceImpl implements IAssetsAccountsService {

    private final AssetsAccountsMapper accountsMapper;
    private final SysDictDataMapper dictDataMapper;
    private final SysDictData dictData = new SysDictData("assets_accounts_type");
    public AssetsAccountsServiceImpl(AssetsAccountsMapper accountsMapper, SysDictDataMapper dictDataMapper) {
        this.accountsMapper = accountsMapper;
        this.dictDataMapper = dictDataMapper;
    }
    @Override
    public List<AssetsAccount> list(AssetsAccount account) {
        //  获取“资产账户分类”
        List<SysDictData> accountsTypes = dictDataMapper.selectDictDataList(dictData);

        return accountsMapper.list(account);
    }

}
