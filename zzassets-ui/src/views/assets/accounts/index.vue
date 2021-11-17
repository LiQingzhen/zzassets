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
            <p v-for="account in accounts.cash" :key="account.id" v-html="getHTML(account)" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">投资账户</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.invest" :key="account.id" v-html="getHTML(account)" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>  

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">网络账户</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.netaccount" :key="account.id" v-html="getHTML(account)" @click="pop(account.id)"></p>
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
            <p v-for="account in accounts.receive" :key="account.id" v-html="getHTML(account)" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col> 

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:green;font-size:16px">储蓄卡</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.debitcard" :key="account.id" v-html="getHTML(account)" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>

      <el-col span="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span style="color:red;font-size:16px">应付账户</span>
          </div>
          <div class="body">
            <p v-for="account in accounts.pay" :key="account.id" v-html="getHTML(account)" @click="pop(account.id)"></p>
          </div>
        </el-card>
      </el-col>   
    </el-row>
  </div>
</template>

<script>
import {formatterNumber} from "@/utils/ruoyi"
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.7.0",
      accounts: {
        cash: [
          {"id": "111", "icon": "el-icon-mianxingqianbao", "name": "现金", "color": "green", "rmb": 1028.54},
          {"id": "222", "icon": "el-icon-xianjinquan", "name": "电子现金", "color": "green", "rmb": 43.00 }
        ],
        debitcard: [
          {"id": "333", "icon": "el-icon-jiansheyinhang", "name": "建设银行", "color": "green", "rmb": 5000.00 },
          {"id": "444", "icon": "el-icon-gongshangyinhang", "name": "工商银行", "color": "green", "rmb": 3.79 },
          {"id": "555", "icon": "el-icon-jiaotongyinhang", "name": "交通银行", "color": "green", "rmb": 5369.19 },
          {"id": "666", "icon": "el-icon-zhaoshangyinhang", "name": "招商银行", "color": "green", "rmb": 4378.44 },
          {"id": "777", "icon": "el-icon-pufayinhang", "name": "浦发银行", "color": "green", "rmb": 5.00 }
        ],
        netaccount: [
          {"id": "333", "icon": "el-icon-zhifubao", "name": "支付宝", "color": "green", "rmb": 16.84 },
          {"id": "333", "icon": "el-icon-weixin", "name": "微信", "color": "green", "rmb": 365.54 }
        ],
        invest: [
          {"id": "333", "icon": "el-icon-yibaopingzheng", "name": "医保卡", "color": "green", "rmb": 2315.54 }
        ],
        receive: [
          {"id": "333", "icon": "el-icon-huangjin", "name": "投资", "color": "green", "rmb": 49253.87 },
          {"id": "333", "icon": "el-icon-shuipiaobaoxiao", "name": "待报销", "color": "green", "rmb": 1007.00 },
          {"id": "333", "icon": "el-icon-gongjijin", "name": "公积金", "color": "green", "rmb": 28423.47 }
        ],
        pay: [  
          {"id": "333", "icon": "el-icon-huabei", "name": "花呗", "color": "red", "rmb": -169.25 },
          {"id": "333", "icon": "el-icon-jingdong-", "name": "白条", "color": "red", "rmb": -0.00 },
          {"id": "333", "icon": "el-icon-037-parents", "name": "父母", "color": "red", "rmb": -0.00 },
          {"id": "333", "icon": "el-icon-keai", "name": "小可爱", "color": "red", "rmb": -4000.00 }
        ],
      },
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
    pop(val) {
      this.$message(val);
    },
    getHTML(val) {
      return "<div align='left' style='text-align:left'>"
      + "<i class='size-icon " + val.icon + "'></i>  " 
      + val.name +"</div><div align='right' style='text-align:right;color:"+ val.color +"'>" 
      + formatterNumber(val.rmb) + "</div><hr>"
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

