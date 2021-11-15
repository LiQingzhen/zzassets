<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="24">
        <div style="font-size:25px;text-align:center">资产 负债 净资产</div>
      </el-col>
    </el-row>
  
    <el-divider />
    <el-row :gutter="20">
      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">现金</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.cash" :key="account.id" v-html="account.html" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">投资账户</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.invest" :key="account.id" v-html="account.html" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>  

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">网络账户</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.netaccount" :key="account.id" v-html="account.html" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>          
    </el-row>

    <el-divider />
    <el-row :gutter="20">

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">应收账户</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.receive" :key="account.id" v-html="account.html" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col> 

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">储蓄卡</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.debitcard" :key="account.id" v-html="account.html" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:red;font-size:16px">应付账户</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.pay" :key="account.id" v-html="account.html" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>   
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.7.0",
      accounts: {
        cash: [
          {"id": "111", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-mianxingqianbao'></i>  现金</div><div align='right' style='text-align:right;color:green'>100003.00</div><hr>"},
          {"id": "222", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-xianjinquan'></i> 电子现金</div><div align='right' style='text-align:right;color:green'>1005603.54</div><hr>"}
        ],
        debitcard: [
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-jiansheyinhang'></i> 建设银行</div><div align='right' style='text-align:right;color:green'>15603.12</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-gongshangyinhang'></i> 工商银行</div><div align='right' style='text-align:right;color:green'>15603.23</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-jiaotongyinhang'></i> 交通银行</div><div align='right' style='text-align:right;color:green'>15603.01</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-zhaoshangyinhang'></i> 招商银行</div><div align='right' style='text-align:right;color:green'>15603.00</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-pufayinhang'></i> 浦发银行</div><div align='right' style='text-align:right;color:green'>156.03</div><hr>"}
        ],
        netaccount: [
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-zhifubao'></i> 支付宝</div><div align='right' style='text-align:right;color:green'>156.03</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-weixin'></i> 微信</div><div align='right' style='text-align:right;color:green'>156.03</div><hr>"}
        ],
        invest: [
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-yibaopingzheng'></i> 医保卡</div><div align='right' style='text-align:right;color:green'>156.03</div><hr>"}
        ],
        receive: [
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-huangjin'></i> 投资</div><div align='right' style='text-align:right;color:green'>156.03</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-shuipiaobaoxiao'></i> 待报销</div><div align='right' style='text-align:right;color:green'>156.03</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-gongjijin'></i> 公积金</div><div align='right' style='text-align:right;color:green'>156.03</div><hr>"}

        ],
        pay: [
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-huangjin'></i> 投资</div><div align='right' style='text-align:right;color:red'>-156.03</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-huabei'></i> 花呗</div><div align='right' style='text-align:right;color:red'>-156.03</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-jingdong-'></i> 白条</div><div align='right' style='text-align:right;color:red'>-856.03</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-037-parents'></i> 父母</div><div align='right' style='text-align:right;color:red'>-8.68</div><hr>"},
          {"id": "333", "html": "<div align='left' style='text-align:left'><i class='size-icon el-icon-keai'></i> 小可爱</div><div align='right' style='text-align:right;color:red'>-0.79</div><hr>"},
        ],
      }
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
    pop(val) {
      this.$message(val);
    }
  },
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

