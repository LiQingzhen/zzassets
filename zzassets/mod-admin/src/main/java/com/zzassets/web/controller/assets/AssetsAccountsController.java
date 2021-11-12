package com.zzassets.web.controller.assets;

import com.zzassets.assets.domain.AssetsAccount;
import com.zzassets.assets.service.IAssetsAccountsService;
import com.zzassets.common.core.controller.BaseController;
import com.zzassets.common.core.domain.AjaxResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test/assets/accounts")
public class AssetsAccountsController extends BaseController {

    private final IAssetsAccountsService accountService;
    public AssetsAccountsController(IAssetsAccountsService accountService) {
        this.accountService = accountService;
    }

//    @PreAuthorize("@ss.hasPermi('assets:accounts:list')")
    @GetMapping("list")
    public AjaxResult list(AssetsAccount account) {

        List<AssetsAccount> accounts = accountService.list(account);
        return AjaxResult.success(accounts);
    }

}
