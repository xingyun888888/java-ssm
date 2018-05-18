package com.gaochao.test;

/**
 * Created by smileMAC on 18/5/15.
 */
public class MapayTest {
    public static void main(String[] args){
        String token = "16FUszJsmWcJIKU5aDzwNFNFpdm4poO0"; //记得更改 http://codepay.fateqq.com 后台可设置
        String codepay_id ="55603" ;//记得更改 http://codepay.fateqq.com 后台可获得

        String price="1"; //表单提交的价格
        String type="1"; //支付类型  1：支付宝 2：QQ钱包 3：微信
        String pay_id="aaa"; //支付人的唯一标识
        String param="bbb"; //自定义一些参数 支付后返回

        String notify_url="http://adding360.com";//通知地址
        String return_url="http://adding360.com";//支付后同步跳转地址

        if(price==null){
            price="1";
        }
        //参数有中文则需要URL编码
        String url="http://codepay.fateqq.com:52888/creat_order?id="+codepay_id+"&pay_id="+pay_id+"&price="+price+"&type="+type+"&token="+token+"&param="+param+"&notify_url="+notify_url+"&return_url="+return_url;
        System.out.println(url);
        if(token=="更改成您的token令牌"){
            System.out.println(token);
        }
    }
}
